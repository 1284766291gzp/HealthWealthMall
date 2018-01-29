package com.lxkj.healthwealthmall.app.ui.shouye;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.xrecyclerview.XRecyclerView;
import com.lxkj.healthwealthmall.R;
import com.lxkj.healthwealthmall.app.adapter.ShouYeAdapter;
import com.lxkj.healthwealthmall.app.ui.BaseFragment;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;


/**
 * 首页
 * Created by Slingge on 2017/4/24 0024.
 */

public class ShouYeFragment extends BaseFragment implements  View.OnClickListener
{

    private XRecyclerView recyclerView;
    private ShouYeAdapter adapter;
//
//    private Banner banner;
//    private BannerRequest bannerRequest;
//    private List<BannerBean.bannerListBean> bannerList;
//
//    private int nowPage = 1, totalPage = 1, onRefresh;
//    private Recommend_31 recommend31;
    private List<String> recommendList = new ArrayList<>();
//
//    private HomeIcon_32 homeIcon32;
//
//    private ImageView iv_yuyue, iv_classification, iv_range, iv_door;//预约，分类，远程服务，上门
//
//    private ImageView iv_1, iv_2, iv_3;//高端品牌，优惠，长见识
//    private TextView tv1, tv2, tv3;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shouye, container, false);
        init(view);
        return view;
    }

    private View setHeaderView() {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.header_shouye, null, false);
        view.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        banner = (Banner) view.findViewById(R.id.banner);
//        banner.setOnBannerClickListener(this);
//        banner.setIndicatorGravity(BannerConfig.RIGHT);
//
//        RelativeLayout rl1 = (RelativeLayout) view.findViewById(R.id.rl1);
//        rl1.setOnClickListener(this);
//        RelativeLayout rl2 = (RelativeLayout) view.findViewById(R.id.rl2);
//        rl2.setOnClickListener(this);
//        RelativeLayout rl3 = (RelativeLayout) view.findViewById(R.id.rl3);
//        rl3.setOnClickListener(this);
//        RelativeLayout rl4 = (RelativeLayout) view.findViewById(R.id.rl4);
//        rl4.setOnClickListener(this);
//
//        iv_yuyue = (ImageView) view.findViewById(R.id.iv_yuyue);
//        iv_classification = (ImageView) view.findViewById(R.id.iv_classification);
//        iv_range = (ImageView) view.findViewById(R.id.iv_range);
//        iv_door = (ImageView) view.findViewById(R.id.iv_door);
//
//
//        iv_1 = (ImageView) view.findViewById(R.id.iv_1);
//        iv_2 = (ImageView) view.findViewById(R.id.iv_2);
//        iv_3 = (ImageView) view.findViewById(R.id.iv_3);
//
//        tv1 = (TextView) view.findViewById(R.id.tv1);
//        tv2 = (TextView) view.findViewById(R.id.tv2);
//        tv3 = (TextView) view.findViewById(R.id.tv3);
//
//        LinearLayout ll_3 = (LinearLayout) view.findViewById(R.id.ll_3);//长见识
//        ll_3.setOnClickListener(this);
//        LinearLayout ll_1 = (LinearLayout) view.findViewById(R.id.ll_1);//高端品牌
//        ll_1.setOnClickListener(this);
//        LinearLayout ll_2 = (LinearLayout) view.findViewById(R.id.ll_2);//特惠专区
//        ll_2.setOnClickListener(this);

        return view;
    }

    private void init(View view) {
//        ImageView iv_message = (ImageView) view.findViewById(R.id.iv_message);
//        iv_message.setOnClickListener(this);
//
//        TextView tv_address = (TextView) view.findViewById(R.id.tv_address);
//        tv_address.setOnClickListener(this);
//
//        EditText et_search = (EditText) view.findViewById(R.id.et_search);
//        et_search.setOnClickListener(this);
//        et_search.setFocusable(false);

        recyclerView = (XRecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setPullRefreshEnabled(false);
        recyclerView.addHeaderView(setHeaderView());
        adapter = new ShouYeAdapter(getActivity(), recommendList);
        recyclerView.setAdapter(adapter);
//        recyclerView.addOnItemTouchListener(new RecyclerItemTouchListener(recyclerView) {
//            @Override
//            public void onItemClick(RecyclerView.ViewHolder vh) {
//                int position = vh.getAdapterPosition() - 2;
//                if (position < 0) {
//                    return;
//                }
//                Bundle bundle = new Bundle();
//                bundle.putString("id", recommendList.get(position).merchantId);
//                MyApplication.openActivity(getActivity(), MechanismInfoActivity.class, bundle);
//            }
//        });
//        recyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
//                                            @Override
//                                            public void onRefresh() {
//                                            }
//
//                                            @Override
//                                            public void onLoadMore() {
//                                                onRefresh = 2;
//                                                nowPage++;
//                                                if (nowPage > totalPage) {
//                                                    recyclerView.noMoreLoading();
//                                                } else {
//                                                    recommend31.getRecommend(nowPage);
//                                                }
//                                            }
//                                        }
//        );
//
//        bannerRequest = new BannerRequest(getActivity());
//        bannerRequest.setBannerCallBack(this);
//        recommend31 = new Recommend_31(getActivity(), 0);
//        recommend31.setRecommendCallback(this);
//        homeIcon32 = new HomeIcon_32(getActivity());
//        homeIcon32.setHomeIconCallBack(this);
    }


    @Override
    public void loadData() {
//        onRefresh = 0;
//        if (recommendList.size() == 0) {
//            recommend31.getRecommend(nowPage);
//        }
//        bannerRequest.getbanner(0);
//        homeIcon32.getHomeIcon();
    }

//
//    @Override
//    public void OnBannerClick(int position) {
//        Bundle bundle = new Bundle();
//        bundle.putString("id", bannerList.get(position - 1).bannerUrl);
//        MyApplication.openActivity(getActivity(), MechanismInfoActivity.class, bundle);
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
//            case R.id.et_search://搜索
//                MyApplication.openActivity(getActivity(), SearchActivity.class);
//                break;
//            case R.id.tv_address://附近定位
////                MyApplication.openActivity(getActivity(), NearbyLocationActivity.class);
//                break;
//            case R.id.rl1://预约
//                Bundle bundle = new Bundle();
//                bundle.putInt("type", 1);
//                MyApplication.openActivity(getActivity(), MenuActivity.class, bundle);
//                break;
//            case R.id.rl2://分类
//                MyApplication.openActivity(getActivity(), ClassificationActivity.class);
//                break;
//            case R.id.rl3://远程
//                bundle = new Bundle();
//                bundle.putInt("type", 2);
//                MyApplication.openActivity(getActivity(), MenuActivity.class, bundle);
//                break;
//            case R.id.rl4://上门
//                bundle = new Bundle();
//                bundle.putInt("type", 3);
//                MyApplication.openActivity(getActivity(), MenuActivity.class, bundle);
//                break;
//            case R.id.iv_message://消息
//                MyApplication.openActivity(getActivity(), MessageActivity.class);
//                break;
//            case R.id.ll_1://高端品牌
//                bundle = new Bundle();
//                bundle.putInt("type", 5);
//                MyApplication.openActivity(getActivity(), MenuActivity.class, bundle);
//                break;
//            case R.id.ll_2://特惠专区
//                bundle = new Bundle();
//                bundle.putInt("type", 4);
//                MyApplication.openActivity(getActivity(), MenuActivity.class, bundle);
//                break;
//            case R.id.ll_3://长见识
//                MyApplication.openActivity(getActivity(), LongKnowledgeActivity.class);
//                break;
        }
    }


