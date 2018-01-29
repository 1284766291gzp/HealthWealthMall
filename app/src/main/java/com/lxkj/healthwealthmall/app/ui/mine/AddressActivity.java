package com.lxkj.healthwealthmall.app.ui.mine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.TextView;

import com.example.xrecyclerview.XRecyclerView;
import com.lxkj.healthwealthmall.R;
import com.lxkj.healthwealthmall.app.adapter.AddressAdapter;
import com.lxkj.healthwealthmall.app.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;


/**
 * 地址管理
 * Created by Administrator on 2017/6/1 0001.
 */

public class AddressActivity extends BaseActivity {

    private XRecyclerView recyclerView;
    private AddressAdapter adapter;
    private List<String> addressList=new ArrayList<>();

    public static int flag;
//    private Convention_223 convention223;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_recycler);
        initTitle("地址管理");
        init();
    }


    private void init() {

        recyclerView = (XRecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setPullRefreshEnabled(false);
        recyclerView.setLoadingMoreEnabled(false);

        adapter = new AddressAdapter(this, addressList);
        recyclerView.setAdapter(adapter);

//        convention223 = new Convention_223(this);
//        convention223.setConventionCallBack(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
//        convention223.ConventionList();
    }


//    @Override
//    public void convention(List<YuYueRenBean.conventionBean> conventionList) {
//        YuYueRenAdapter adapter = new YuYueRenAdapter(YuYueRenActivity.this, conventionList);
//        recyclerView.setAdapter(adapter);
//    }
}
