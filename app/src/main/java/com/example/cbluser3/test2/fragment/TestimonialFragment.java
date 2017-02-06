package com.example.cbluser3.test2.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cbluser3.test2.adapters.MyTestimoListAdapter;
import com.example.cbluser3.test2.R;
import com.example.cbluser3.test2.model.TestimonialModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cbluser3 on 6/2/17.
 */
public class TestimonialFragment extends Fragment {
    RecyclerView recyclerViewTesti;
    List<TestimonialModel> testimonialModelList=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.testimonial_fragment,container,false);

        recyclerViewTesti=(RecyclerView)view.findViewById(R.id.rvTesti);
        if(testimonialModelList.isEmpty()){
            testimonialModelList.add(new  TestimonialModel("CodeBrew","An intent contains the action and optionally additional data. The data can be passed to other activity using intent putExtra() method. Data is passed as extras and are key/value pairs. The key is always a String. As value you can use the primitive data types int, float, chars, etc. ","6 Days Ago"));
            testimonialModelList.add(new  TestimonialModel("Krish","An intent contains the action and optionally additional data. The data can be passed to other activity using intent putExtra() method. Data is passed as extras and are key/value pairs. The key is always a String. As value you can use the primitive data types int, float, chars, etc. ","6 Days Ago"));
            testimonialModelList.add(new  TestimonialModel("AWS","An intent contains the action and optionally additional data. The data can be passed to other activity using intent putExtra() method. Data is passed as extras and are key/value pairs. The key is always a String. As value you can use the primitive data types int, float, chars, etc. ","6 Days Ago"));
            testimonialModelList.add(new  TestimonialModel("HTC","An intent contains the action and optionally additional data. The data can be passed to other activity using intent putExtra() method. Data is passed as extras and are key/value pairs. The key is always a String. As value you can use the primitive data types int, float, chars, etc. ","6 Days Ago"));
            testimonialModelList.add(new  TestimonialModel("Code Labs","An intent contains the action and optionally additional data. The data can be passed to other activity using intent putExtra() method. Data is passed as extras and are key/value pairs. The key is always a String. As value you can use the primitive data types int, float, chars, etc. ","6 Days Ago"));
            testimonialModelList.add(new  TestimonialModel("Code Chef","An intent contains the action and optionally additional data. The data can be passed to other activity using intent putExtra() method. Data is passed as extras and are key/value pairs. The key is always a String. As value you can use the primitive data types int, float, chars, etc. ","6 Days Ago"));

        }

        MyTestimoListAdapter testimonialListAdapter=new MyTestimoListAdapter(getActivity(),testimonialModelList);
        recyclerViewTesti.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        recyclerViewTesti.setAdapter(testimonialListAdapter);
        return view;
    }
}
