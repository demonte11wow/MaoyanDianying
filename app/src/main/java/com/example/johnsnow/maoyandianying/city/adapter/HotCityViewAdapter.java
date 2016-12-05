package com.example.johnsnow.maoyandianying.city.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.johnsnow.maoyandianying.MainActivity;
import com.example.johnsnow.maoyandianying.R;

import java.util.List;

/**
 * Created by palo on 2016/10/6.
 */
public class HotCityViewAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> hotCityNames;
    public HotCityViewAdapter(Context context, List<String> hotCityNames){
        this.hotCityNames = hotCityNames;
        this.mContext = context;
    }


    @Override
    public int getCount() {
       return hotCityNames.size();
    }

    @Override
    public Object getItem(int position) {
        return hotCityNames.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = View.inflate(mContext, R.layout.city_grid_item,null);
            viewHolder = new ViewHolder();
            viewHolder.city_name = (TextView) convertView.findViewById(R.id.city_name);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final String current = hotCityNames.get(position);
        viewHolder.city_name.setText(current);
        viewHolder.city_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity ac = (Activity) mContext;
                Intent intent = new Intent(mContext, MainActivity.class);
                intent.putExtra("currentCity",current);
                ac.setResult(100, intent);
                ac.finish();
                return;
            }
        });
        return convertView;
    }
    static class ViewHolder {
        TextView city_name;
    }
}
