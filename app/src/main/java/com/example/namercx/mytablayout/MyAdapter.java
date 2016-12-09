package com.example.namercx.mytablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by namercx on 2016/12/8.
 */

public class MyAdapter extends FragmentPagerAdapter{
    String[] mText;
    List<Fragment> mFragments;

    public MyAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    public void setText(String[] text) {
        mText = text;
    }
    public void setFragments(List<Fragment> fragments) {
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mText[position];
    }
}
