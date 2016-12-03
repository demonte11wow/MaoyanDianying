package com.example.johnsnow.maoyandianying.Base;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by JohnSnow on 2016/12/3.
 */
public abstract class BaseRecyclerViewDetector extends RecyclerView.OnScrollListener implements RecyclerView.OnTouchListener{
    private int mScrollThreshold;

    public abstract void onScrollUp();

    public abstract void onScrollDown();

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        boolean isSignificantDelta = Math.abs(dy) > mScrollThreshold;
        if (isSignificantDelta) {
            if (dy > 0) {
                onScrollUp();
            } else {
                onScrollDown();
            }
        }
    }
    //设置滑动距离
    public void setScrollThreshold(int scrollThreshold) {
        mScrollThreshold = scrollThreshold;
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
