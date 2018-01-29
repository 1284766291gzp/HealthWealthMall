package com.lxkj.healthwealthmall.app.ui.mine;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lxkj.healthwealthmall.R;
import com.lxkj.healthwealthmall.app.MyApplication;
import com.lxkj.healthwealthmall.app.ui.BaseFragment;
import com.nostra13.universalimageloader.core.ImageLoader;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Slingge on 2017/4/24 0024.
 */

public class MyFragment extends BaseFragment implements View.OnClickListener {

//    private CircleImageView ivHeader;//头像
//    private TextView tvName;//名字
//    private RadioButton radioWallet;//我的钱包
//    private RadioButton radioDiscount;//我的优惠券
//    private RadioButton radioCorcen;//我的关注
//    private RelativeLayout relOrder;//我的订单
//    private RadioButton radioPaying;//代付款
//    private RadioButton radioConfirm;//待确认
//    private RadioButton radioComment;//待评价
//    private RadioButton radioRefound;//退款
//    private RadioButton radioCustomer;//客服中心
//    private RadioButton radioSettled;//入驻合作
//    private RadioButton radioFriend;//邀请好友
//    private ImageView ivBottom;//最下面的图片
//
//    private PersonBean personBean = null;//个人信息实体类


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView(getView());
        initEvent();
        IntentFilter filter = new IntentFilter();
        filter.addAction("ICON");
        filter.addAction("NAME");
//        getActivity().registerReceiver(new MyBroadcastReciver(), filter);
    }

    private void initView(View view) {
        RadioButton radio_wallet=(RadioButton)view.findViewById(R.id.radio_wallet);
        radio_wallet.setOnClickListener(this);

        RelativeLayout rl_person_info=(RelativeLayout)view.findViewById(R.id.rl_person_info);
        rl_person_info.setOnClickListener(this);
        RelativeLayout rl_address=(RelativeLayout)view.findViewById(R.id.rl_address);
        rl_address.setOnClickListener(this);
        RelativeLayout rl_question=(RelativeLayout)view.findViewById(R.id.rl_question);
        rl_question.setOnClickListener(this);
//        ivHeader = (CircleImageView) view.findViewById(R.id.iv_header);
//        ivHeader.setOnClickListener(this);
//        tvName = (TextView) view.findViewById(R.id.tv_name);
//        tvName.setOnClickListener(this);
//        radioWallet = (RadioButton) view.findViewById(R.id.radio_wallet);
//        radioDiscount = (RadioButton) view.findViewById(R.id.radio_discount);
//        radioCorcen = (RadioButton) view.findViewById(R.id.radio_corcen);
//        relOrder = (RelativeLayout) view.findViewById(R.id.rel_order);
//        radioPaying = (RadioButton) view.findViewById(R.id.radio_paying);
//        radioConfirm = (RadioButton) view.findViewById(R.id.radio_confirm);
//        radioComment = (RadioButton) view.findViewById(R.id.radio_comment);
//        radioRefound = (RadioButton) view.findViewById(R.id.radio_refound);
//        radioCustomer = (RadioButton) view.findViewById(R.id.radio_customer);
//        radioSettled = (RadioButton) view.findViewById(R.id.radio_settled);
//        radioFriend = (RadioButton) view.findViewById(R.id.radio_friend);
//        ivBottom = (ImageView) view.findViewById(R.id.iv_bottom);
//
//        RelativeLayout rl = (RelativeLayout) view.findViewById(R.id.rl);
//        rl.setBackgroundColor(getActivity().getResources().getColor(R.color.colorTransparent));
//
//        ImageView iv_bg = (ImageView) view.findViewById(R.id.iv_bg);
//        RelativeLayout rel_header = (RelativeLayout) view.findViewById(R.id.rel_header);
//        ControlWidthHeight.OutputView(rel_header);
//
//        RelativeLayout.LayoutParams linearParams = (RelativeLayout.LayoutParams) iv_bg.getLayoutParams(); //取控件textView当前的布局参数 linearParams.height = 20;// 控件的高强制设成20
//        linearParams.height = ControlWidthHeight.OutputView(rel_header) + ControlWidthHeight.OutputView(rl) + StatusBarUtil.getStatusBarHeight(getActivity());// 控件的宽强制设成30
//        iv_bg.setLayoutParams(linearParams); //使设置好的布局参数应用到控件
//
//        TextView tv_title = (TextView) view.findViewById(R.id.tv_title);
//        tv_title.setText("我的");
//        ImageView image_back = (ImageView) view.findViewById(R.id.image_back);
//        image_back.setImageResource(R.drawable.ic_gear2);
//        image_back.setOnClickListener(this);
//        ImageView image_right = (ImageView) view.findViewById(R.id.image_right);
//        image_right.setOnClickListener(this);
    }


    @Override
    public void loadData() {
//        ProgressDialogs.showProgressDialog(getActivity(), "");
//        Map<String, String> params = new HashMap<>();
//        String json = "{\"cmd\":\"getPersonalInfo\",\"uid\":\"" + MyApplication.uId + "\"}";
//        abLog.e("个人信息/...........", json);
//        params.put("json", json);
//        OkHttpUtils.post().params(params).url(MyApplication.Url).build()
//                .execute(new StrCallback() {
//                             @Override
//                             public void onResponse(String response, int id) {
//                                 super.onResponse(response, id);
//                                 try {
//                                     JSONObject obj = new JSONObject(response);
//                                     if (obj.getString("result").equals("0")) {
//                                         personBean = new Gson().fromJson(obj.getString("userInfo"), PersonBean.class);
//                                         ImageLoader.getInstance().displayImage(personBean.userIcon, ivHeader);
//                                         ImageLoader.getInstance().displayImage(personBean.platformImage, ivBottom);
//                                         if (!TextUtils.isEmpty(personBean.userName)) {
//                                             tvName.setText(personBean.userName);
//                                         } else {
//                                             tvName.setText(SharedPreferencesUtil.getSharePreStr(getActivity(), "phone"));
//                                         }
//                                         SharedPreferencesUtil.putSharePre(getActivity(), "userIcon", personBean.userIcon);
//                                         SharedPreferencesUtil.putSharePre(getActivity(), "sex", personBean.gender);
//                                     } else {
//                                         ToastUtil.showToast(obj.getString("resultNote"));
//                                     }
//                                 } catch (JSONException e) {
//                                     e.printStackTrace();
//                                 }
//                             }
//                         }
//                );
    }


    private void initEvent() {
//        radioWallet.setOnClickListener(this);
//        radioDiscount.setOnClickListener(this);
//        radioCorcen.setOnClickListener(this);
//        ivHeader.setOnClickListener(this);
//
//        relOrder.setOnClickListener(this);
//        radioPaying.setOnClickListener(this);
//        radioConfirm.setOnClickListener(this);
//        radioComment.setOnClickListener(this);
//        radioRefound.setOnClickListener(this);
//        radioCustomer.setOnClickListener(this);
//        radioSettled.setOnClickListener(this);
//        radioFriend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.radio_wallet://钱包
                MyApplication.openActivity(getActivity(),WalletActivity.class);
                break;
            case R.id.rl_person_info:  //个人资料
                MyApplication.openActivity(getActivity(),EditUserinfoActivity.class);
                break;
            case R.id.rl_address://地址管理
                MyApplication.openActivity(getActivity(), AddressActivity.class);
                break;
            case R.id.rl_question://意见反馈
                MyApplication.openActivity(getActivity(), QuestionActivity.class);
                break;

//            case R.id.iv_header://个人信息
//            case R.id.tv_name:
//                Bundle bundle = new Bundle();
//                if (MyApplication.isLogined()) {
//                    if (personBean != null) {
//                        bundle.putSerializable("bean", personBean);
//                    }
//                    MyApplication.openActivity(getActivity(), PersonActivity.class, bundle);
//                } else {
//                    MyApplication.openActivity(getActivity(), SignInActivity.class);
//                }
//
//                break;
//            case R.id.radio_wallet:  //我的钱包
//                intent = new Intent(getActivity(), WalletActivity.class);
//                break;
//            case R.id.radio_discount:
//                //我的优惠券
//                intent = new Intent(getActivity(), DiscountActivity.class);
//                break;
//            case R.id.radio_corcen:
//                //我的关注
//                intent = new Intent(getActivity(), ConcernActivity.class);
//                break;
//            case R.id.rel_order:
//                //全部订单
//                intent = new Intent(getActivity(), MyOrderActivity.class);
//                intent.putExtra("index", 0);
//                break;
//            case R.id.radio_paying:
//                //待付款
//                intent = new Intent(getActivity(), MyOrderActivity.class);
//                intent.putExtra("index", 1);
//                break;
//            case R.id.radio_confirm:
//                //待确认
//                intent = new Intent(getActivity(), MyOrderActivity.class);
//                intent.putExtra("index", 2);
//                break;
//            case R.id.radio_comment:
//                //待评价
//                intent = new Intent(getActivity(), MyOrderActivity.class);
//                intent.putExtra("index", 3);
//                break;
//            case R.id.radio_refound:
//                //退款
//                intent = new Intent(getActivity(), MyOrderActivity.class);
//                intent.putExtra("index", 4);
//                break;
//            case R.id.radio_customer://客服中心
//                intent = new Intent(getActivity(), CustomerActivity.class);
//                break;
//            case R.id.radio_settled:
//                //入驻合作
//                showUpdateDialog();
//                break;
//            case R.id.radio_friend:
//                ShareUtil.share(getActivity());
//                break;
//        }
//        if (intent != null) {
//            startActivity(intent);
        }
    }


