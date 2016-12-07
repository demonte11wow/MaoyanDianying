package com.example.johnsnow.maoyandianying.cinema.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.cinema.bean.CinemaBean;

import java.util.List;

/**
 * Created by JohnSnow on 2016/12/5.
 */
public class CinemaAdapter extends BaseAdapter {

    public Context mContext;
    private List<CinemaBean.DataBean.昌平区Bean> beanList;
    private String district;


    public CinemaAdapter(Context mContext, List beanList, String district) {
        this.mContext = mContext;
        this.beanList = beanList;
        this.district = district;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.cinema_item, null);
            viewHolder = new ViewHolder();

            viewHolder.cinema_title = (TextView) convertView.findViewById(R.id.cinema_title);
            viewHolder.cinema_price = (TextView) convertView.findViewById(R.id.cinema_price);
            viewHolder.cinema_position = (TextView) convertView.findViewById(R.id.cinema_position);
            viewHolder.cinema_distance = (TextView) convertView.findViewById(R.id.cinema_distance);
            //设置tag
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.cinema_title.setText( beanList.get(position).getNm());
        viewHolder.cinema_price.setText( String.valueOf(beanList.get(position).getReferencePrice()));
        viewHolder.cinema_position.setText( beanList.get(position).getAddr());
        viewHolder.cinema_distance.setText( "8.5");
        return convertView;
    }

    static class ViewHolder {
        private TextView cinema_title;
        private TextView cinema_price;
        private TextView cinema_position;
        private TextView cinema_distance;
    }
}
