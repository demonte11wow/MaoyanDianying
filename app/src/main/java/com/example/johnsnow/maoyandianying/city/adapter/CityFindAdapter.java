package com.example.johnsnow.maoyandianying.city.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.example.johnsnow.maoyandianying.Base.BaseHeadAdapter;
import com.example.johnsnow.maoyandianying.MainActivity;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.global.CityName;
import com.example.johnsnow.maoyandianying.global.Utils;
import com.example.johnsnow.maoyandianying.utils.StringUtils;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class CityFindAdapter extends BaseHeadAdapter<RecyclerView.ViewHolder>
        implements StickyRecyclerHeadersAdapter<RecyclerView.ViewHolder> {
    private List<String> pinyingList;
    public static final int CURRENT_CITY = 0;
    public static final int HOT_CITY = 1;
    public static final int CITY_LIST_ITEN = 2;
    private Context mContext;
    private final LayoutInflater mLayoutInflater;
    private AMapLocationClient mLocationClient;

    public CityFindAdapter(Context mContext, List<String> pinyingList) {
        mLayoutInflater = LayoutInflater.from(mContext);
        this.pinyingList = pinyingList;
        this.mContext = mContext;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == CURRENT_CITY) {
            //当前城市
            return new CityCurrent(mLayoutInflater.inflate(R.layout.current_city, null), mContext);
        } else if (viewType == HOT_CITY) {
            //热门城市
            return new CityHot(mLayoutInflater.inflate(R.layout.city_hot, null), mContext);
        }

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_item, parent, false);
        return new RecyclerView.ViewHolder(view) {
        };
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return CURRENT_CITY;
        } else if (position == 1) {
            return HOT_CITY;
        }
        return CITY_LIST_ITEN;
    }

    @Override
    public int getItemCount() {
        return pinyingList.size() + 2;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == 0) {
            CityCurrent cityCurrentViewHolder = (CityCurrent) holder;
            cityCurrentViewHolder.setData();
        } else if (position == 1) {
            CityHot cityHotViewHolder = (CityHot) holder;
            cityHotViewHolder.setData();
        } else {
            final String current = getItem(position);
            final TextView textView = (TextView) holder.itemView;
            textView.setText(current);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent intent = new Intent(mContext, MainActivity.class);
//                    intent.putExtra("currentCity",current);
//                    mContext.startActivity(intent);
                    Activity ac = (Activity) mContext;
                    Intent intent = new Intent(mContext, MainActivity.class);
                    intent.putExtra("currentCity", current);
                    ac.setResult(100, intent);
                    ac.finish();
                    return;
                }
            });
        }
    }

    @Override
    public long getHeaderId(int position) {
        if (position == 0) {
            return 0;
        } else if (position == 1) {
            return 1;
        } else {
            return pinyingList.get(position).charAt(0);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_header, parent, false);
        return new RecyclerView.ViewHolder(view) {
        };
    }

    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder, int position) {
        TextView textView = (TextView) holder.itemView;
        if (position == 0) {
            textView.setText("当前城市");
        } else if (position == 1) {
            textView.setText("热门城市");
        } else {
            textView.setText("" + pinyingList.get(position).charAt(0));
        }

        holder.itemView.setBackgroundColor(getRandomColor());
    }

    private int getRandomColor() {
        SecureRandom rgen = new SecureRandom();
        return Color.HSVToColor(150, new float[]{
                rgen.nextInt(150), 1, 1
        });
    }


    /**
     * 定位城市
     */
    private class CityCurrent extends RecyclerView.ViewHolder {
        private TextView currentCity;
        public Context mContext;
        private boolean isFirst = true;

        public CityCurrent(View inflate, Context mContext) {
            super(inflate);
            this.mContext = mContext;
            currentCity = (TextView) inflate.findViewById(R.id.current_city);
        }

        Handler handler = new Handler() {
            @Override
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


        public void setData() {
//            getDataSc1FromServer(MyConstants.COME_SOON_SCROLLVIEW1);
            //GPS定位获取当前城市
            if (isFirst) {
                currentCity.setText("定位中...");
                handler.sendEmptyMessageDelayed(0, 1000);
                isFirst = false;
            }
        }

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
                            String location = StringUtils.extractLocation(city, district);
                            currentCity.setText(location);
                        } else {
                            Log.e("chenTag", String.valueOf(aMapLocation.getErrorCode()));
                            Log.e("chenTag", Utils.sHA1(mContext));
                            //定位失败
                            currentCity.setText("定位失败");
                        }
                    }
                }
            });
            mLocationClient.startLocation();
        }

    }

    /**
     * 热门城市 hotCityNameList
     */
    private class CityHot extends RecyclerView.ViewHolder {
        private GridView hotCityView;
        public Context mContext;
        private List<String> hotCityNames = new ArrayList<>();


        public CityHot(View inflate, Context mContext) {
            super(inflate);
            this.mContext = mContext;
            hotCityView = (GridView) inflate.findViewById(R.id.hotcity_grid);
            for (int i = 0; i < CityName.hotCityNameList.length; i++) {
                hotCityNames.add(CityName.hotCityNameList[i]);
            }
        }

        public void setData() {
            hotCityView.setAdapter(new HotCityViewAdapter(mContext, hotCityNames));
        }
    }

}