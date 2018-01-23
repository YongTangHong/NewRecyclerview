package com.example.yonghongtang.newrecyclerview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.blankj.utilcode.util.Utils;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.https.HttpsUtils;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;


@SuppressLint("Registered")
public class Applications extends Application implements Application.ActivityLifecycleCallbacks {
    @SuppressLint("StaticFieldLeak")
    public static Applications sInstance;
    private LinkedList<Activity> mActivities = new LinkedList<>();
    private OkHttpClient mOkHttpClient;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        initLibrary();
        this.registerActivityLifecycleCallbacks(this);
        HttpsUtils.SSLParams sslParams = HttpsUtils.getSslSocketFactory(null, null, null);
        mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)  //设置连接超时
                .readTimeout(10000L, TimeUnit.MILLISECONDS)     //设置读取超时
                .writeTimeout(10000L, TimeUnit.MILLISECONDS)     //设置写入超时
                .sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager) //设置可访问所有的https网站
                .build();





    }

    /**
     * 初始化依赖库
     */
    private void initLibrary() {
        Utils.init(this);
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    public Activity getTopActivity() {
        return mActivities.getLast();
    }


    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        mActivities.add(activity);
    }

    @Override
    public void onActivityStarted(Activity activity) {
    }

    @Override
    public void onActivityResumed(Activity activity) {
        if (!mActivities.contains(activity)) {
            mActivities.add(activity);
        }
    }

    @Override
    public void onActivityPaused(Activity activity) {
    }

    @Override
    public void onActivityStopped(Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        mActivities.remove(activity);
    }

    public void exit() {
        for (Activity activity : mActivities) {
            activity.finish();
        }
    }

}
