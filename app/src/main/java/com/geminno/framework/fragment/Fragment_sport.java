package com.geminno.framework.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.geminno.framework.R;

/**
 * Created by lenovo on 2016/9/19.
 */
public class Fragment_sport extends Fragment {
    private RadioGroup rg_sport;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_sport,null);
        rg_sport = ((RadioGroup) view.findViewById(R.id.rg_sport));
        return view;

    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initdata();
    }

    private void initdata() {
        switchFragment(new Fragment_friend_goodFriend());
        rg_sport.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Fragment fragment=null;
                switch (i){
                    case R.id.rb_talk:
                        fragment=new Fragment_friend_goodFriend();
                        break;}
                switchFragment(fragment);
            }
        });

    }
    private void switchFragment(Fragment fragment) {
        this.getFragmentManager().beginTransaction().replace(R.id.fl_sport,fragment).commit();
    }

}
