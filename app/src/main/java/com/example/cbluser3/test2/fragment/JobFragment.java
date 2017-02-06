package com.example.cbluser3.test2.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cbluser3.test2.model.JobModel;
import com.example.cbluser3.test2.adapters.MyJobListAdapter;
import com.example.cbluser3.test2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbluser3 on 6/2/17.
 */
public class JobFragment extends Fragment {
    RecyclerView recyclerView;
    List<JobModel> jobList=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.job_fragment,container,false);

        recyclerView=(RecyclerView)view.findViewById(R.id.rvJob);
        if(jobList.isEmpty()){
            jobList.add(new JobModel("CodeBrew","2012-2015"));
            jobList.add(new JobModel("CodeBrew","2012-2015"));
            jobList.add(new JobModel("CodeBrew","2012-2015"));
            jobList.add(new JobModel("CodeBrew","2012-2015"));
            jobList.add(new JobModel("CodeBrew","2012-2015"));
            jobList.add(new JobModel("CodeBrew","2012-2015"));
            jobList.add(new JobModel("CodeBrew","2012-2015"));
            jobList.add(new JobModel("CodeBrew","2012-2015"));
            jobList.add(new JobModel("CodeBrew","2012-2015"));
            jobList.add(new JobModel("CodeBrew","2012-2015"));
            jobList.add(new JobModel("CodeBrew","2012-2015"));
            jobList.add(new JobModel("CodeBrew","2012-2015"));
        }

        MyJobListAdapter jobListAdapter=new MyJobListAdapter(getActivity(),jobList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(jobListAdapter);
        return view;
    }
}
