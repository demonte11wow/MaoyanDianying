package com.example.johnsnow.maoyandianying.find;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.cjj.MaterialRefreshLayout;
import com.cjj.MaterialRefreshListener;
import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.find.adapter.FindReAdapter;
import com.example.johnsnow.maoyandianying.find.bean.FindBean;
import com.example.johnsnow.maoyandianying.global.MyConstants;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

/**
 * Created by JohnSnow on 2016/11/30.
 */
public class FindFragment extends BaseFragment {
    RecyclerView recyclerView;
    FindBean findBean;
    private Context mContext;
    private List<FindBean.DataBean.FeedsBean> findBeanList;
    private MaterialRefreshLayout refresh;
    FindReAdapter adpter;
    private int item = 0;
    FloatingActionButton ftab;

    /**
     * 默认状态
     */
    private static final int STATE_NORMAL = 1;

    /**
     * 下拉刷新
     */
    private static final int STATE_REFRESH = 2;

    /**
     * 上拉刷新
     */
    private static final int STATE_LOADMORE = 3;
    /**
     * 当前状态
     */
    private int currentState = STATE_NORMAL;


    @Override
    public View initView() {
        View view = View.inflate(getContext(), R.layout.find_fragment, null);
        mContext = getActivity();
        recyclerView = (RecyclerView) view.findViewById(R.id.re_find);
        refresh = (MaterialRefreshLayout) view.findViewById(R.id.refresh);
        ftab = (FloatingActionButton) view.findViewById(R.id.back_top);
        getDataFromServer(MyConstants.FIND_URL + item);
        initRefreshLayout();
        ftab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.scrollToPosition(0);
                ftab.setVisibility(View.GONE);
            }
        });
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if(getScollYPosition() > 10){
                    ftab.setVisibility(View.VISIBLE);
                } else {
                    ftab.setVisibility(View.GONE);
                }



                if (isVisBottom(recyclerView)) {
                    item = item + 10;
                    Log.e("chenTag", "bottom");
                    getMoreDataFromServer(MyConstants.FIND_URL + item);
                }
            }
        });
        return view;
    }


    private int getScollYPosition () {
        LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int position = layoutManager.findFirstVisibleItemPosition();
        return position;
//        View firstVisiableChildView = layoutManager.findViewByPosition(position);
//        int itemHeight = firstVisiableChildView.getHeight();
//        return (position) * itemHeight - firstVisiableChildView.getTop();
    }

    private void initRefreshLayout() {
        refresh.setMaterialRefreshListener(new MyMaterialRefreshListener());

    }

    public static boolean isVisBottom(RecyclerView recyclerView) {
        if (recyclerView == null) return false;
        if (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset()
                >= recyclerView.computeVerticalScrollRange())
            return true;
        return false;
    }

    class MyMaterialRefreshListener extends MaterialRefreshListener {
        /**
         * 下拉刷新
         */
        @Override
        public void onRefresh(MaterialRefreshLayout materialRefreshLayout) {
            getDataFromServer(MyConstants.FIND_URL + 0);
        }

        /**
         * 上拉刷新（加载更多）
         *
         * @param materialRefreshLayout
         */
        @Override
        public void onRefreshLoadMore(MaterialRefreshLayout materialRefreshLayout) {
            refresh.finishRefresh();
        }
    }


    private void getDataFromServer(String url) {
        OkHttpUtils
                .get()
                .url(url)
                .id(100)
                .build()
                .execute(new MyStringCallback());
    }

    private void getMoreDataFromServer(String url) {
        OkHttpUtils
                .get()
                .url(url)
                .id(100)
                .build()
                .execute(new MyStringCallback2());
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
                    refresh.finishRefresh();
                    if (response != null) {
                        processData(response);
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
                    }
                    break;
                case 101:
//                    Toast.makeText(mContext, "https", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

    private void processData(String response) {
        Log.e("eads", "asdasdasd");
        Gson gson = new Gson();
        findBean = gson.fromJson(response, FindBean.class);
        findBeanList = findBean.getData().getFeeds();
        adpter = new FindReAdapter(mContext, findBeanList);
        recyclerView.setAdapter(adpter);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

    }

    private void processData2(String response) {
        Gson gson = new Gson();
        FindBean findBean2 = gson.fromJson(response, FindBean.class);
        adpter.addAll(adpter.getItemCount(), findBean2.getData().getFeeds());
    }


}
