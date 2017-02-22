package com.audacityit.finder.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.audacityit.finder.R;

/**
 * Created by pooja on 2/15/2017.
 */

public class CustomPagerAdapter extends PagerAdapter {

    private LayoutInflater mLayoutInflater;
    private Context mContext;

    public CustomPagerAdapter(Context context){
        mContext = context;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        if (mLayoutInflater == null) {
            mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        View currentView = mLayoutInflater.inflate(R.layout.fragment_tab_home, container, false);
        switch (position){
            case 0:
                View homeView = mLayoutInflater.inflate(R.layout.fragment_tab_home, container, false);
                //Add click handlers here
                currentView = homeView;
                container.addView(homeView);
                break;
            case 1:
                View getMoreView = mLayoutInflater.inflate(R.layout.fragment_home_get_more, container, false);;
                currentView = getMoreView;
                container.addView(getMoreView);
                break;
        }
        return currentView;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title = "Home";
        switch(position){
            case 0:
                title = "Home";
                break;
            case 1:
                title = "Get More..";
        }
        return title;
    }
}
