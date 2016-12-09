package com.example.namercx.mytablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MyAdapter mMyAdapter;
    TabLayout mTabLayout;
    ViewPager mViewPager;
    List<Fragment> mFragments;
    String[] mText = new String[]{"第一个Tab","第二个Tab","第三个Tab","第四个Tab","第五个Tab",
            "第六个Tab","第七个Tab","第八个Tab","第九个Tab","第十个Tab"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        mFragments = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            mFragments.add(new MyFragment(mText[i]));

        mMyAdapter = new MyAdapter(getSupportFragmentManager());
        mMyAdapter.setText(mText);
        mMyAdapter.setFragments(mFragments);

        mViewPager = (ViewPager) findViewById(R.id.main_viewpaper);
        mViewPager.setAdapter(mMyAdapter);

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
