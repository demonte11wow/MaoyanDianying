package com.example.johnsnow.maoyandianying.film.fragment;

import android.content.pm.ActivityInfo;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.film.adapter.AnimalsHeadersAdapter;
import com.example.johnsnow.maoyandianying.film.adapter.DividerDecoration;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;

/**
 * Created by JohnSnow on 2016/11/30.
 *
 *
 */
public class SoonComeFragment extends BaseFragment {

    RecyclerView recyclerView;

    @Override
    public View initView() {
        View view = View.inflate(getContext(), R.layout.fragment_sooncome,null);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        AnimalsHeadersAdapter adapter = new AnimalsHeadersAdapter();
        adapter.add("Animals below!");
        adapter.addAll(getDummyDataSet());
        recyclerView.setAdapter(adapter);
        // Set layout manager
        int orientation = getLayoutManagerOrientation(getResources().getConfiguration().orientation);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), orientation, false);
        recyclerView.setLayoutManager(layoutManager);

        // Add the sticky headers decoration
        final StickyRecyclerHeadersDecoration headersDecor = new StickyRecyclerHeadersDecoration(adapter);
        recyclerView.addItemDecoration(headersDecor);

        // Add decoration for dividers between list items
        recyclerView.addItemDecoration(new DividerDecoration(getActivity()));
        return view;
    }


    private int getLayoutManagerOrientation(int activityOrientation) {
        if (activityOrientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT) {
            return LinearLayoutManager.VERTICAL;
        } else {
            return LinearLayoutManager.HORIZONTAL;
        }
    }

    private String[] getDummyDataSet() {
        return getResources().getStringArray(R.array.animals);
    }


}
