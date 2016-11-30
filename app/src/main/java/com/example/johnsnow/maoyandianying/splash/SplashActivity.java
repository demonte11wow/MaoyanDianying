package com.example.johnsnow.maoyandianying.splash;

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
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.global.MyConstants;
import com.example.johnsnow.maoyandianying.splash.bean.SplashBean;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.Call;

public class SplashActivity extends AppCompatActivity {
    @Bind(R.id.splash_fr)
    RelativeLayout splash_fr;

    @Bind(R.id.server_splash)
    ImageView server_splash;

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            getSplashImageFromServer();
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
        }

        @Override
        public void onResponse(String response, int id) {

            switch (id) {
                case 100:
                    Log.e("suc","suc");
                    Log.e("i am here1","i am here1");
                    if (response != null) {
                        Log.e("i am here2","i am here2");
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
        Log.e("suc2",sBean.toString());
        String splashUrl = sBean.getPosters().get(0).getPic();
        Log.e("suc2",splashUrl);
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
            server_splash.setImageBitmap(resource);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);//0:完全透明 1：完全不透明
            alphaAnimation.setDuration(3000);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());//设置动画的变化率
            server_splash.startAnimation(alphaAnimation);
        }
    };
}
