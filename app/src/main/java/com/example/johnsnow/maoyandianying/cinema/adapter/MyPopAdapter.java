package com.example.johnsnow.maoyandianying.cinema.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.johnsnow.maoyandianying.R;

import java.util.List;

/**
 * Created by JohnSnow on 2016/12/8.
 */public class MyPopAdapter extends BaseAdapter {
    private Context mContext;
    private List<String> listName;

    public MyPopAdapter(Context mContext, List<String> listName) {
        this.mContext = mContext;
        this.listName = listName;
    }

    @Override
    public int getCount() {
        return listName.size();
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
            convertView = View.inflate(mContext, R.layout.item_quyulist, null);
            viewHolder = new ViewHolder();
            viewHolder.film_title = (TextView) convertView.findViewById(R.id.item_text);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //根据位置得到对应的数据

        viewHolder.film_title.setText(listName.get(position));
        return convertView;
    }

    static class ViewHolder {
        TextView film_title;
    }
}