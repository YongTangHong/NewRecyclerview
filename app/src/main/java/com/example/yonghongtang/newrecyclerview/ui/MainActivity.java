package com.example.yonghongtang.newrecyclerview.ui;


import android.os.Build;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.blankj.utilcode.util.ToastUtils;
import com.example.yonghongtang.newrecyclerview.Applications;
import com.example.yonghongtang.newrecyclerview.R;
import com.example.yonghongtang.newrecyclerview.base.BaseActivity;
import com.example.yonghongtang.newrecyclerview.fragment.ClassificationFragment;
import com.example.yonghongtang.newrecyclerview.fragment.HomeFragment;
import com.example.yonghongtang.newrecyclerview.fragment.MeFragment;
import com.example.yonghongtang.newrecyclerview.fragment.ShoppingFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by yonghong.tang on 2017/12/26.
 */

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {


    @BindView(R.id.fragment_container)
    FrameLayout mFragmentContainer;
    @BindView(R.id.home)
    RadioButton mHome;
    @BindView(R.id.shopping)
    RadioButton mShopping;
    @BindView(R.id.classification)
    RadioButton mClassification;
    @BindView(R.id.my)
    RadioButton mMRbMy;
    @BindView(R.id.container)
    RadioGroup mContainer;
    @BindView(R.id.draw)
    DrawerLayout mDrawlayout;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;


    private FragmentManager mManager;
    private FragmentTransaction mFt;
    private List<Fragment> mFragmentArrayList = new ArrayList<>();
    private Fragment mFragment;
    private boolean mIsExit = false;

    @Override
    protected int getViewResourceId() {
       /* if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }*/
        return R.layout.activity_home;
    }

    @Override
    protected void initView() {
        //设置首页标题
        mToolbar.setTitle(R.string.title);
        //设置打开侧滑菜单图标
        mToolbar.setNavigationIcon(R.mipmap.icon_return);
        //点击监听
        mToolbar.setNavigationOnClickListener(new HomeNavigationOnClickListener());
        //设置radiogroup点击监听
        mContainer.setOnCheckedChangeListener(this);
        //获取fragment管理器
        mManager = getSupportFragmentManager();
        mFt = mManager.beginTransaction();
        mFragmentArrayList = getFragments();
        mFragment = mFragmentArrayList.get(0);
        mFt.replace(R.id.fragment_container, mFragment);
        mFt.commit();

    }

    //fragment 添加到集合中
    public List<Fragment> getFragments() {
        mFragmentArrayList.add(new HomeFragment());
        mFragmentArrayList.add(new ShoppingFragment());
        mFragmentArrayList.add(new ClassificationFragment());
        mFragmentArrayList.add(new MeFragment());
        return mFragmentArrayList;
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        mFt = mManager.beginTransaction();
        switch (i) {
            case R.id.home:
                mFragment = mFragmentArrayList.get(0);     //首页
                mFt.replace(R.id.fragment_container, mFragment);
                break;
            case R.id.shopping:
                mFragment = mFragmentArrayList.get(1);     //购物车
                mFt.replace(R.id.fragment_container, mFragment);
                break;
            case R.id.classification:                       //分类
                mFragment = mFragmentArrayList.get(2);
                mFt.replace(R.id.fragment_container, mFragment);
                break;
            case R.id.my:
                mFragment = mFragmentArrayList.get(3);      //我的
                mFt.replace(R.id.fragment_container, mFragment);
                break;
        }
        setTabState();
        mFt.commit();
    }

    //设置底部tab选中和未选中的字体颜色
    private void setTabState() {
        setHomeState();
        setClassificationState();
        setShoppingState();
        setMyState();
    }


    private void setHomeState() {
        if (mHome.isChecked()) {
            mHome.setTextColor(ContextCompat.getColor(this, R.color.font_red));
        } else {
            mHome.setTextColor(ContextCompat.getColor(this, R.color.colorBg));
        }
    }

    private void setClassificationState() {
        if (mClassification.isChecked()) {
            mClassification.setTextColor(ContextCompat.getColor(this, R.color.font_red));
        } else {
            mClassification.setTextColor(ContextCompat.getColor(this, R.color.colorBg));
        }
    }

    private void setMyState() {
        if (mMRbMy.isChecked()) {
            mMRbMy.setTextColor(ContextCompat.getColor(this, R.color.font_red));
        } else {
            mMRbMy.setTextColor(ContextCompat.getColor(this, R.color.colorBg));
        }
    }

    private void setShoppingState() {
        if (mShopping.isChecked()) {
            mShopping.setTextColor(ContextCompat.getColor(this, R.color.font_red));
        } else {
            mShopping.setTextColor(ContextCompat.getColor(this, R.color.colorBg));
        }
    }
    //失去焦点的时候关闭侧滑菜单
    @Override
    protected void onPause() {
        mDrawlayout.closeDrawer(Gravity.LEFT, false);
        super.onPause();
    }

    @Override
    public void onBackPressed() {
        if (mDrawlayout.isDrawerOpen(Gravity.START)) {
            mDrawlayout.closeDrawer(Gravity.START);
        }
        if (mIsExit) {
            Applications.sInstance.exit();
        } else {
            ToastUtils.showShort(getResources().getString(R.string.double_click_exit));
            mIsExit = true;
            new Handler().postDelayed(() -> mIsExit = false, 2000);
        }
    }

    private class HomeNavigationOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            mDrawlayout.openDrawer(Gravity.START);
        }
    }

    //监听返回键
    /*@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(mFragment instanceof ShoppingFragment){
            ((ShoppingFragment)mFragment).onKeyDown(keyCode);
            return true;
        }
        return false;
    }*/

}