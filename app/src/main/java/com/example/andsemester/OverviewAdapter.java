package com.example.andsemester;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class OverviewAdapter extends RecyclerView.Adapter<OverviewAdapter.ViewHolder>
{

      private Event event;
      private ArrayList<Event> list;

      public OverviewAdapter(ArrayList<Event> list) {
            this.list = list;
      }

      @NonNull
      @Override
      public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater=LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.event_list_item,parent,false);
            return new ViewHolder(view);
      }

      @Override
      public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.name.setText(list.get(position).getName());
            holder.date.setText(list.get(position).getDate());
            holder.startTime.setText(list.get(position).getStartTime());
            holder.endTime.setText(list.get(position).getEndTime());
            holder.description.setText(list.get(position).getDescription());
      }

      @Override
      public int getItemCount() {
            return list.size();
      }


      public class ViewHolder extends RecyclerView.ViewHolder{

            TextView name;
            TextView date;
            TextView startTime;
            TextView endTime;
            TextView description;

            public ViewHolder(View itemView) {
                  super(itemView);
                  name=itemView.findViewById(R.id.name);
                  date=itemView.findViewById(R.id.date);
                  startTime=itemView.findViewById(R.id.startTime);
                  endTime=itemView.findViewById(R.id.endTime);
                  description=itemView.findViewById(R.id.description);

            }
      }
}