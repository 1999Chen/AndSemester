package com.example.andsemester;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    OverviewAdapter overviewAdapter;
    TextView date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd");
        String datetime = tempDate.format(new java.util.Date());

        date=findViewById(R.id.current_date);
        recyclerView = findViewById(R.id.view);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        date.setText(datetime);
        ArrayList<Event> list=new ArrayList<>();
        list.add(new Event("event1","date1","time1","time2","haha"));
        list.add(new Event("go die","date2","time3","time4","yoyo"));
        list.add(new Event("play","date3","time3","time4","halo"));

        list.add(new Event("event1","date1","time1","time2","haha"));
        list.add(new Event("go die","date2","time3","time4","yoyo"));
        list.add(new Event("play","date3","time3","time4","halo"));

        list.add(new Event("event1","date1","time1","time2","haha"));
        list.add(new Event("go die","date2","time3","time4","yoyo"));
        list.add(new Event("play","date3","time3","time4","halo"));

        list.add(new Event("event1","date1","time1","time2","haha"));
        list.add(new Event("go die","date2","time3","time4","yoyo"));
        list.add(new Event("play","date3","time3","time4","halo"));

        list.add(new Event("event1","date1","time1","time2","haha"));
        list.add(new Event("go die","date2","time3","time4","yoyo"));
        list.add(new Event("play","date3","time3","time4","halo"));



        overviewAdapter =new OverviewAdapter(list);
        recyclerView.setAdapter(overviewAdapter);


    }























}