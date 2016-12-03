package com.example.johnsnow.maoyandianying.film.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.johnsnow.maoyandianying.Base.BaseHeadAdapter;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.film.bean.ComeSoonBean;
import com.example.johnsnow.maoyandianying.film.bean.Hor1Bean;
import com.example.johnsnow.maoyandianying.film.bean.Hor2Bean;
import com.example.johnsnow.maoyandianying.global.MyConstants;
import com.google.gson.Gson;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.security.SecureRandom;
import java.util.List;

import okhttp3.Call;

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


    public ComSoonHeadersAdapter(Context mContext, List<ComeSoonBean.DataBean.ComingBean> csList,
                                 List<String> titles, List<String> mDetailTitles) {
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
            return new HorHolder2(mLayoutInflater.inflate(R.layout.cs_recyle2, null), mContext);
        }
        View view = mLayoutInflater.inflate(R.layout.view_cs_item, parent, false);
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
                .inflate(R.layout.view_cs_header, parent, false);
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


    /**
     * 联网逻辑分离1
     */
    private class HorHolder1 extends RecyclerView.ViewHolder {
        private RecyclerView recyclerView;
        public Context mContext;
        private List<Hor1Bean.DataBean> hoList1;
        private Hor1Bean hoBean1;

        public HorHolder1(View inflate, Context mContext) {
            super(inflate);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recy_cs1);
            this.mContext = mContext;
        }

        public void setData() {
            getDataSc1FromServer(MyConstants.COME_SOON_SCROLLVIEW1);
        }

        private void getDataSc1FromServer(String url) {
            OkHttpUtils
                    .get()
                    .url(url)
                    .id(100)
                    .build()
                    .execute(new MyStringCallback1());
        }
        private class MyStringCallback1 extends StringCallback {

            @Override
            public void onError(Call call, Exception e, int id) {
                Log.e("TAG", "联网失败" + e.getMessage());
            }

            @Override
            public void onResponse(String response, int id) {
                switch (id) {
                    case 100:
                        if (response != null) {
                            processData1(response);
                        }
                        break;
                    case 101:
//                    Toast.makeText(mContext, "https", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        }
        private void processData1(String response) {
            Gson gson = new Gson();
            hoBean1 = gson.fromJson(response, Hor1Bean.class);
            hoList1 = hoBean1.getData();
            //设置RecyclerView
            recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
            HorViewAdapter1 adapter = new HorViewAdapter1(mContext,hoList1);
            recyclerView.setAdapter(adapter);
        }
    }


    /**
     * 联网逻辑分离2
     */
    private class HorHolder2 extends RecyclerView.ViewHolder {
        private RecyclerView recyclerView;
        public Context mContext;
        private Hor2Bean hoBean2;
        private List<Hor2Bean.DataBean.ComingBean> hoList2;

        public HorHolder2(View inflate, Context mContext) {
            super(inflate);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recy_cs2);
            this.mContext = mContext;
        }

        public void setData() {
            getDataSc2FromServer(MyConstants.COME_SOON_SCROLLVIEW2);
        }

        private void getDataSc2FromServer(String url) {
            OkHttpUtils
                    .get()
                    .url(url)
                    .id(100)
                    .build()
                    .execute(new MyStringCallback2());
        }

        private class MyStringCallback2 extends StringCallback {

            @Override
            public void onError(Call call, Exception e, int id) {
                Log.e("TAG", "联网失败" + e.getMessage());
            }

            @Override
            public void onResponse(String response, int id) {
                switch (id) {
                    case 100:
                        if (response != null) {
                            processData2(response);
                        }
                        break;
                    case 101:
//                    Toast.makeText(mContext, "https", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        }

        private void processData2(String response) {
            Gson gson = new Gson();
            hoBean2 = gson.fromJson(response, Hor2Bean.class);
            hoList2 = hoBean2.getData().getComing();

            //设置RecyclerView
            recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
            HorViewAdapter2 adapter = new HorViewAdapter2(mContext,hoList2);
            recyclerView.setAdapter(adapter);
        }
    }
}