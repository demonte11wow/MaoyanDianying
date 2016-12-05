package com.example.johnsnow.maoyandianying.film;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.city.CityFindActivity;
import com.example.johnsnow.maoyandianying.film.fragment.FindResouceFragment;
import com.example.johnsnow.maoyandianying.film.fragment.FragmentRevealExample;
import com.example.johnsnow.maoyandianying.film.fragment.HotFragment;
import com.example.johnsnow.maoyandianying.film.fragment.SoonComeFragment;
import com.example.johnsnow.maoyandianying.film.transform.ZoomOutPageTransformer;
import com.example.johnsnow.maoyandianying.utils.PreferenceUtils;
import com.example.johnsnow.maoyandianying.utils.StringUtils;
import com.flyco.tablayout.SlidingTabLayout;

import java.util.ArrayList;

/**
 * Created by JohnSnow on 2016/11/30.
 */
public class FilmFragment extends BaseFragment implements View.OnClickListener {
    SlidingTabLayout slidingTabLayout;
    RecyclerView re;
    ViewPager viewPager;
    ArrayList<Fragment> fragmentList;
    RelativeLayout search;
    private boolean hadIntercept;
    private TextView city_find;
    private AMapLocationClient mLocationClient;

    @Override
    public boolean onBackPressed() {
        if (hadIntercept) {
            return false;
        } else {
            Toast.makeText(getActivity(), "Click From MyFragment", Toast.LENGTH_SHORT).show();
            hadIntercept = true;
            return true;
        }
    }

    @Override
    public View initView() {
        View view = View.inflate(getContext(), R.layout.film_fragment, null);
        slidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.tl_1);
        viewPager = (ViewPager) view.findViewById(R.id.vb_film);
        viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
        search = (RelativeLayout) view.findViewById(R.id.vb_search);
        search.setOnClickListener(this);
        city_find = (TextView) view.findViewById(R.id.city_find);
        String preCity = PreferenceUtils.getString(mContext,"currentCity");
        if(null != preCity && preCity.length() > 0){
            city_find.setText(preCity);
        }
        handler.sendEmptyMessageDelayed(0,1000);

        city_find.setOnClickListener(this);
        return view;
    }

    Handler handler = new Handler(){
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    initLocation();
                }
            }).start();
        }
    };


    private void initLocation() {
        mLocationClient = new AMapLocationClient(mContext);
        AMapLocationClientOption option = new AMapLocationClientOption();
        option.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        option.setOnceLocation(true);
        mLocationClient.setLocationOption(option);


        mLocationClient.setLocationListener(new AMapLocationListener() {
            @Override
            public void onLocationChanged(AMapLocation aMapLocation) {
                if (aMapLocation != null) {
                    if (aMapLocation.getErrorCode() == 0) {
                        String city = aMapLocation.getCity();
                        String district = aMapLocation.getDistrict();
                        Log.e("onLocationChanged", "city: " + city);
                        Log.e("onLocationChanged", "district: " + district);
//                            String location = StringUtils.extractLocation(city, district);

                        showDialog(city);
                    } else {
                        //定位失败
                        Toast.makeText(mContext,"定位失败",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        mLocationClient.startLocation();
    }

    private void showDialog(String city) {
        TextView textView = new TextView(mContext);
        textView.setText("检测到地址变更，是否重定位");
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        final String currentCity = city;
        new AlertDialog.Builder(mContext)
                .setTitle("提示")
                .setView(textView)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        city_find.setText(StringUtils.extractLocation(currentCity, null));
                        PreferenceUtils.putString(mContext,"city",currentCity);
                    }
                })
                .setNegativeButton("取消", null)
                .show();

    }

    @Override
    public void initData() {
        super.initData();
        String[] titles = {"热映", "待映", "找片"};
        initFragment();
        slidingTabLayout.setViewPager(viewPager, titles, getActivity(), fragmentList);
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
        if (v.getId() == R.id.vb_search) {
            getActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, new FragmentRevealExample(), "fragment_my")
                    .addToBackStack("fragment:reveal")
                    .commit();

        } else if(v.getId() == R.id.city_find){
//            TransitionsHeleper.startActivity(getActivity(),CityFindActivity.class,v);

            Intent intent = new Intent(getActivity(),
                    CityFindActivity.class);
            Bundle b = new Bundle();
            intent.putExtras(b);
            startActivityForResult(intent,1);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1&&resultCode==100){
            Log.e("chenTag","ccc");
            String currentCity = data.getStringExtra("currentCity");
            PreferenceUtils.putString(mContext,"currentCity",currentCity);
            city_find.setText(currentCity);
        }
    }
}
