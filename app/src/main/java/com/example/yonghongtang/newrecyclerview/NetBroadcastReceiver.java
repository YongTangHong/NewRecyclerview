package com.example.yonghongtang.newrecyclerview;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

import com.example.yonghongtang.newrecyclerview.base.BaseActivity;
import com.example.yonghongtang.newrecyclerview.utils.NetUtil;


/**
 * 作者： zhouqt
 * 创建时间：17/10/25
 * 描述：
 */

public class NetBroadcastReceiver extends BroadcastReceiver {

    public NetEvent evevt = BaseActivity.event;

    @Override
    public void onReceive(Context context, Intent intent) {
        // 如果相等的话就说明网络状态发生了变化
        if (intent.getAction().equals(ConnectivityManager.CONNECTIVITY_ACTION)) {
            int netWorkState = NetUtil.getNetWorkState(context);
            // 接口回调传过去状态的类型
            if (evevt != null)
                evevt.onNetChange(netWorkState);
        }
    }

    // 自定义接口
    public interface NetEvent {
        public void onNetChange(int netMobile);
    }

}