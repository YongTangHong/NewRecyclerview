package com.example.yonghongtang.newrecyclerview.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yonghongtang.newrecyclerview.Constants.HttpUrls;
import com.example.yonghongtang.newrecyclerview.R;
import com.example.yonghongtang.newrecyclerview.adapter.MyAdapter;
import com.example.yonghongtang.newrecyclerview.bean.Bean;
import com.example.yonghongtang.newrecyclerview.network.OkHttpUtil;
import com.example.yonghongtang.newrecyclerview.view.RecycleViewDivider;
import com.google.gson.Gson;
import com.scwang.smartrefresh.header.MaterialHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;

import java.io.IOException;

import okhttp3.Request;

/**
 * Created by yonghong.tang on 2017/12/26.
 */

public class HomeFragment extends Fragment {



    private Bean mList;
    private MyAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private SmartRefreshLayout mRefreshLayout;

    public HomeFragment() {
    }


    public static HomeFragment newInstance() {
        HomeFragment homeFragment = new HomeFragment();
        return homeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,null);
        mRecyclerView = view.findViewById(R.id.container);
        mRefreshLayout = view.findViewById(R.id.swipeRefresh);
        setOkHttp();
        return view;

    }

    private void initData() {
        //布局管理器
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        //设置自定义分割线
        mRecyclerView.addItemDecoration(new RecycleViewDivider(getActivity(), LinearLayoutManager.VERTICAL, R.drawable.divider_mileage));
        mRecyclerView.setLayoutManager(manager);
        mAdapter = new MyAdapter(getActivity(), mList);
        mRecyclerView.setAdapter(mAdapter);

    //设置 Header 为 Material样式 ，下拉刷新头
        mRefreshLayout.setRefreshHeader(new MaterialHeader(getContext()).setShowBezierWave(true));
    //设置 Footer ，上拉加载
      mRefreshLayout.setRefreshFooter(new BallPulseFooter(getContext()).setSpinnerStyle(SpinnerStyle.Scale));

}


    private void setOkHttp() {
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
}
