package com.example.johnsnow.maoyandianying.splash;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.example.johnsnow.maoyandianying.MainActivity;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.global.MyConstants;
import com.example.johnsnow.maoyandianying.splash.bean.SplashBean;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;

public class SplashActivity extends AppCompatActivity {
    @Bind(R.id.splash_fr)
    RelativeLayout splash_fr;

    @Bind(R.id.server_splash)
    ImageView server_splash;

    @Bind(R.id.skip_btn)
    Button skip_btn;
    int lastSecond = 5;
    boolean isStart = false;


    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {

            super.handleMessage(msg);
            switch (msg.what){
                case 0:
                    getSplashImageFromServer();
                    break;
                case 1:
                    startMainActivity();
                    break;
                case 2:
                    if(lastSecond > 0){
                        skip_btn.setText("跳过:" + lastSecond-- + "s");
                        sendEmptyMessageDelayed(2,1000);
                    }
                    break;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 去掉窗口标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 隐藏顶部的状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

//        getSplashImageFromServer();
        handler.sendEmptyMessageDelayed(0,2000);
    }

    private void getSplashImageFromServer() {
        OkHttpUtils
                .get()
                .url(MyConstants.SPLASH_PAGER)
                .id(100)
                .build()
                .execute(new MyStringCallback());
    }


    private class MyStringCallback extends StringCallback {

        @Override
        public void onError(Call call, Exception e, int id) {
            Log.e("TAG", "联网失败" + e.getMessage());
            startMainActivity();
        }

        @Override
        public void onResponse(String response, int id) {

            switch (id) {
                case 100:
                    if (response != null) {
                        processData(response);
                    }
                    break;
                case 101:
//                    Toast.makeText(mContext, "https", Toast.LENGTH_SHORT).show();
                    break;
            }
        }

    }

    private void processData(String response) {
        Gson gson = new Gson();
        SplashBean sBean = gson.fromJson(response, SplashBean.class);
        String splashUrl = sBean.getPosters().get(0).getPic();
        Glide
                .with(this)
                .load(splashUrl)
                .asBitmap() //必须写，否则会报类型转化异常
                .into(target); //此处为target
    }

    private SimpleTarget target = new SimpleTarget<Bitmap>(){
        @Override
        public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
            //使用bitmap做一些事,如
            if(null != resource){
                server_splash.setImageBitmap(resource);
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);//0:完全透明 1：完全不透明
            alphaAnimation.setDuration(1000);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());//设置动画的变化率
            handler.sendEmptyMessageDelayed(1,6000);
            handler.sendEmptyMessageDelayed(2,1000);
            server_splash.startAnimation(alphaAnimation);
        }
    };


    @OnClick(R.id.skip_btn)
    void skip_btn_click() {
        startMainActivity();
    }

    private void startMainActivity() {
        if(!isStart){
            isStart = true;
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            //关闭当前页面
            finish();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }
}
