package com.example.johnsnow.maoyandianying.cinema;

import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.cinema.adapter.CinemaAdapter;
import com.example.johnsnow.maoyandianying.cinema.view.CustomDialog;
import com.example.johnsnow.maoyandianying.cinema.view.MyListView;

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

    @Override
    public View initView() {
        View view = View.inflate(getContext(), R.layout.cinema_fragment, null);
        rv_square = (TextView) view.findViewById(R.id.rv_square);
        rv_liwozuijin = (TextView) view.findViewById(R.id.rv_liwozuijin);
        rv_label = (TextView) view.findViewById(R.id.rv_label);
        rv_texiao = (TextView) view.findViewById(R.id.rv_texiao);
        ciemaListView = (MyListView) view.findViewById(R.id.cinema_list);
        lt_title = (LinearLayout) view.findViewById(R.id.lt_title);
        CinemaAdapter adapter = new CinemaAdapter(getActivity());
        ciemaListView.setAdapter(adapter);
        initListener();
        WindowManager wm = getActivity().getWindowManager();
        width = wm.getDefaultDisplay().getWidth();

        return view;
    }

    private void initListener() {
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
                lt_title.getLocationOnScreen(location);
                int x = location[0];
                int y = location[1];

                Toast.makeText(mContext, "a", Toast.LENGTH_SHORT).show();
                cd1 = new CustomDialog(mContext, R.layout.dialog_quyu, x,y);
                //获得当前窗体

                Window dialogWindow = cd1.getWindow();
                dialogWindow.setGravity(Gravity.LEFT | Gravity.TOP);

                cd1.show();

                break;
            case R.id.rv_liwozuijin:
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
}

