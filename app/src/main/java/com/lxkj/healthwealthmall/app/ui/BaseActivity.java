package com.lxkj.healthwealthmall.app.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.lxkj.healthwealthmall.R;
import com.lxkj.healthwealthmall.app.util.AppManager;
import com.lxkj.healthwealthmall.app.util.ProgressDialogs;
import com.lxkj.healthwealthmall.app.util.StatusBarUtil;


/**
 * Created by Slingge on 2017/1/24 0024.
 */

public class BaseActivity extends AppCompatActivity {

    private ImageView image_right;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppManager.addActivity(this);
        if (android.os.Build.VERSION.SDK_INT > 19) {
            StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.colorTheme));
        }
        this.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    protected void initTitle(String title) {
        TextView tv_title = (TextView) findViewById(R.id.tv_title);
        tv_title.setText(title);
        ImageView iv_back = (ImageView) findViewById(R.id.image_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        image_right = (ImageView) findViewById(R.id.image_right);
        image_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }


    protected void GoneRightImage() {
        image_right = (ImageView) findViewById(R.id.image_right);
        image_right.setVisibility(View.INVISIBLE);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ProgressDialogs.dismissDialog();
    }

}
