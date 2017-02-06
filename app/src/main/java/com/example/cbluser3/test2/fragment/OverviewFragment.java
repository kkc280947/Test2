package com.example.cbluser3.test2.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cbluser3.test2.R;
import com.example.cbluser3.test2.model.OverViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbluser3 on 6/2/17.
 */
public class OverviewFragment extends Fragment {
    RecyclerView overViewRecycler;
    List<OverViewModel> overViewModelList =new ArrayList<>();
    OverViewModel model;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.overview_fragment,container,false);
       overViewRecycler=(RecyclerView)view.findViewById(R.id.rvOverView);
        if(overViewModelList.isEmpty()) {
            overViewModelList.add(new OverViewModel("2012-2013", "Code Brew Labs", "Software Trainee"));

            overViewModelList.add(new OverViewModel("2012-2013", "Code Brew Labs", "Software Trainee"));
        }
        MyOverAdapter myOverAdapter=new MyOverAdapter(getActivity(),overViewModelList);
        overViewRecycler.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        overViewRecycler.setAdapter(myOverAdapter);




        return view;
    }
}
