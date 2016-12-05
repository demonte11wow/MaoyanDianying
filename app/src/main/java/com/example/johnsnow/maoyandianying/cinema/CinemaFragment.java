package com.example.johnsnow.maoyandianying.cinema;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.cinema.adapter.CinemaAdapter;
import com.example.johnsnow.maoyandianying.cinema.view.MyListView;

import java.util.List;

/**
 * Created by JohnSnow on 2016/11/30.
 */
public class CinemaFragment extends BaseFragment {
    MyListView ciemaListView;
    private List<String> titles;

    @Override
    public View initView() {
        View view = View.inflate(getContext(), R.layout.cinema_fragment, null);
        ciemaListView = (MyListView) view.findViewById(R.id.cinema_list);

        CinemaAdapter adapter = new CinemaAdapter(getActivity());

        ciemaListView.setAdapter(adapter);
        setListViewHeightBasedOnChildren(ciemaListView);
        return view;
    }

    private void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter(); //获得Adapter
        if (listAdapter == null) {  //判断是否为空
            return;
        }
        int totalHeight = 0;  //定义总高度
        //根据listAdapter.getCount()获取当前拥有多少个item项，然后进行遍历对每一个item获取高度再相加最终获得总的高度。
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }
        //获取到list的布局属性
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        //listview最终高度为item的高度+分隔线的高度，这是重新设置listview的属性
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        //将重新设置的params再应用到listview中
        listView.setLayoutParams(params);
    }
}
