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
import com.example.johnsnow.maoyandianying.film.bean.Hor1Bean;
import com.example.johnsnow.maoyandianying.film.bean.Hor2Bean;
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
    Hor1Bean hoBean1;
    Hor2Bean hoBean2;
    ComSoonHeadersAdapter adapter;
    private List<ComeSoonBean.DataBean.ComingBean> csList;
    private List<Hor1Bean.DataBean> hoList1;
    private List<Hor2Bean.DataBean.ComingBean> hoList2;
    private List<String> titles;
    private List<String> mDetailTitles;

    @Override
    public View initView() {
        View view = View.inflate(getContext(), R.layout.fragment_sooncome,null);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        getDataReFromServer(MyConstants.COME_SOON_RE);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
    }

    private void getDataSc1FromServer(String url) {
        OkHttpUtils
                .get()
                .url(url)
                .id(100)
                .build()
                .execute(new MyStringCallback1());
    }
    private void getDataSc2FromServer(String url) {
        OkHttpUtils
                .get()
                .url(url)
                .id(100)
                .build()
                .execute(new MyStringCallback2());
    }
    private void getDataReFromServer(String url) {
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
                        getDataSc1FromServer(MyConstants.COME_SOON_SCROLLVIEW1);
                    }
                    break;
                case 101:
//                    Toast.makeText(mContext, "https", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
    private class MyStringCallback1 extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {
            Log.e("TAG", "联网失败" + e.getMessage());
        }

        @Override
        public void onResponse(String response, int id) {
            switch (id) {
                case 100:
                    if (response != null) {
                        processData1(response);
                        getDataSc2FromServer(MyConstants.COME_SOON_SCROLLVIEW2);
                    }
                    break;
                case 101:
//                    Toast.makeText(mContext, "https", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
    private class MyStringCallback2 extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {
            Log.e("TAG", "联网失败" + e.getMessage());
        }

        @Override
        public void onResponse(String response, int id) {
            switch (id) {
                case 100:
                    if (response != null) {
                        processData2(response);
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

        hoList1 = hoBean1.getData();
        hoList2 = hoBean2.getData().getComing();


        //添加两个头，标题list也要添加2个
        titles.add("0");
        titles.add("1");
        mDetailTitles.add("0");
        mDetailTitles.add("1");
        for(int i = 0; i < csList.size();i++){
            titles.add(csList.get(i).getRt());
            mDetailTitles.add(csList.get(i).getComingTitle());
        }
        adapter = new ComSoonHeadersAdapter(mContext,csList,titles,mDetailTitles,hoList1,hoList2);
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
    private void processData1(String response) {
        Gson gson = new Gson();
        hoBean1 = gson.fromJson(response, Hor1Bean.class);
    }
    private void processData2(String response) {
        Gson gson = new Gson();
        hoBean2 = gson.fromJson(response, Hor2Bean.class);
    }


    private int getLayoutManagerOrientation(int activityOrientation) {
        if (activityOrientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT) {
            return LinearLayoutManager.VERTICAL;
        } else {
            return LinearLayoutManager.HORIZONTAL;
        }
    }
}
