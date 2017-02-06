package com.example.cbluser3.test2.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.cbluser3.test2.fragment.JobFragment;
import com.example.cbluser3.test2.fragment.OverviewFragment;
import com.example.cbluser3.test2.fragment.TestimonialFragment;

/**
 * Created by cbluser3 on 6/2/17.
 */
public class MyTabAdapter extends FragmentPagerAdapter{

    int tabCount;
    public MyTabAdapter(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        this.tabCount=tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new OverviewFragment();

            case 1:return new JobFragment();

            case 2:return new TestimonialFragment();

            default: return null;

        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:return "Overview";

            case 1:return  "Jobs";

            case 2:return  "Testimonials";

            default:return null;
        }

    }
}