//    private void showUpdateDialog() {
//        final AlertDialog builder = new AlertDialog.Builder(getActivity(), R.style.Dialog).create(); //
//        builder.show();
//        LayoutInflater factory = LayoutInflater.from(getActivity());
//        View view = factory.inflate(R.layout.dialog_update, null);
//        builder.getWindow().setContentView(view);
//        builder.setCancelable(true);//点击返回消失
//        builder.setCanceledOnTouchOutside(false);//点击屏幕不消失
//
//        TextView tv_titles = (TextView) view.findViewById(R.id.tv_title);
//        TextView tv_yes = (TextView) view.findViewById(R.id.tv_yes);
//        tv_yes.setText("下载");
//        TextView tv_no = (TextView) view.findViewById(R.id.tv_no);
//
//        tv_titles.setText("请下载商家端app");
//
//        Window dialogWindow = builder.getWindow();
//        dialogWindow.setGravity(Gravity.CENTER);//显示在底部
//        WindowManager m = getActivity().getWindowManager();
//        Display d = m.getDefaultDisplay(); // 获取屏幕宽、高用
//        WindowManager.LayoutParams p = dialogWindow.getAttributes(); // 获取对话框当前的参数值
//        p.width = (int) (d.getWidth() * 0.8); // 宽度设置为屏幕的0.65
//        dialogWindow.setAttributes(p);
//
//        tv_yes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // 开始下载
//                builder.dismiss();
//                Uri uri = Uri.parse("http://59.110.163.144:8080/appoint/icon/yueding.apk");
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(uri);
//                startActivity(intent);
//            }
//        });
//
//        tv_no.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                builder.dismiss();
//            }
//        });
//    }


//    private class MyBroadcastReciver extends BroadcastReceiver {
//        @Override
//        public void onReceive(Context context, Intent intent) {
//            String action = intent.getAction();//接收广播识别
//            if (action.equals("NAME")) {
//                String name = intent.getStringExtra("name");//接收参数
//                tvName.setText(name);
//            } else if (action.equals("ICON")) {
//                String url = intent.getStringExtra("url");//接收参数
//                ImageLoader.getInstance().displayImage(url, ivHeader);
//            }
//        }
//    }


}
