package com.example.yonghongtang.newrecyclerview.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yonghongtang.newrecyclerview.R;

/**
 * Created by yonghong.tang on 2017/12/26.
 */

public class MeFragment extends Fragment {

    public MeFragment(){}


    public static MeFragment newInstance(){
        MeFragment meFragment = new MeFragment();
        return  meFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_me,container,false);

    }
}
