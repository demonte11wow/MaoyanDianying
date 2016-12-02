package com.example.johnsnow.maoyandianying.film.fragment;

import android.content.pm.ActivityInfo;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.film.adapter.ComSoonHeadersAdapter;
import com.example.johnsnow.maoyandianying.film.adapter.DividerDecoration;
import com.example.johnsnow.maoyandianying.film.bean.ComeSoonBean;
import com.example.johnsnow.maoyandianying.global.MyConstants;
import com.google.gson.Gson;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * Created by JohnSnow on 2016/11/30.
 *
 *
 */
public class SoonComeFragment extends BaseFragment {

    RecyclerView recyclerView;
    ComeSoonBean csBean;
    ComSoonHeadersAdapter adapter;
    private List<ComeSoonBean.DataBean.ComingBean> csList;
    private List<String> titles;
    private List<String> mDetailTitles;

    @Override
    public View initView() {
        View view = View.inflate(getContext(), R.layout.fragment_sooncome,null);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        getDataScFromServer(MyConstants.COME_SOON);

        return view;
    }

    private void getDataScFromServer(String url) {
        OkHttpUtils
                .get()
                .url(url)
                .id(100)
                .build()
                .execute(new MyStringCallback());
    }

    private class MyStringCallback extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {
            Log.e("TAG", "联网失败" + e.getMessage());
        }

        @Override
        public void onResponse(String response, int id) {

            switch (id) {
                case 100:
                    if (response != null) {
                        processData(response);
                        initStickHeaderRecyleView();
                    }
                    break;
                case 101:
//                    Toast.makeText(mContext, "https", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

    private void initStickHeaderRecyleView() {
        csList = csBean.getData().getComing();
        titles = new ArrayList<>();
        mDetailTitles = new ArrayList<>();
        for(int i = 0; i < csList.size();i++){
            titles.add(csList.get(i).getRt());
            mDetailTitles.add(csList.get(i).getComingTitle());
        }
        adapter = new ComSoonHeadersAdapter(mContext,csList,titles,mDetailTitles);
        adapter.addAll(titles);

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
    }

    private void processData(String response) {
        Gson gson = new Gson();
        csBean = gson.fromJson(response, ComeSoonBean.class);
    }


    private int getLayoutManagerOrientation(int activityOrientation) {
        if (activityOrientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT) {
            return LinearLayoutManager.VERTICAL;
        } else {
            return LinearLayoutManager.HORIZONTAL;
        }
    }
//
//    private String[] getDummyDataSet() {
//        return getResources().getStringArray(R.array.animals);
//    }

}
