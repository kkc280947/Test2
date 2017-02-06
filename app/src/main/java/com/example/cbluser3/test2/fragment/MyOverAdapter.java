package com.example.cbluser3.test2.fragment;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cbluser3.test2.R;
import com.example.cbluser3.test2.model.OverViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by cbluser3 on 6/2/17.
 */
public class MyOverAdapter extends RecyclerView.Adapter<MyOverAdapter.RecyclerViewHolder> {
    Activity activity;
    List<OverViewModel> overViewModelList=new ArrayList<>();

    public MyOverAdapter(Activity activity, List<OverViewModel> overViewModelList) {
        this.activity=activity;
        this.overViewModelList=overViewModelList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(LayoutInflater.from(activity).inflate(R.layout.item_overview,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tvExpYear.setText(overViewModelList.get(position).year);
        holder.tvExpPlace.setText(overViewModelList.get(position).place);
        holder.tvExpPos.setText(overViewModelList.get(position).position);

    }

    @Override
    public int getItemCount() {
        return overViewModelList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvExpYear;
        TextView tvExpPlace;
        TextView tvExpPos;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tvExpYear=(TextView)itemView.findViewById(R.id.tvExpYear);
            tvExpPlace=(TextView)itemView.findViewById(R.id.tvExpPlace);
            tvExpPos=(TextView)itemView.findViewById(R.id.tvExpPos);
        }
    }
}
