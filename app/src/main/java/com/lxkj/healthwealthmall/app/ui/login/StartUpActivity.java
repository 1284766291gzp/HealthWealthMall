package com.lxkj.healthwealthmall.app.ui.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;


import com.lxkj.healthwealthmall.R;
import com.lxkj.healthwealthmall.app.MyApplication;
import com.lxkj.healthwealthmall.app.ui.BaseActivity;
import com.lxkj.healthwealthmall.app.ui.MainActivity;
import com.lxkj.healthwealthmall.app.util.SharedPreferencesUtil;
import com.lxkj.healthwealthmall.app.util.StatusBarUtil;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Slingge on 2017/5/16 0016.
 */

public class StartUpActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        StatusBarUtil.statusBar(this);
        toTask();
    }


    private void toTask() {
        final String uid = SharedPreferencesUtil.getSharePreStr(this, "uId");
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
//                boolean isFirst = SharedPreferencesUtil.getSharePreBoolean(StartUpActivity.this, "isFirst");
//                if (!isFirst) {
//                    MyApplication.openActivity(StartUpActivity.this, WelComeActivity.class);
//                    finish();
//                    return;
//                }
                if (!TextUtils.isEmpty(uid)) {
                    MyApplication.uId = uid;
                    MyApplication.openActivity(StartUpActivity.this, MainActivity.class);
                } else {
//                    MyApplication.openActivity(StartUpActivity.this, SignInActivity.class);
                }
                finish();
            }
        };
        timer.schedule(task, 2000);//第一次执行前的毫秒延迟时间。在随后的执行之间毫秒内的时间
    }


}
