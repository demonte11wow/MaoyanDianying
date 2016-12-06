package com.example.johnsnow.maoyandianying.cinema.view;

import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.rey.material.app.Dialog;

/**
 * Created by JohnSnow on 2016/12/6.
 */
public class CustomDialog extends Dialog {
    private Context mContext;
    private int layout;
    private int dy;
    private int dx;

    public CustomDialog(Context context, int layout,int dx, int dy) {
        super(context);
        this.mContext = context;
        this.layout = layout;
        this.dy = dy;
        this.dx = dx;
        View view = getLayoutInflater().inflate(layout, null);
        super.setContentView(view);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
//        getWindow().setGravity(Gravity.BOTTOM); //显示在底部
        Window dialogWindow = getWindow();
        WindowManager m = getWindow().getWindowManager();
        Display d = m.getDefaultDisplay();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes();
        lp.x = dx; // 新位置X坐标
        lp.y = dy; // 新位置Y坐标
        lp.height = 800;
        lp.width = d.getWidth();
        lp.dimAmount =0f;

        //设置dialog的宽度为当前手机屏幕的宽度
        getWindow().setAttributes(lp);
    }
}
