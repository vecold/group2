package com.geminno.framework.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geminno.framework.R;

/**
 * Created by lenovo on 2016/9/19.
 */
public class Fragment_act extends Fragment{
    @Nullable
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view=inflater.inflate(R.layout.fragment_act,null);
    return view;
}
}
