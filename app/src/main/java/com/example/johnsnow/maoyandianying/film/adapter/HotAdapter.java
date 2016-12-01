package com.example.johnsnow.maoyandianying.film.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.film.bean.HotBean;

import java.util.List;


/**
 * Created by JohnSnow on 2016/12/1.
 *
 */
public class HotAdapter extends BaseAdapter {
    public Context mContext;
    public List<HotBean.DataBean.MoviesBean> hotBeanlist;


    public HotAdapter(Context mContext, List<HotBean.DataBean.MoviesBean> hotBeanlist) {
        this.mContext = mContext;
        this.hotBeanlist = hotBeanlist;
    }

    @Override
    public int getCount() {
        return hotBeanlist.size();
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

        Drawable drawable_yushou =mContext.getDrawable(R.drawable.text_yushou_shape);
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.hot_list_item, null);
            viewHolder = new ViewHolder();
            viewHolder.film_image = (ImageView) convertView.findViewById(R.id.film_image);
            viewHolder.film_title = (TextView) convertView.findViewById(R.id.film_title);
            viewHolder.film_score_audience = (TextView) convertView.findViewById(R.id.film_score_audience);
            viewHolder.film_score_profession = (TextView) convertView.findViewById(R.id.film_score_profession);
            viewHolder.film_scm = (TextView) convertView.findViewById(R.id.film_scm);
            viewHolder.film_shownfo = (TextView) convertView.findViewById(R.id.film_shownfo);
            viewHolder.film_submit = (TextView) convertView.findViewById(R.id.film_submit);
            //设置tag
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //根据位置得到对应的数据
        HotBean.DataBean.MoviesBean filmItem = hotBeanlist.get(position);
        viewHolder.film_title.setText(filmItem.getNm());
        viewHolder.film_score_profession.setText(""+6.6);
        viewHolder.film_scm.setText(filmItem.getScm());
        viewHolder.film_shownfo.setText(filmItem.getShowInfo());

        Glide
                .with(mContext)
                .load(filmItem.getImg())
                .into(viewHolder.film_image);

        if(filmItem.getPreSale() == 0){
            viewHolder.film_score_audience.setText(""+filmItem.getSc());
        } else {
            viewHolder.film_submit.setText("预售");
            viewHolder.film_submit.setTextColor(Color.BLUE);
            viewHolder.film_submit.setBackground(drawable_yushou);
            viewHolder.film_score_audience.setText("暂无");
        }

        return convertView;
    }

    static class ViewHolder{
        ImageView film_image;
        TextView film_title;
        TextView film_score_audience;
        TextView film_score_profession;
        TextView film_scm;
        TextView film_shownfo;
        TextView film_submit;
    }
}
