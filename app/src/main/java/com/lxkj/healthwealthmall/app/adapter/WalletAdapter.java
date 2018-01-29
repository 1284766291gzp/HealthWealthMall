package com.lxkj.healthwealthmall.app.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.lxkj.healthwealthmall.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2017/5/24 0024.
 */

public class WalletAdapter extends RecyclerView.Adapter<WalletAdapter.MyViewHolder> {

    private Context context;
    private List<String> list=new ArrayList<>();

    public WalletAdapter(Context context, List<String> list) {
        this.context = context;
        this.list=list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_wallet, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

//        final WalletListBean.WalletListBean1 bean = list.get(position);
//
//        holder.txt_title.setText(bean.title);
//        holder.txt_add_time.setText(bean.add_time);
//        holder.txt_money.setText(bean.money);

    }

    @Override
    public int getItemCount() {
        return 3;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txt_title, txt_add_time, txt_money;

        public MyViewHolder(View itemView) {
            super(itemView);

            txt_title = (TextView) itemView.findViewById(R.id.txt_title);
            txt_add_time = (TextView) itemView.findViewById(R.id.txt_add_time);
            txt_money = (TextView) itemView.findViewById(R.id.txt_money);
        }
    }

}
