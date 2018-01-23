package com.example.yonghongtang.newrecyclerview.fragment;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.example.yonghongtang.newrecyclerview.R;

import butterknife.BindView;

/**
 * Created by yonghong.tang on 2017/12/26.
 */

public class ShoppingFragment extends Fragment {
    /**
     * //声明WebSettings子类
     * WebSettings webSettings = webView.getSettings();
     * //如果访问的页面中要与Javascript交互，则webview必须设置支持Javascript
     * webSettings.setJavaScriptEnabled(true);
     * //支持插件
     * webSettings.setPluginsEnabled(true);
     * //设置自适应屏幕，两者合用
     * webSettings.setUseWideViewPort(true); //将图片调整到适合webview的大小
     * webSettings.setLoadWithOverviewMode(true); // 缩放至屏幕的大小
     * //缩放操作
     * webSettings.setSupportZoom(true); //支持缩放，默认为true。是下面那个的前提。
     * webSettings.setBuiltInZoomControls(true); //设置内置的缩放控件。若为false，则该WebView不可缩放
     * webSettings.setDisplayZoomControls(false); //隐藏原生的缩放控件
     * //其他细节操作
     * webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK); //关闭webview中缓存
     * webSettings.setAllowFileAccess(true); //设置可以访问文件
     * webSettings.setJavaScriptCanOpenWindowsAutomatically(true); //支持通过JS打开新窗口
     * webSettings.setLoadsImagesAutomatically(true); //支持自动加载图片
     * webSettings.setDefaultTextEncodingName("utf-8");//设置编码格式
     */

    private WebSettings mWebSettings;
    private final static String URL = "https://www.taobao.com/";
    private WebView mWebView;

    public ShoppingFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shopping, container, false);
        mWebView = view.findViewById(R.id.webView1);
        initView();
        return view;

    }

    @SuppressLint("SetJavaScriptEnabled")
    private void initView() {
        //声明webSetting子类
        mWebView.loadUrl(URL);
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
        mWebView.setOnKeyListener((view, i, keyEvent) -> {
            if (keyEvent.getAction() == KeyEvent.ACTION_DOWN) {
                if (i == KeyEvent.KEYCODE_BACK && mWebView.canGoBack()) {  //表示按返回键
                    mWebView.goBack();   //后退
                    //webview.goForward();//前进
                    return true;    //已处理
                }
            }
            return false;
        });
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
}
