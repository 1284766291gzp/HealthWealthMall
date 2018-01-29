package com.lxkj.healthwealthmall.app.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.lxkj.healthwealthmall.R;

import java.util.List;


/**
 * 地址管理adapter
 * Created by Administrator on 2017/4/24 0024.
 */

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.MyViewHolder> {

    private Context context;
    private List<String> recommendList;

    public AddressAdapter(Context context, List<String> recommendList) {
        this.context = context;
        this.recommendList = recommendList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_address, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
//        AnimUtil.startShow(holder.image);
//        HomeRecommendBean.MerchantListBean bean = recommendList.get(position);
//
//        ImageLoader.getInstance().displayImage(bean.merchantIcon, holder.image);
//        holder.tv_name.setText(bean.merchantName);
//        holder.ratingBar.setRating(Float.valueOf(bean.merchantScore));
//
//        if (!bean.merchantScore.equals("0")) {
//            DecimalFormat df = new DecimalFormat("#.0");
//            holder.tv_score.setText(df.format(Double.valueOf(bean.merchantScore)));
//        } else {
//            holder.tv_score.setText("0.0");
//        }
//
//        holder.tv_quantity.setText("月约" + bean.merchantNum + "单");
//
//        holder.tv_fee.setText(bean.merchantFees + "元起");
//        holder.tv_time.setText(bean.merchantBusinessTime);
//        holder.tv_form.setText(bean.merchantServiceForm);
//
//        if (TextUtils.isEmpty(bean.type)) {
//            holder.tv_type.setVisibility(View.GONE);
//        } else {
//            if (bean.type.equals("0")) {
//                holder.tv_type.setVisibility(View.GONE);
//            }
//        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView tv_type, tv_name, tv_quantity, tv_score;
        TextView tv_fee, tv_time, tv_form, tv_discount;
        RatingBar ratingBar;

        public MyViewHolder(View itemView) {
            super(itemView);
//            image = (ImageView) itemView.findViewById(R.id.image);
//            tv_type = (TextView) itemView.findViewById(R.id.tv_type);
//            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
//            tv_quantity = (TextView) itemView.findViewById(R.id.tv_quantity);
//            tv_fee = (TextView) itemView.findViewById(R.id.tv_fee);
//            tv_time = (TextView) itemView.findViewById(R.id.tv_time);
//            tv_form = (TextView) itemView.findViewById(R.id.tv_form);
//            tv_discount = (TextView) itemView.findViewById(R.id.tv_discount);
//            tv_score = (TextView) itemView.findViewById(R.id.tv_score);
//
//            ratingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);
        }
    }


}
