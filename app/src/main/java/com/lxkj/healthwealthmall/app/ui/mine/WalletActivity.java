package com.lxkj.healthwealthmall.app.ui.mine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.xrecyclerview.XRecyclerView;
import com.lxkj.healthwealthmall.R;
import com.lxkj.healthwealthmall.app.MyApplication;
import com.lxkj.healthwealthmall.app.adapter.WalletAdapter;
import com.lxkj.healthwealthmall.app.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2017/5/3 0003.
 * 我的钱包
 */

public class WalletActivity extends BaseActivity implements View.OnClickListener {

    private TextView txt_history,txt_money,txt_waitmoney,txt_endmoney;

    private XRecyclerView recyclerView;
    private WalletAdapter mAdapter;
    private List<String> walletList=new ArrayList<>();

    private int nowPage = 1, totalPage = 1;
    private boolean isFirst = true;
    private int onRefresh = 0;

    private String money;
    private String path="/get/register/mywallet";
    private String pathlist="/api/consume/moneylist";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_recycler);
        initTitle("我的钱包");
        initView();
    }

    private void initView() {

        recyclerView=(XRecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setPullRefreshEnabled(false);
        recyclerView.addHeaderView(setHeaderView());
        recyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
//                walletList.clear();
//                mAdapter.notifyDataSetChanged();
//                nowPage = 1;
//                onRefresh = 1;
//                getlist(nowPage);
            }

            @Override
            public void onLoadMore() {
                nowPage++;
                if (nowPage > totalPage) {
                    recyclerView.noMoreLoading();
                } else {
                    onRefresh = 2;
//                    getlist(nowPage);
                }
            }
        });

        mAdapter = new WalletAdapter(this, walletList);
        recyclerView.setAdapter(mAdapter);

//        getData();
//        getlist(nowPage);
    }


    private View setHeaderView()
    {
        View view = LayoutInflater.from(this).inflate(R.layout.header_wallet_layout, null, false);
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        TextView tv_submit=(TextView)view.findViewById(R.id.tv_submit);
        tv_submit.setOnClickListener(this);

        txt_history=(TextView)view.findViewById(R.id.txt_history);
        txt_money=(TextView)view.findViewById(R.id.txt_money);
        txt_waitmoney=(TextView)view.findViewById(R.id.txt_waitmoney);
        txt_endmoney=(TextView)view.findViewById(R.id.txt_endmoney);
        return view;
    }





//    private void getData()
//    {
//        ProgressDialogs.showProgressDialog(this, "");
//        OkHttpUtils.post().url(MyApplication.Url+path)
//                .addParams("uid", SharedPreferencesUtil.getSharePreStr(this,"uid"))
//                .build()
//                .execute(new StrCallback() {
//                             @Override
//                             public void onResponse(String response, int id) {
//                                 super.onResponse(response, id);
//                                 WalletBean bean=new Gson().fromJson(response,WalletBean.class);
//                                 if (bean.status.equals("ok")) {
//                                     money=bean.data.money;
//                                     txt_history.setText(bean.data.history);
//                                     txt_money.setText(bean.data.money);
//                                     txt_waitmoney.setText(bean.data.waitmoney);
//                                     txt_endmoney.setText(bean.data.endmoney);
//
//                                 } else {
//                                     ToastUtil.showToast(bean.msg);
//                                 }
//                             }
//                         }
//                );
//    }
//
//
//    private void getlist(int page)
//    {
//        if (isFirst) {
//            ProgressDialogs.showProgressDialog(this, "");
//            isFirst = false;
//        }
//        OkHttpUtils.post().url(MyApplication.Url+pathlist)
//                .addParams("uid", SharedPreferencesUtil.getSharePreStr(this,"uid"))
//                .addParams("page",String.valueOf(page))
//                .build()
//                .execute(new StrCallback() {
//                             @Override
//                             public void onResponse(String response, int id) {
//                                 super.onResponse(response, id);
//                                 WalletListBean bean = new Gson().fromJson(response, WalletListBean.class);
//                                 if (bean.status.equals("ok")) {
//                                     if (!TextUtils.isEmpty(bean.dialog))
//                                     {
//                                         totalPage = Integer.parseInt(bean.dialog);
//                                     }
//                                     if (bean.data!=null)
//                                     {
//                                         walletList.addAll(bean.data);
//                                     }
//                                     if (walletList.size() == 0 ||totalPage == 1) {
//                                         recyclerView.noMoreLoading();
//                                     }
//                                     if (onRefresh == 1) {
//                                         recyclerView.refreshComplete();
//                                     } else if (onRefresh == 2) {
//                                         recyclerView.loadMoreComplete();
//                                     }
//                                     mAdapter.notifyDataSetChanged();
//                                 } else {
//                                     ToastUtil.showToast(bean.msg);
//                                 }
//                             }
//                         }
//                );
//    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_submit: //提现
                Bundle bundle=new Bundle();
                bundle.putString("money",money);
//                MyApplication.openActivity(this,ReflectActivity.class,bundle);
                break;
        }

    }

}
