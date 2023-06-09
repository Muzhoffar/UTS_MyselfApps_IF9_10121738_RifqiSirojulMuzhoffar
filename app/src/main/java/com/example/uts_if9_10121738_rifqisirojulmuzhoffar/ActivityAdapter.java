package com.example.uts_if9_10121738_rifqisirojulmuzhoffar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.myviewholder> {

    ArrayList<ActivityModel> ActivityModel;

    public ActivityAdapter(ArrayList<ActivityModel> ActivityModel) {
        this.ActivityModel = ActivityModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_activity, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.ivDaily.setImageResource(ActivityModel.get(position).getImage());
        holder.tvTitle.setText(ActivityModel.get(position).getTitle());
        holder.tvDesc.setText(ActivityModel.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return ActivityModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView ivDaily;
        TextView tvTitle, tvDesc;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            ivDaily = itemView.findViewById(R.id.iv_daily);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDesc = itemView.findViewById(R.id.tv_desc);
        }
    }
}
