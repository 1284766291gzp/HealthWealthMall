package com.lxkj.healthwealthmall.app.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.lxkj.healthwealthmall.R;
import com.lxkj.healthwealthmall.app.adapter.MyFragmentPagerAdapter;
import com.lxkj.healthwealthmall.app.ui.mine.MyFragment;
import com.lxkj.healthwealthmall.app.ui.shouye.ShouYeFragment;
import com.lxkj.healthwealthmall.app.util.AppManager;
import com.lxkj.healthwealthmall.app.util.StatusBarUtil;
import com.lxkj.healthwealthmall.app.view.CustomViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    public CustomViewPager viewPager;

    private TextView tv_title;
    private RelativeLayout rl;
    private ImageView iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setContentView(R.layout.activity_main);
        init();
        initvViewPager();
    }


    private void init() {
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_title.setText("健康财富商城");
        iv_back = (ImageView) findViewById(R.id.image_back);
        iv_back.setVisibility(View.INVISIBLE);
        iv_back.setOnClickListener(this);
        final ImageView image_right = (ImageView) findViewById(R.id.image_right);
        image_right.setVisibility(View.INVISIBLE);
        image_right.setOnClickListener(this);
        rl = (RelativeLayout) findViewById(R.id.rl);

        RadioButton rb1 = (RadioButton) findViewById(R.id.rb_1);
        rb1.setChecked(true);
        rl.setVisibility(View.VISIBLE);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_1:
                        rl.setVisibility(View.VISIBLE);
                        tv_title.setText("健康财富商城");
                        viewPager.setCurrentItem(0);
                        iv_back.setVisibility(View.INVISIBLE);
                        image_right.setVisibility(View.INVISIBLE);
                        StatusBarUtil.setColorNoTranslucent(MainActivity.this, getResources().getColor(R.color.colorTheme));
                        break;
                    case R.id.rb_2:
                        rl.setVisibility(View.VISIBLE);
                        tv_title.setText("商城简报");
                        viewPager.setCurrentItem(1);
                        iv_back.setVisibility(View.INVISIBLE);
                        image_right.setVisibility(View.INVISIBLE);
                        StatusBarUtil.setColorNoTranslucent(MainActivity.this, getResources().getColor(R.color.colorTheme));
                        break;
                    case R.id.rb_3:
                        rl.setVisibility(View.GONE);
//                        tv_title.setText("预约车");
                        viewPager.setCurrentItem(2);
                        iv_back.setVisibility(View.INVISIBLE);
                        image_right.setVisibility(View.INVISIBLE);
                        StatusBarUtil.setColorNoTranslucent(MainActivity.this, getResources().getColor(R.color.statusbarcolor));
                        break;
                }
            }
        });
    }


    private void initvViewPager() {
        viewPager = (CustomViewPager) findViewById(R.id.viewPager);
        List<Fragment> list = new ArrayList<>();
        list.add(new ShouYeFragment());
        list.add(new ShouYeFragment());
        list.add(new MyFragment());
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(adapter);
    }


    private long exitTime = 0;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                exitTime = System.currentTimeMillis();
            } else {
                new AppManager().finishAllActivity();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image_back://设置
                break;
            case R.id.image_right:
                break;
        }
    }


}
