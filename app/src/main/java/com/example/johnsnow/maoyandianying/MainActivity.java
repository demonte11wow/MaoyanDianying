package com.example.johnsnow.maoyandianying;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.johnsnow.maoyandianying.Base.BackHandledInterface;
import com.example.johnsnow.maoyandianying.Base.BaseFragment;
import com.example.johnsnow.maoyandianying.cinema.CinemaFragment;
import com.example.johnsnow.maoyandianying.film.FilmFragment;
import com.example.johnsnow.maoyandianying.film.fragment.FragmentRevealExample;
import com.example.johnsnow.maoyandianying.find.FindFragment;
import com.example.johnsnow.maoyandianying.mycenter.MyCenterFragment;
import com.example.johnsnow.maoyandianying.utils.ActionBarUtils;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity implements BackHandledInterface {
    private static final int WRITE_COARSE_LOCATION_REQUEST_CODE = 0;
    @Bind(R.id.frameLayout)
    FrameLayout frameLayout;
    @Bind(R.id.rb_cinema)
    RadioButton rb_cinema;
    @Bind(R.id.rb_film)
    RadioButton rb_film;
    @Bind(R.id.rb_find)
    RadioButton rb_find;
    @Bind(R.id.rb_mycenter)
    RadioButton rb_mycenter;
    @Bind(R.id.rg_main)
    RadioGroup rgMain;

    private BaseFragment mBackHandedFragment;
    private boolean hadIntercept;

    private ArrayList<BaseFragment> fragments;
    private BaseFragment content;
    private int position;
    FilmFragment filmFragment;
    Bundle bundle;

    //SDK在Android 6.0下需要进行运行检测的权限如下：
//    Manifest.permission.ACCESS_COARSE_LOCATION,
//    Manifest.permission.ACCESS_FINE_LOCATION,
//    Manifest.permission.WRITE_EXTERNAL_STORAGE,
//    Manifest.permission.READ_EXTERNAL_STORAGE,
//    Manifest.permission.READ_PHONE_STATE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBarUtils.initActionBar(this, "#ff0099cc");
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initFragment();
        initListener();
        rgMain.check(R.id.rb_film);
        //这里以ACCESS_COARSE_LOCATION为例
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            //申请WRITE_EXTERNAL_STORAGE权限
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
                    WRITE_COARSE_LOCATION_REQUEST_CODE);//自定义的code
        }
    }

    @Override
    public void setSelectedFragment(BaseFragment selectedFragment) {
        this.mBackHandedFragment = selectedFragment;
    }

    @Override
    public void onBackPressed() {
        if (mBackHandedFragment == null || !mBackHandedFragment.onBackPressed()) {
            if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
                super.onBackPressed();
            } else {
//                getSupportFragmentManager().popBackStack();
                FragmentRevealExample fragment = (FragmentRevealExample) getSupportFragmentManager().findFragmentByTag("fragment_my");
                if (fragment != null) {
                    fragment.onBackPressed();
                } else {
                    onBackPressed();
                }
            }
        }
    }

    private void initFragment() {
        fragments = new ArrayList<>();
        filmFragment = new FilmFragment();


        fragments.add(filmFragment);
        fragments.add(new CinemaFragment());
        fragments.add(new FindFragment());
        fragments.add(new MyCenterFragment());
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void initListener() {
        rgMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_film:
                        Log.e("chenTag", "" + 0);
                        position = 0;
                        break;
                    case R.id.rb_cinema:
                        Log.e("chenTag", "" + 1);
                        position = 1;
                        break;
                    case R.id.rb_find:
                        Log.e("chenTag", "" + 2);
                        position = 2;
                        break;
                    case R.id.rb_mycenter:
                        Log.e("chenTag", "" + 3);
                        position = 3;
                        break;
                    default:
                        break;
                }
                BaseFragment baseFragment = getFragment(position);
                switchFragment(content, baseFragment);
            }
        });
    }

    private BaseFragment getFragment(int position) {
        if (fragments != null && fragments.size() > 0) {
            BaseFragment baseFragment = fragments.get(position);
            return baseFragment;
        }
        return null;
    }

    private void switchFragment(BaseFragment fromFragment, BaseFragment toFragment) {
        if (toFragment != content) { //解决radioGroup自身的bug，点选会连点两次。导致崩溃
            content = toFragment;
            if (toFragment != null) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                if (!toFragment.isAdded()) {
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction.add(R.id.frameLayout, toFragment,toFragment.getClass().toString()).commit();
                } else {
                    if (fromFragment != null) {
                        transaction.hide(fromFragment);
                    }
                    transaction.show(toFragment).commit();
                }
            }
        }
    }

//    @Override
//    public void onBackPressed() {
//        FragmentRevealExample fragment = (FragmentRevealExample)getSupportFragmentManager().findFragmentByTag("fragment_my");
//        if(fragment!=null) {
//            fragment.onBackPressed();
//        }else {
//            onBackPressed();
//        }
//    }
}
