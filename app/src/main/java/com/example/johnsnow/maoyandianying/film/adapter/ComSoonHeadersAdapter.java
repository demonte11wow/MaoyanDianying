package com.example.johnsnow.maoyandianying.film.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.film.bean.ComeSoonBean;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;

import java.security.SecureRandom;
import java.util.List;

/**
 * Created by JohnSnow on 2016/12/2.
 */
public class ComSoonHeadersAdapter extends BaseHeadAdapter<RecyclerView.ViewHolder>
        implements StickyRecyclerHeadersAdapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private final LayoutInflater mLayoutInflater;
    private List<ComeSoonBean.DataBean.ComingBean> csList;
    private List<String> titles;
    private List<String> mDetailTitles;
    public static final int HORIZANTAL1 = 0;
    public static final int HORIZANTAL2 = 1;
    public static final int ITEM_TYPE_CONTENT = 2;

    public ComSoonHeadersAdapter(Context mContext, List<ComeSoonBean.DataBean.ComingBean> csList, List<String> titles, List<String> mDetailTitles) {
        this.mContext = mContext;
//        this.resultBean = resultBean;
        this.csList = csList;
        this.titles = titles;
        this.mDetailTitles = mDetailTitles;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    /**
     * 分类型，一条横着，一条横着，其他都是竖着
     *
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return HORIZANTAL1;
        } else if (position == 1) {
            return HORIZANTAL2;
        }
        return ITEM_TYPE_CONTENT;
    }

    @Override
    public int getItemCount() {
        return csList.size()+2;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == HORIZANTAL1) {
            return new HorHolder1(mLayoutInflater.inflate(R.layout.cs_recyle1, null), mContext);
        } else if (viewType == HORIZANTAL2) {
            return new HorHolder2(mLayoutInflater.inflate(R.layout.cs_recyle1, null), mContext);
        }
        View view = mLayoutInflater.inflate(R.layout.view_item, parent, false);
        return new filmCsViewHolder(view);

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == 0) {
            HorHolder1 bannerViewHolder = (HorHolder1) holder;
            bannerViewHolder.setData();
        } else if (position == 1) {
            HorHolder2 bannerViewHolder = (HorHolder2) holder;
            bannerViewHolder.setData();
        }
    }


    @Override
    public long getHeaderId(int position) {
        if (position == 0) {
            return 0;
        } else if (position == 1) {
            return 1;
        } else {
            return Integer.valueOf(titles.get(position).replace("-", ""));
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
            textView.setText("title1");
        } else if (position == 1) {
            textView.setText("title2");
        } else {
            textView.setText(mDetailTitles.get(position));
        }

        holder.itemView.setBackgroundColor(getRandomColor());

    }

    private int getRandomColor() {
        SecureRandom rgen = new SecureRandom();
        return Color.HSVToColor(150, new float[]{
                rgen.nextInt(359), 1, 1
        });
    }

    class filmCsViewHolder extends RecyclerView.ViewHolder {
        ImageView film_image;
        TextView film_title;
        TextView film_score_audience;
        TextView film_score_profession;
        TextView film_scm;
        TextView film_shownfo;
        TextView film_submit;
        LinearLayout ll_bottom;
        ImageView rv_film_type;

        public filmCsViewHolder(View itemView) {
            super(itemView);
            film_image = (ImageView) itemView.findViewById(R.id.film_image);
            film_title = (TextView) itemView.findViewById(R.id.film_title);
            film_score_audience = (TextView) itemView.findViewById(R.id.film_score_audience);
            film_score_profession = (TextView) itemView.findViewById(R.id.film_score_profession);
            film_scm = (TextView) itemView.findViewById(R.id.film_scm);
            film_shownfo = (TextView) itemView.findViewById(R.id.film_shownfo);
            film_submit = (TextView) itemView.findViewById(R.id.film_submit);
            ll_bottom = (LinearLayout) itemView.findViewById(R.id.ll_bottom);
            rv_film_type = (ImageView) itemView.findViewById(R.id.rv_film_type);
        }
    }

    private class HorHolder1 extends RecyclerView.ViewHolder {
        private RecyclerView recyclerView;
        public Context mContext;

        public HorHolder1(View inflate, Context mContext) {
            super(inflate);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recy_cs1);
            this.mContext = mContext;
        }

        public void setData() {
            //设置RecyclerView
            recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
            HorViewAdapter1 adapter = new HorViewAdapter1(mContext);
            recyclerView.setAdapter(adapter);
        }
    }

    private class HorHolder2 extends RecyclerView.ViewHolder {
        private RecyclerView recyclerView;
        public Context mContext;

        public HorHolder2(View inflate, Context mContext) {
            super(inflate);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recy_cs1);
            this.mContext = mContext;
        }

        public void setData() {
            //设置RecyclerView
            recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
            HorViewAdapter2 adapter = new HorViewAdapter2(mContext);
            recyclerView.setAdapter(adapter);
        }
    }
}