package com.example.johnsnow.maoyandianying.mycenter;

import android.view.View;

import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.R;

/**
 * Created by JohnSnow on 2016/11/30.
 */
public class MyCenterFragment extends BaseFragment {
    @Override
    public View initView() {
        View view = View.inflate(getContext(), R.layout.mycenter_fragment,null);
        return view;
    }
}
