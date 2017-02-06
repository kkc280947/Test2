package com.example.cbluser3.test2.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cbluser3.test2.R;
import com.example.cbluser3.test2.model.JobModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbluser3 on 6/2/17.
 */
public class MyJobListAdapter extends RecyclerView.Adapter<MyJobListAdapter.RecyclerViewHolder> {
    Activity activity;
    List<JobModel> jobList=new ArrayList<>();
    public MyJobListAdapter(Activity activity, List<JobModel> jobList){
        this.activity=activity;
        this.jobList=jobList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(LayoutInflater.from(activity).inflate(R.layout.job_item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tvJobTitle.setText(jobList.get(position).jobName);
        holder.tvJobYear.setText(jobList.get(position).jobYear);
    }

    @Override
    public int getItemCount() {
        return jobList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvJobTitle;
        TextView tvJobYear;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tvJobTitle=(TextView)itemView.findViewById(R.id.tvJobTitle);
            tvJobYear=(TextView)itemView.findViewById(R.id.tvJobYear);
        }
    }
}
