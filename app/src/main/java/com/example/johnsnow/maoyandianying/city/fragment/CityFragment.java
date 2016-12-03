package com.example.johnsnow.maoyandianying.city.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.city.adapter.CityFindAdapter;
import com.example.johnsnow.maoyandianying.city.bean.CityBean;
import com.example.johnsnow.maoyandianying.city.view.IndexView;
import com.example.johnsnow.maoyandianying.utils.TReadUtils;
import com.google.gson.Gson;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JohnSnow on 2016/12/3.
 */
public class CityFragment extends Fragment {
    RecyclerView recyclerView;
    TReadUtils rt;
    String c_list;
    List<String> pinyingList;
    private TextView tv_main_word;

    private IndexView iv_main_words;//索引

    private Handler handler = new Handler();

    public static Fragment newInstance() {
        return new CityFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_city, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        initReList();
        iv_main_words = (IndexView) view.findViewById(R.id.iv_main_words);
        tv_main_word = (TextView) view.findViewById(R.id.tv_main_word);

//        iv_main_words.setOnIndexChangeListener(new IndexView.OnIndexChangeListener() {
//            @Override
//            public void onIndexChange(String word) {
//                updateWord(word);
//                updateListView(word);
//            }
//        });

        iv_main_words
                .setOnTouchLetterChangeListenner(new IndexView.OnTouchLetterChangeListenner() {

                    @Override
                    public void onTouchLetterChange(MotionEvent event, String s) {

                        tv_main_word.setText(s);
                        switch (event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                            case MotionEvent.ACTION_MOVE:
                                tv_main_word.setVisibility(View.VISIBLE);
                                break;

                            case MotionEvent.ACTION_UP:
                            default:
                                tv_main_word.postDelayed(new Runnable() {

                                    @Override
                                    public void run() {
                                        tv_main_word.setVisibility(View.GONE);
                                    }
                                }, 100);
                                break;
                        }
//                        int position = pinyingList.;//这个array就是传给自定义Adapter的
//                        recyclerView.scrollToPosition(position);

                        for (int i = 0; i < pinyingList.size(); i++) {
//                            String preWord = pinyingList.get(i).substring(0, 1);
                            if (pinyingList.get(i).startsWith(s)) {
                                recyclerView.scrollToPosition(i);
                                break;
                            }
                        }
                    }
                });


        return view;
    }

//    private void updateListView(String word) {
//
//        for(int i = 0; i < pinyingList.size(); i++) {
//            String preWord= pinyingList.get(i).substring(0,1);
//            if(preWord.equals(word)) {
//                recyclerView.scrollToPosition(i);
//            }
//        }
//    }
//
//    private void updateWord(String word) {
//        tv_main_word.setText(word);
//        tv_main_word.setVisibility(View.VISIBLE);
//        handler.removeCallbacksAndMessages(0);
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                tv_main_word.setVisibility(View.GONE);
//            }
//        },2000);
//    }


    private void initReList() {
        Log.e("chentTAG", "i BEGIN");
        rt = new TReadUtils(getActivity());
        c_list = rt.readJson();

        Log.e("chentTAG", c_list);

        Gson gson = new Gson();
        CityBean cb = gson.fromJson(c_list, CityBean.class);//CityName.cityNameList
        List<CityBean.DataBean> cbNameList = cb.getData();
        pinyingList = new ArrayList<String>();
        String[] NameList = new String[cbNameList.size()];
        //排序
        bubble_sort(cbNameList);

        for (int i = 0; i < cbNameList.size(); i++) {
            pinyingList.add(cbNameList.get(i).getPinyin());
            NameList[i] = cbNameList.get(i).getName();
        }

        CityFindAdapter adapter = new CityFindAdapter(pinyingList);
        adapter.addAll(NameList);
        recyclerView.setAdapter(adapter);

        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        // Add the sticky headers decoration
        final StickyRecyclerHeadersDecoration headersDecor = new StickyRecyclerHeadersDecoration(adapter);
        recyclerView.addItemDecoration(headersDecor);

        // Add decoration for dividers between list items
//        recyclerView.addItemDecoration(new DividerDecoration(getActivity()));
    }

    private void bubble_sort(List<CityBean.DataBean> cbNameList) {
        for (int i = 0; i < cbNameList.size(); i++) {
            for (int j = i; j < cbNameList.size(); j++) {
                if (cbNameList.get(i).getPinyin().charAt(0) > cbNameList.get(j).getPinyin().charAt(0)) {
                    CityBean.DataBean temp = cbNameList.get(i);
                    cbNameList.set(i, cbNameList.get(j));
                    cbNameList.set(j, temp);
                }
            }
        }
    }
}
