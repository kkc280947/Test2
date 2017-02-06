package com.example.cbluser3.test2.activity;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.cbluser3.test2.adapters.MyTabAdapter;
import com.example.cbluser3.test2.R;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager pager;
    MyTabAdapter myTabAdapter;
    Toolbar toolbar;
    CollapsingToolbarLayout collapseTool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        tab=(TabLayout)findViewById(R.id.tlTab);
        pager=(ViewPager)findViewById(R.id.pager);
        toolbar=(Toolbar)findViewById(R.id.tbTool);
        collapseTool=(CollapsingToolbarLayout)findViewById(R.id.ctbTool);

        collapseTool.setTitleEnabled(false);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);

        myTabAdapter=new MyTabAdapter(getSupportFragmentManager(),3);
        pager.setAdapter(myTabAdapter);
        tab.setupWithViewPager(pager);


    }
}
