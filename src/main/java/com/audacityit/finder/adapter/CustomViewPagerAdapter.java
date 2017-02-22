package com.audacityit.finder.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.audacityit.finder.fragment.HomeFragment;

/**
 * Returns a fragment for each of the tabs.
 */
public class CustomViewPagerAdapter extends FragmentPagerAdapter {

    public CustomViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 1){
            return HomeFragment.newInstance(1);
        } else {
            return HomeFragment.newInstance(2);
        }
    }

    @Override
    public int getCount() {
        // Returns the number of fragments based on the number of tabs.
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String sTabName;
        switch (position) {
            case 0:
            default:
                sTabName = "Home";
                break;
            case 1:
                sTabName = "Get More...";
        }
        return sTabName;
    }
}
