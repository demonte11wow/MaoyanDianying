package com.example.johnsnow.maoyandianying.film.fragment;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.film.adapter.HotAdapter;
import com.example.johnsnow.maoyandianying.film.bean.HotBannerBean;
import com.example.johnsnow.maoyandianying.film.bean.HotBean;
import com.example.johnsnow.maoyandianying.global.MyConstants;
import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * Created by JohnSnow on 2016/11/30.
 *
 */
public class HotFragment extends BaseFragment {

    ListView reyingList;
    HotBannerBean bannerBean;
    HotBean hotBean;
    HotAdapter adapter;
    Context mContext;

    View bannerView;
    Banner banner;



    @Override
    public View initView() {
        mContext = getActivity();
        View view = View.inflate(getContext(), R.layout.fragment_hot,null);
        reyingList = (ListView) view.findViewById(R.id.reying_list);
        bannerView = View.inflate(getContext(), R.layout.banner_viewpager,null);
        banner = (Banner) bannerView.findViewById(R.id.banner);
        getDataBannersFromServer(MyConstants.HOT_BANNER);
        getDataListFromServer(MyConstants.HOT_FRAGMENT_LIST);
        return view;
    }

    private void getDataListFromServer(String url) {
        OkHttpUtils
                .get()
                .url(url)
                .id(100)
                .build()
                .execute(new MyStringCallback());
    }

    private void getDataBannersFromServer(String url) {
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
                    if (response != null) {
                        processData(response);
                        adapter = new HotAdapter(mContext,hotBean.getData().getMovies());
                        reyingList.addHeaderView(bannerView);
                        reyingList.setAdapter(adapter);
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
                        //2.设置Banner显示图片
                        //设置banner样式
                        List <HotBannerBean.DataBean>images = bannerBean.getData();
                        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
                        //设置图片加载器
                        banner.setImageLoader(new GlideImageLoader());
                        //设置图片url集合:imageUrl
                        List<String> imageUrl = new ArrayList<String>(images.size());
                        for (int i = 0; i < images.size(); i++) {
                            imageUrl.add(images.get(i).getImgUrl());
                            Log.e("TAG", "url = " + images.get(i).getImgUrl());
                        }
                        banner.setImages(imageUrl);
                        //设置banner动画效果
                        banner.setBannerAnimation(Transformer.ScaleInOut);
                        //设置标题集合（当banner样式有显示title时）
                        //设置自动轮播，默认为true
                        banner.isAutoPlay(true);
                        //设置轮播时间
                        banner.setDelayTime(2500);
                        //设置指示器位置（当banner模式中有指示器时）
                        banner.setIndicatorGravity(BannerConfig.RIGHT);
                        //banner设置方法全部调用完毕时最后调用
                        banner.start();
                    }
                    break;
                case 101:
//                    Toast.makeText(mContext, "https", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

    private void processData(String response) {
        Gson gson = new Gson();
        hotBean = gson.fromJson(response, HotBean.class);
    }

    private void processData2(String response) {
        Gson gson = new Gson();
        bannerBean = gson.fromJson(response, HotBannerBean.class);
    }

    public class GlideImageLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {

            Glide.with(context).load((String) path).into(imageView);

        }
    }
}
