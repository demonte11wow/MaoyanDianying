package com.example.johnsnow.maoyandianying.cinema.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.johnsnow.maoyandianying.cinema.fragment.QuyuFragment1;
import com.example.johnsnow.maoyandianying.cinema.fragment.QuyuFragment2;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2016/10/6.
 */
public class CommunityViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList = new ArrayList<>();
    private String[] titles = new String[]{"新帖", "热帖"};

    public CommunityViewPagerAdapter(FragmentManager fm) {
        super(fm);
        initFragments();
    }

    private void initFragments() {
        QuyuFragment1 newPostFragment = new QuyuFragment1();
        QuyuFragment2 hotPostFragment = new QuyuFragment2();
        fragmentList.add(newPostFragment);
        fragmentList.add(hotPostFragment);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList == null ? 0 : fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
