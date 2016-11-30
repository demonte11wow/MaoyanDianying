package com.example.johnsnow.maoyandianying.film;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.film.fragment.Daiyingragment;
import com.example.johnsnow.maoyandianying.film.fragment.FragmentRevealExample;
import com.example.johnsnow.maoyandianying.film.fragment.ReyingFragment;
import com.example.johnsnow.maoyandianying.film.fragment.ZhaopianFragment;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;

/**
 * Created by JohnSnow on 2016/11/30.
 */
public class FilmFragment extends BaseFragment implements View.OnClickListener{
    SlidingTabLayout slidingTabLayout;
    ViewPager viewPager;
    ArrayList<Fragment> fragmentList;
    RelativeLayout search;

    @Override
    public View initView() {
        View view = View.inflate(getContext(), R.layout.film_fragment,null);
        slidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.tl_1);
        viewPager = (ViewPager) view.findViewById(R.id.vb_film);
        search = (RelativeLayout) view.findViewById(R.id.vb_search);
        search.setOnClickListener(this);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        String[] titles = {"待映","热映","找片"};
        initFragment();
        slidingTabLayout.setViewPager(viewPager,titles,getActivity(),fragmentList);
    }

    private void initFragment() {
        fragmentList = new ArrayList<>();
        Daiyingragment dai = new Daiyingragment();
        ReyingFragment re = new ReyingFragment();
        ZhaopianFragment zh = new ZhaopianFragment();
        fragmentList.add(dai);
        fragmentList.add(re);
        fragmentList.add(zh);
    }

    @Override
    public void onClick(View v) {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .add(android.R.id.content, new FragmentRevealExample(), "fragment_my")
                .addToBackStack("fragment:reveal")
                .commit();
    }

}
