package com.geminno.framework.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.geminno.framework.R;

/**
 * Created by lenovo on 2016/9/19.
 */
public class Fragment_friend extends Fragment implements View.OnClickListener{
    private View rl_talk;
    private ImageView iv_talk;
    private ImageView iv_goodfriend;
    private View rl_friend;
    private View rl_qun;
    private View rl_tlz;
    private ImageView iv_talk1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_friend,null);
        initview(view);
        initdata(view);
        return view;
    }

    private void initdata(View view) {

    }

    private void initview(View view) {
        rl_talk = (view.findViewById(R.id.rl_talk));
        rl_friend = view.findViewById(R.id.rl_friend);
        rl_qun = view.findViewById(R.id.rl_qun);
        rl_tlz = view.findViewById(R.id.rl_tlz);
        iv_talk1 = ((ImageView) view.findViewById(R.id.iv_talk1));
        iv_talk = ((ImageView) view.findViewById(R.id.iv_talk));
        iv_goodfriend = ((ImageView) view.findViewById(R.id.iv_goodfriend));
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_goodfriend:
                break;
        }
    }
}
