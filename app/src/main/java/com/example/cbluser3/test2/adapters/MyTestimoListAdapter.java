package com.example.cbluser3.test2.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cbluser3.test2.R;
import com.example.cbluser3.test2.model.TestimonialModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbluser3 on 6/2/17.
 */
public class MyTestimoListAdapter extends RecyclerView.Adapter<MyTestimoListAdapter.RecyclerViewHolder> {

    Activity activity;
    List<TestimonialModel> testimonialModelList=new ArrayList<>();
    public MyTestimoListAdapter(Activity activity, List<TestimonialModel> jobList){
        this.activity=activity;
        this.testimonialModelList=jobList;
    }

    @Override
    public MyTestimoListAdapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyTestimoListAdapter.RecyclerViewHolder(LayoutInflater.from(activity).inflate(R.layout.testimoial_item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tvTestiName.setText(testimonialModelList.get(position).testiName);
        holder.tvContent.setText(testimonialModelList.get(position).content);
        holder.tvTestiTime.setText(testimonialModelList.get(position).testiDay);
    }


    @Override
    public int getItemCount() {
        return testimonialModelList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvTestiName;
        TextView tvContent;
        TextView tvTestiTime;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tvTestiName=(TextView)itemView.findViewById(R.id.tvTestiName);
            tvContent=(TextView)itemView.findViewById(R.id.tvContent);
            tvTestiTime=(TextView)itemView.findViewById(R.id.tvTestiDay);
        }
    }
}
