package com.example.johnsnow.maoyandianying.film.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.film.bean.Hor1Bean;

import java.util.List;

/**
 * Created by JohnSnow on 2016/12/2.
 */
public class HorViewAdapter1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<Hor1Bean.DataBean> hoList1;
    Hor1Bean hoBean1;

    public HorViewAdapter1(Context mContext,List<Hor1Bean.DataBean> hoList1) {
        this.mContext = mContext;
        this.hoList1 = hoList1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.cs_recyle_vedio, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.setData(position);
    }

    @Override
    public int getItemCount() {
        return hoList1 == null ? 0 : hoList1.size();
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView cs_film_image;
        private TextView cs_film_name;
        private TextView cs_film_origin_name;

        public MyViewHolder(View inflate) {
            super(inflate);
            cs_film_image = (ImageView) inflate.findViewById(R.id.cs_film_image);
            cs_film_name = (TextView) inflate.findViewById(R.id.cs_film_name);
            cs_film_origin_name = (TextView) inflate.findViewById(R.id.cs_film_origin_name);
        }

        public void setData(final int position) {
            cs_film_name.setText(hoList1.get(position).getMovieName());
            cs_film_origin_name.setText(hoList1.get(position).getOriginName());
            Glide.with(mContext)
                    .load(hoList1.get(position).getImg())
                    .into(cs_film_image);
        }

    }
}
