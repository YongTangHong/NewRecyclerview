package com.example.yonghongtang.newrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.yonghongtang.newrecyclerview.R;
import com.example.yonghongtang.newrecyclerview.bean.Bean;


/**
 * Created by yonghong.tang on 2017/12/21.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    private Context context;
    private Bean mList;


    public MyAdapter(Context context, Bean bean) {
        this.context = context;
        this.mList = bean;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyHolder holder = new MyHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        //加载网络图片
        Glide.with(context).load(mList.getData().get(position).getGoods_img()).into(holder.imageView);
        holder.texts.setText(mList.getData().get(position).getEfficacy());
        holder.price.setText(mList.getData().get(position).getGoods_name());

    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.getData().size();
    }


    class MyHolder extends RecyclerView.ViewHolder {

        TextView texts;
        ImageView imageView;
        TextView price;

        public MyHolder(View itemView) {
            super(itemView);
            texts = itemView.findViewById(R.id.texts);
            imageView = itemView.findViewById(R.id.bitmap);
            price = itemView.findViewById(R.id.price);

        }
    }

}
