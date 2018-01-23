package com.example.yonghongtang.newrecyclerview;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yonghong.tang on 2017/12/21.
 */

public class MyToolbar extends Toolbar {

    private TextView mTitle;

    public MyToolbar(Context context) {
        super(context);
        initView();
    }

    public MyToolbar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public MyToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }
    private void initView() {
        mTitle = new TextView(getContext());
        LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        mTitle.setTextColor(Color.WHITE);
        mTitle.setTextSize(TypedValue.COMPLEX_UNIT_DIP,20);
        this.addView(mTitle,params);
        //111111111




    }

    @Override
    public void setTitle(int resId) {
        mTitle.setText(getResources().getString(resId));
    }

    @Override
    public void setTitle(CharSequence title) {
        mTitle.setText(title);
    }
}
