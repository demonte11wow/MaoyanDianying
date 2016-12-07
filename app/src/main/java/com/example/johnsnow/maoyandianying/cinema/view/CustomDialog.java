package com.example.johnsnow.maoyandianying.cinema.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioGroup;

import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.R;

import java.util.ArrayList;
import java.util.zip.Inflater;


/**
 * Created by JohnSnow on 2016/12/6.
 */
public class CustomDialog extends DialogFragment {
    private Context mContext;
    private int layout;
    private int dy;
    private int dx;
    View view;
    private ArrayList<BaseFragment> fragments;
    private int position;
    RadioGroup rgMain;
    private BaseFragment content;
    private Inflater inflater;

    public CustomDialog(Context mContext,int x,int y){
        this.mContext = mContext;
        this.dx = x;
        this.dy = y;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = inflater.inflate(R.layout.dialog_quyu, container);
        return view;
    }

    public void onStart() {
        super.onStart();
        Window win = getDialog().getWindow();
        // 一定要设置Background，如果不设置，window属性设置无效
        win.setBackgroundDrawable( new ColorDrawable(Color.WHITE));

        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics( dm );

        WindowManager.LayoutParams params = win.getAttributes();
        // 使用ViewGroup.LayoutParams，以便Dialog 宽度充满整个屏幕
        params.width =  ViewGroup.LayoutParams.MATCH_PARENT;
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        params.x = dx;
        params.y = dy-755;
        win.setAttributes(params);
    }
}
