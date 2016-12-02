package com.example.johnsnow.maoyandianying.film.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.johnsnow.maoyandianying.R;

/**
 * Created by JohnSnow on 2016/12/2.
 *
 */
public class HorViewAdapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    public HorViewAdapter2(Context mContext){
        this.mContext = mContext;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.cs_recyle_item, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View inflate) {
            super(inflate);
        }
    }
}
