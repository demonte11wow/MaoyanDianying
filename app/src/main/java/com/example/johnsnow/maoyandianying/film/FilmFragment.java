package com.example.johnsnow.maoyandianying.film;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.film.fragment.FindResouceFragment;
import com.example.johnsnow.maoyandianying.film.fragment.FragmentRevealExample;
import com.example.johnsnow.maoyandianying.film.fragment.HotFragment;
import com.example.johnsnow.maoyandianying.film.fragment.SoonComeFragment;
import com.example.johnsnow.maoyandianying.film.transform.ZoomOutPageTransformer;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;

/**
 * Created by JohnSnow on 2016/11/30.
 */
public class FilmFragment extends BaseFragment implements View.OnClickListener{
    SlidingTabLayout slidingTabLayout;
    RecyclerView re;
    ViewPager viewPager;
    ArrayList<Fragment> fragmentList;
    RelativeLayout search;
    private boolean hadIntercept;

    @Override
    public boolean onBackPressed() {
        if(hadIntercept){
            return false;
        }else{
            Toast.makeText(getActivity(), "Click From MyFragment", Toast.LENGTH_SHORT).show();
            hadIntercept = true;
            return true;
        }
    }

    @Override
    public View initView() {
        View view = View.inflate(getContext(), R.layout.film_fragment,null);
        slidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.tl_1);
        viewPager = (ViewPager) view.findViewById(R.id.vb_film);
        viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
        search = (RelativeLayout) view.findViewById(R.id.vb_search);
        search.setOnClickListener(this);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        String[] titles = {"热映","待映","找片"};
        initFragment();
        slidingTabLayout.setViewPager(viewPager,titles,getActivity(),fragmentList);
    }

    private void initFragment() {
        fragmentList = new ArrayList<>();
        HotFragment dai = new HotFragment();
        SoonComeFragment re = new SoonComeFragment();
        FindResouceFragment zh = new FindResouceFragment();
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
