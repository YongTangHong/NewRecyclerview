package com.example.yonghongtang.newrecyclerview.adapter;


import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.yonghongtang.newrecyclerview.R;
import com.example.yonghongtang.newrecyclerview.bean.DataBean;

import java.util.List;

/**
 * Created by yonghong.tang on 2017/12/21.
 */

public class RecyclerViewAdapter extends BaseQuickAdapter<DataBean,BaseViewHolder> {


    public RecyclerViewAdapter(int layoutResId, @Nullable List<DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, DataBean item) {
        helper.setText(R.id.texts,String.valueOf(item.getData()));

    }
}
