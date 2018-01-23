package com.example.yonghongtang.newrecyclerview.ui;


import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.yonghongtang.newrecyclerview.R;
import com.example.yonghongtang.newrecyclerview.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by yonghong.tang on 2017/12/25.
 */

public class HomeActivity extends BaseActivity {


    @BindView(R.id.webView1)
    WebView mWebView;
    private WebSettings mWebSettings;

    @Override
    protected int getViewResourceId() {
        return R.layout.fragment_shopping;
    }

    @Override
    protected void initView() {
        //声明webSetting子类
        mWebView.loadUrl("https://www.taobao.com/");
        mWebSettings = mWebView.getSettings();
        mWebView.setWebViewClient(new WebViewClient());
        //如果需要与JavaScript交互，则websetting必须支持JavaScript
        mWebSettings.setJavaScriptEnabled(true);

        //设置自适应屏幕，两者合用
        //设置可以访问文件
        //将图片调整到适合webview的大小
        mWebSettings.setUseWideViewPort(true);
        // 缩放至屏幕的大小
        mWebSettings.setLoadWithOverviewMode(true);
        //支持自动加载图片
        mWebSettings.setLoadsImagesAutomatically(true);
        //支持缩放，默认为true。是下面那个的前提。
        mWebSettings.setSupportZoom(true);
    }
    //销毁Webview
    @Override
    public void onDestroy() {
        if (mWebView != null) {
            mWebView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            mWebView.clearHistory();
            ((ViewGroup) mWebView.getParent()).removeView(mWebView);
            mWebView.destroy();
            mWebView = null;
        }
        super.onDestroy();
    }
    //点击返回上一页面而不是退出浏览器
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
            mWebView.goBack(); //goBack()表示返回WebView的上一页面
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
