package com.example.johnsnow.maoyandianying.film.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.film.bean.Hor2Bean;

import java.util.List;

/**
 * Created by JohnSnow on 2016/12/2.
 */
public class HorViewAdapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<Hor2Bean.DataBean.ComingBean> hoList2;


    public HorViewAdapter2(Context mContext,List<Hor2Bean.DataBean.ComingBean> hoList2) {
        this.mContext = mContext;
        this.hoList2 = hoList2;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.cs_recyle_item, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.setData(position);
    }

    @Override
    public int getItemCount() {
        return hoList2.size();
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView date;
        private ImageView iv_movie;
        private TextView tv_name;
        private TextView tv_people;

        public MyViewHolder(View inflate) {
            super(inflate);
            date = (TextView) inflate.findViewById(R.id.date);
            iv_movie = (ImageView) inflate.findViewById(R.id.iv_movie);
            tv_name = (TextView) inflate.findViewById(R.id.tv_name);
            tv_people = (TextView) inflate.findViewById(R.id.tv_people);


        }

        public void setData(final int position) {
            String dateTemp = hoList2.get(position).getComingTitle().split(" ")[0];
            if (dateTemp.startsWith("20")) {
                dateTemp = dateTemp.substring(2);
            }
            date.setText(dateTemp);//去掉星期几,2017就去掉20
            tv_name.setText(hoList2.get(position).getNm());
            tv_people.setText("" + hoList2.get(position).getWish());
            Log.e("chenTagImage", hoList2.get(position).getImg());
            Glide.with(mContext)
                    .load(hoList2.get(position).getImg().replace("w.h/", ""))
                    .into(iv_movie);

        }

    }
}
