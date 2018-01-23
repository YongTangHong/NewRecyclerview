package com.example.yonghongtang.newrecyclerview.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import com.blankj.utilcode.util.ToastUtils;
import com.example.yonghongtang.newrecyclerview.NetBroadcastReceiver;
import com.example.yonghongtang.newrecyclerview.R;
import com.example.yonghongtang.newrecyclerview.utils.NetUtil;
import com.githang.statusbar.StatusBarCompat;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity implements NetBroadcastReceiver.NetEvent {
    public static NetBroadcastReceiver.NetEvent event;
    protected BaseActivity mContext;
    /**
     * 网络类型
     */
    private int netMobile;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(getViewResourceId());
        ButterKnife.bind(this);
        StatusBarCompat.setStatusBarColor(this, getResources().getColor(R.color.white), true);
        StatusBarCompat.resetActionBarContainerTopMargin(getWindow(), android.support.v7.appcompat.R.id.action_bar_container);
        mContext = this;
        initView();
        event = this;
        inspectNet();
    }

    private boolean inspectNet() {
        this.netMobile = NetUtil.getNetWorkState(BaseActivity.this);
        return isNetConnect();
    }

    /**
     * 网络变化之后的类型
     */
    @Override
    public void onNetChange(int netMobile) {
        this.netMobile = netMobile;
        isNetConnect();
    }

    /**
     * 判断有无网络 。
     *
     * @return true 有网, false 没有网络.
     */
    public boolean isNetConnect() {
        if (netMobile == 1) {
            return true;
        } else if (netMobile == 0) {
            return true;
        } else if (netMobile == -1) {
            ToastUtils.showShort(R.string.network_error);
            return false;

        }
        return false;
    }


    @Override
    protected void onResume() {
        getData();
        super.onResume();
        setData();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        return super.dispatchTouchEvent(event);
    }

    protected abstract @LayoutRes
    int getViewResourceId();

    protected void initView() {

    }

    protected void getData() {

    }

    protected void setData() {

    }
}
