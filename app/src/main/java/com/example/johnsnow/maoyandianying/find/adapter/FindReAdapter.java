package com.example.johnsnow.maoyandianying.find.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.find.bean.FindBean;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by JohnSnow on 2016/12/6.
 */
public class FindReAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private FindBean findBean;
    List<FindBean.DataBean.FeedsBean> findBeanList;

    public static final int TYPE_TITLE = 0;
    public static final int TYPE_2 = 2;
    public static final int TYPE_7 = 7;
    public static final int TYPE_8 = 8;
    private int currentType;
    private final LayoutInflater mLayoutInflater;

    public FindReAdapter(Context mContext, List<FindBean.DataBean.FeedsBean> findBeanList) {
        this.mContext = mContext;
        this.findBeanList = findBeanList;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_2) {
            currentType = TYPE_2;
            return new HorHolderTYPE_2(mLayoutInflater.inflate(R.layout.item_find_type2, null), mContext);
        } else if (viewType == TYPE_7) {
            currentType = TYPE_7;
            return new HorHolderTYPE_7(mLayoutInflater.inflate(R.layout.item_find_type7, null), mContext);
        } else if (viewType == TYPE_8) {
            currentType = TYPE_8;
            return new HorHolderTYPE_8(mLayoutInflater.inflate(R.layout.item_find_type8, null), mContext);
        }
        View view = mLayoutInflater.inflate(R.layout.find_title, parent, false);
        return new RecyclerView.ViewHolder(view) {
        };
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (currentType == TYPE_2) {
            HorHolderTYPE_2 type2Holder = (HorHolderTYPE_2) holder;
            type2Holder.setData(position - 1);
        } else if (currentType == TYPE_7) {
            HorHolderTYPE_7 type7Holder = (HorHolderTYPE_7) holder;
            type7Holder.setData(position - 1);
        } else if (currentType == TYPE_8) {
            HorHolderTYPE_8 type8Holder = (HorHolderTYPE_8) holder;
            type8Holder.setData(position - 1);
        } else {

        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            currentType = TYPE_TITLE;
        } else {
            switch (findBeanList.get(position - 1).getFeedType()) {
                case 7:
                    currentType = TYPE_7;
                    break;
                case 8:
                    currentType = TYPE_2;
                    break;
                case 2:
                    currentType = TYPE_8;
                    break;
                default:
                    return 0;
            }
        }
        return currentType;
    }

    @Override
    public int getItemCount() {
        return findBeanList.size() + 1;
    }


    public void addAll(int itemCount, List<FindBean.DataBean.FeedsBean> feeds) {
        findBeanList.addAll(itemCount-1, feeds);
        notifyItemRangeChanged(itemCount, feeds.size());
    }


    class HorHolderTYPE_2 extends RecyclerView.ViewHolder {
        @Bind(R.id.tv_type2_title)
        TextView tvType2Title;
        @Bind(R.id.type2_iv1)
        ImageView type2Iv1;
        @Bind(R.id.type2_iv2)
        ImageView type2Iv2;
        @Bind(R.id.type2_iv3)
        ImageView type2Iv3;
        @Bind(R.id.tv_type2_laiyuan)
        TextView tvType2Laiyuan;
        @Bind(R.id.tv_type2_guanzhu)
        TextView tvType2Guanzhu;
        @Bind(R.id.tv_type2_pinglu)
        TextView tvType2Pinglu;

        public HorHolderTYPE_2(View inflate, Context mContext) {
            super(inflate);
            ButterKnife.bind(this, inflate);
        }

        public void setData(int position) {
            tvType2Title.setText(findBeanList.get(position).getTitle());
            Glide.with(mContext)
                    .load(findBeanList.get(position).getImages().get(0).getUrl())
                    .asBitmap()
                    .into(type2Iv1);
            Glide.with(mContext)
                    .load(findBeanList.get(position).getImages().get(0).getUrl())
                    .asBitmap()
                    .into(type2Iv2);
            Glide.with(mContext)
                    .load(findBeanList.get(position).getImages().get(0).getUrl())
                    .asBitmap()
                    .into(type2Iv3);
            tvType2Laiyuan.setText(findBeanList.get(position).getUser().getNickName());
            tvType2Guanzhu.setText("" + findBeanList.get(position).getUser().getVisitorCount());
            tvType2Pinglu.setText("" + findBeanList.get(position).getCommentCount());
        }
    }

    class HorHolderTYPE_7 extends RecyclerView.ViewHolder {
        @Bind(R.id.iv_type7)
        ImageView ivType7;
        @Bind(R.id.tv_type7_title)
        TextView tvType7Title;
        @Bind(R.id.tv_type7_laiyuan)
        TextView tvType7Laiyuan;
        @Bind(R.id.tv_type7_guanzhu)
        TextView tvType7Guanzhu;
        @Bind(R.id.tv_type7_pinglu)
        TextView tvType7Pinglu;

        public HorHolderTYPE_7(View inflate, Context mContext) {
            super(inflate);
            ButterKnife.bind(this, inflate);
        }

        public void setData(int position) {
            Glide.with(mContext)
                    .load(findBeanList.get(position).getImages().get(0).getUrl())
                    .asBitmap()
                    .into(ivType7);
            tvType7Title.setText(findBeanList.get(position).getTitle());
            if (findBeanList.get(position).getUser() != null) {
                tvType7Laiyuan.setText(findBeanList.get(position).getUser().getNickName());
                tvType7Guanzhu.setText("" + findBeanList.get(position).getUser().getVisitorCount());
                tvType7Pinglu.setText("" + findBeanList.get(position).getCommentCount());
            }

        }
    }


     class HorHolderTYPE_8 extends RecyclerView.ViewHolder {
        @Bind(R.id.tv_type8_title)
        TextView tvType8Title;
        @Bind(R.id.iv_type8_1)
        ImageView ivType81;
        @Bind(R.id.iv_type8_2)
        ImageView ivType82;
        @Bind(R.id.iv_type8_3)
        ImageView ivType83;

        public HorHolderTYPE_8(View inflate, Context mContext) {
            super(inflate);
            ButterKnife.bind(this, inflate);
        }


        public void setData(int position) {
            tvType8Title.setText(findBeanList.get(position).getTitle());
            Glide.with(mContext)
                    .load(findBeanList.get(position).getImages().get(0).getUrl())
                    .asBitmap()
                    .into(ivType81);
            Glide.with(mContext)
                    .load(findBeanList.get(position).getImages().get(0).getUrl())
                    .asBitmap()
                    .into(ivType82);
            Glide.with(mContext)
                    .load(findBeanList.get(position).getImages().get(0).getUrl())
                    .asBitmap()
                    .into(ivType83);
        }
    }

}


