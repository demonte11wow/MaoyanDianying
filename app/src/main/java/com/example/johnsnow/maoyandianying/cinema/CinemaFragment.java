package com.example.johnsnow.maoyandianying.cinema;

import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.cinema.adapter.CinemaAdapter;
import com.example.johnsnow.maoyandianying.cinema.bean.CinemaBean;
import com.example.johnsnow.maoyandianying.cinema.view.CustomDialog;
import com.example.johnsnow.maoyandianying.cinema.view.MyListView;
import com.example.johnsnow.maoyandianying.global.MyConstants;
import com.example.johnsnow.maoyandianying.utils.PreferenceUtils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * Created by JohnSnow on 2016/11/30.
 */
public class CinemaFragment extends BaseFragment implements View.OnClickListener {
    MyListView ciemaListView;
    TextView rv_square;
    TextView rv_liwozuijin;
    TextView rv_label;
    TextView rv_texiao;
    CustomDialog cd1;
    LinearLayout lt_title;
    int width;
    RadioGroup rgMain;
    private BaseFragment content;
    private ArrayList<BaseFragment> fragments;
    private int position;
    private FrameLayout cinema_qy;
    private CinemaBean ciBean;
    private List districtAddressBeen;
    private ImageView image;

    @Override
    public View initView() {
        View view = View.inflate(getContext(), R.layout.cinema_fragment, null);
        rv_square = (TextView) view.findViewById(R.id.rv_square);
        rv_liwozuijin = (TextView) view.findViewById(R.id.rv_liwozuijin);
        rv_label = (TextView) view.findViewById(R.id.rv_label);
        rv_texiao = (TextView) view.findViewById(R.id.rv_texiao);
        ciemaListView = (MyListView) view.findViewById(R.id.cinema_list);
        lt_title = (LinearLayout) view.findViewById(R.id.lt_title);
        image = (ImageView) view.findViewById(R.id.title_image);

        Glide.with(getActivity())
                .load("http://p0.meituan.net/mmc/cfaecf5537e66f5aec2ce4908456238b87263.jpg")
                .asBitmap() //必须写，否则会报类型转化异常
                .into(image);
//        cinema_qy = (FrameLayout) view.findViewById(R.id.cinema_qy);
//        initPopListener();
//        WindowManager wm = getActivity().getWindowManager();
//        width = wm.getDefaultDisplay().getWidth();

        getDataReFromServer(MyConstants.CINEMA_URL);
        return view;
    }

    private void initPopListener() {
        rv_square.setOnClickListener(this);
        rv_liwozuijin.setOnClickListener(this);
        rv_label.setOnClickListener(this);
        rv_texiao.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rv_square:
                int[] location = new int[2];
                rv_square.getLocationOnScreen(location);
                int x = location[0];
                int y = location[1];
//                Toast.makeText(mContext, "a", Toast.LENGTH_SHORT).show();
//                cd1 = new CustomDialog(mContext,x,y);
//                cd1.show(getFragmentManager(), "sqdialog");
                cinema_qy.setVisibility(View.VISIBLE);
                break;
            case R.id.rv_liwozuijin:
                cinema_qy.setVisibility(View.GONE);
                Toast.makeText(mContext, "b", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rv_label:
                Toast.makeText(mContext, "c", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rv_texiao:
                Toast.makeText(mContext, "d", Toast.LENGTH_SHORT).show();
                break;
        }
    }


    private void getDataReFromServer(String url) {
        OkHttpUtils
                .get()
                .url(url)
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
                    if (response != null) {
                        processData(response);
                        String district = PreferenceUtils.getString(mContext, "currentDistrict");
                        
                        switch (district) {
                            case "朝阳区":
                                districtAddressBeen = ciBean.getData().get朝阳区();
                                break;
                            case "东城区":
                                districtAddressBeen = ciBean.getData().get东城区();
                                break;
                            case "丰台区":
                                districtAddressBeen = ciBean.getData().get丰台区();
                                break;
                            case "大兴区":
                                districtAddressBeen = ciBean.getData().get大兴区();
                                break;
                            case "密云县":
                                districtAddressBeen = ciBean.getData().get密云县();
                                break;
                            case "平谷区":
                                districtAddressBeen = ciBean.getData().get平谷区();
                                break;
                            case "延庆县":
                                districtAddressBeen = ciBean.getData().get延庆县();
                                break;
                            case "怀柔区":
                                districtAddressBeen = ciBean.getData().get怀柔区();
                                break;
                            case "房山区":
                                districtAddressBeen = ciBean.getData().get房山区();
                                break;
                            case "海淀区":
                                districtAddressBeen = ciBean.getData().get海淀区();
                                break;
                            case "石景山区":
                                districtAddressBeen = ciBean.getData().get石景山区();
                                break;
                            case "西城区":
                                districtAddressBeen = ciBean.getData().get西城区();
                                break;
                            case "通州区":
                                districtAddressBeen = ciBean.getData().get通州区();
                                break;
                            case "门头沟区":
                                districtAddressBeen = ciBean.getData().get门头沟区();
                                break;
                            case "顺义区":
                                districtAddressBeen = ciBean.getData().get顺义区();
                                break;
                            case "昌平区":
                                districtAddressBeen = ciBean.getData().get昌平区();
                                break;
                        }
                        ciemaListView.setAdapter(new CinemaAdapter(mContext, districtAddressBeen, district));
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
        ciBean = gson.fromJson(response, CinemaBean.class);
    }

//    private void showPopupWindow(View view) {
//
//        // 一个自定义的布局，作为显示的内容
//        View contentView = LayoutInflater.from(mContext).inflate(
//                R.layout.dialog_quyu, null);
//        // 设置按钮的点击事件
//        rgMain = (RadioGroup) contentView.findViewById(R.id.dg_main);
//        initFragment();
//        initListener();
//        rgMain.check(R.id.rb_shangquan);
//
//
//
//        final PopupWindow popupWindow = new PopupWindow(contentView,
//                WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT, true);
//
//        popupWindow.setTouchable(true);
//
//        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
//
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//
//                Log.i("mengdd", "onTouch : ");
//
//                return false;
//                // 这里如果返回true的话，touch事件将被拦截
//                // 拦截后 PopupWindow的onTouchEvent不被调用，这样点击外部区域无法dismiss
//            }
//        });
//
//        // 如果不设置PopupWindow的背景，无论是点击外部区域还是Back键都无法dismiss弹框
//        // 我觉得这里是API的一个bug
////        popupWindow.setBackgroundDrawable(getResources().getDrawable(
////                R.drawable.ic_empty_cute_girl_box));
//
//        // 设置好参数之后再show
//        popupWindow.showAsDropDown(view);
//    }


}

