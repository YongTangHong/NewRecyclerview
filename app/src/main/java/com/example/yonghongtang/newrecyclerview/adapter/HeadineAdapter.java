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
import com.example.yonghongtang.newrecyclerview.bean.HeadlineBean;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by yonghong.tang on 2017/12/21.
 */

public class HeadineAdapter extends RecyclerView.Adapter<HeadineAdapter.MyHolder> {
    private Context context;
    private HeadlineBean mHeadlineBean;


    public HeadineAdapter(Context context, HeadlineBean bean) {
        this.context = context;
        this.mHeadlineBean = bean;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyHolder holder = new MyHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        //加载网络图片
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
        Date curDate = new Date(System.currentTimeMillis());//获取当前时间
        String str = formatter.format(curDate);
        // Glide.with(context).load(mHeadlineBean.getData().get(position).getGoods_img()).into(holder.imageView);
        Glide.with(context).load(mHeadlineBean.getResult().getData().get(position).getThumbnail_pic_s02()).into(holder.imageView);
        holder.texts.setText(mHeadlineBean.getResult().getData().get(position).getDate());
        holder.price.setText(mHeadlineBean.getResult().getData().get(position).getAuthor_name());

    }

    @Override
    public int getItemCount() {
        return mHeadlineBean == null ? 0 : mHeadlineBean.getResult().getData().size();
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
