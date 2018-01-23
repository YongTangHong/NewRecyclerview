package com.example.yonghongtang.newrecyclerview.ui;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.yonghongtang.newrecyclerview.Constants.HttpUrls;
import com.example.yonghongtang.newrecyclerview.R;
import com.example.yonghongtang.newrecyclerview.adapter.MyAdapter;
import com.example.yonghongtang.newrecyclerview.base.BaseActivity;
import com.example.yonghongtang.newrecyclerview.bean.Bean;
import com.example.yonghongtang.newrecyclerview.network.OkHttpUtil;
import com.example.yonghongtang.newrecyclerview.view.RecycleViewDivider;
import com.google.gson.Gson;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.io.IOException;

import butterknife.BindView;
import okhttp3.Request;


/**
 * Created by yonghong.tang on 2017/12/25.
 */

public class FindActivity extends BaseActivity {


    @BindView(R.id.container)
    RecyclerView mContainer;
    @BindView(R.id.swipeRefresh)
    SmartRefreshLayout mSwipeRefresh;
    private Bean mList;
    private MyAdapter mAdapter;

    @Override
    protected int getViewResourceId() {
        return R.layout.fragment_home;
    }


    @Override
    protected void initView() {
        OkHttpUtil.getAsync(HttpUrls.PATH, new OkHttpUtil.DataCallBack() {
            @Override
            public void requestFailure(Request request, IOException e) {

            }

            @Override
            public void requestSuccess(String result) throws Exception {
                Gson gson = new Gson();
                mList = gson.fromJson(result, Bean.class);
                initData();
            }
        });


    }

    private void initData() {
        //布局管理器
        LinearLayoutManager manager = new LinearLayoutManager(mContext);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        //设置自定义分割线
        mContainer.addItemDecoration(new RecycleViewDivider(mContext, LinearLayoutManager.VERTICAL, R.drawable.divider_mileage));
        mContainer.setLayoutManager(manager);
        mAdapter = new MyAdapter(mContext, mList);
        mContainer.setAdapter(mAdapter);
    }


}