//    /**
//     * 轮播图
//     */
//    @Override
//    public void banner(List<BannerBean.bannerListBean> bannerList) {
//        this.bannerList = bannerList;
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < bannerList.size(); i++) {
//            list.add(bannerList.get(i).bannerImage);
//        }
//        banner.setImages(list)
//                .setImageLoader(new GlideImageLoader())
//                .start();
//    }

//    /**
//     * 推荐
//     */
//    @Override
//    public void recommend(int totalPage, List<HomeRecommendBean.MerchantListBean> recommendList) {
//        this.totalPage = totalPage;
//        this.recommendList.addAll(recommendList);
//        abLog.e("首页及机构列表...............", new Gson().toJson(recommendList));
//
//        if (totalPage == 1 && this.recommendList.size() == 0) {
//            recyclerView.setNullData(getActivity());
//        }
//        if (onRefresh == 2) {
//            recyclerView.loadMoreComplete();
//        }
//        adapter.notifyDataSetChanged();
//    }

//    @Override
//    public void homeIcon(HomeIconBean homeIconBean) {
//        ImageLoader.getInstance().displayImage(homeIconBean.conventionIcon, iv_yuyue);
//        ImageLoader.getInstance().displayImage(homeIconBean.categoryIcon, iv_classification);
//        ImageLoader.getInstance().displayImage(homeIconBean.remoteIcon, iv_range);
//        ImageLoader.getInstance().displayImage(homeIconBean.doorIcon, iv_door);
//
//        ImageLoader.getInstance().displayImage(homeIconBean.brandIcon, iv_1);
//        ImageLoader.getInstance().displayImage(homeIconBean.preferentialIcon, iv_2);
//        ImageLoader.getInstance().displayImage(homeIconBean.seeIcon, iv_3);
//
//        tv1.setText(homeIconBean.brandNote);
//        tv2.setText(homeIconBean.preferentialNote);
//        tv3.setText(homeIconBean.seeNote);
//    }


//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        AnimUtil.endAnim();
//    }


}
