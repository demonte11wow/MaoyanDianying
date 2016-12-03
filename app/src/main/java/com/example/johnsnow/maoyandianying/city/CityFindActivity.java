package com.example.johnsnow.maoyandianying.city;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;

import com.example.johnsnow.maoyandianying.R;
import com.example.johnsnow.maoyandianying.city.fragment.CityFragment;
import com.example.johnsnow.maoyandianying.utils.ActionBarUtils;

import immortalz.me.library.TransitionsHeleper;
import immortalz.me.library.bean.InfoBean;
import immortalz.me.library.method.ColorShowMethod;

public class CityFindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBarUtils.initActionBar(this,"#ff0099cc");
        setContentView(R.layout.activity_city_find);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, CityFragment.newInstance())
                .commit();
        TransitionsHeleper.getInstance()
                .setShowMethod(new ColorShowMethod(R.color.light_blue_color, R.color.cardview_light_background) {
                    @Override
                    public void loadCopyView(InfoBean bean, ImageView copyView) {
                        AnimatorSet set = new AnimatorSet();
                        set.playTogether(
                                ObjectAnimator.ofFloat(copyView, "rotation", 0, 180),
                                ObjectAnimator.ofFloat(copyView, "scaleX", 1, 0),
                                ObjectAnimator.ofFloat(copyView, "scaleY", 1, 0)
                        );
                        set.setInterpolator(new AccelerateInterpolator());
                        set.setDuration(duration / 4 * 5).start();
                    }

                    @Override
                    public void loadTargetView(InfoBean bean, ImageView targetView) {

                    }

                })
                .show(this, null);
    }

}
