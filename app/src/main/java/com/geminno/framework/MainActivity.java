package com.geminno.framework;

import android.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.geminno.framework.fragment.Fragment_act;
import com.geminno.framework.fragment.Fragment_friend;
import com.geminno.framework.fragment.Fragment_sport;
import com.geminno.framework.fragment.Fragment_trends;
import com.geminno.framework.fragment.Fragment_zixun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView left_drawer1;
    private DrawerLayout drawer;
    private RadioGroup rg_tag;
    private Integer id;
    private RadioButton rb_zixun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();

        initdata();

        List<HashMap<String,Object>> data=new ArrayList<HashMap<String,Object>>();
        HashMap<String,Object> map=null;
        map=new HashMap<String,Object>();
        map.put("iv_photomy",R.drawable.tou);
        map.put("tv_test","我的");
        data.add(map);
        HashMap<String,Object> map1=null;
        map1=new HashMap<String,Object>();
        map1.put("iv_photomy",R.drawable.exit);
        map1.put("tv_test","退出");
        data.add(map1);
        String[] from={"iv_photomy","tv_test"};
        int[] to={R.id.iv_photomy,R.id.tv_test};
        left_drawer1.setAdapter(
                new SimpleAdapter(
                        MainActivity.this,
                        data,
                        R.layout.layout,
                        from,
                        to
                )
        );
        left_drawer1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,position+"",Toast.LENGTH_SHORT).show();
                drawer.closeDrawers();

            }
        });

    }
    private void initview() {
        left_drawer1 = ((ListView) findViewById(R.id.left_drawer1));
        drawer = ((DrawerLayout) findViewById(R.id.drawer));
        rg_tag = ((RadioGroup) findViewById(R.id.rg_tag));
        rb_zixun = ((RadioButton) findViewById(R.id.rb_zixun));
    }
    private void initdata() {


            switchFragment(new Fragment_zixun());

        rg_tag.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Fragment fragment=null;
                switch (i){
                    case R.id.rb_zixun:
                       fragment=new Fragment_zixun();
                        
                        break;
                    case R.id.rb_sport:
                        fragment=new Fragment_sport();
                        break;
                    case R.id.rb_act:
                        fragment=new Fragment_act();
                        break;
                    case R.id.rb_friend:
                        fragment=new Fragment_friend();
                        break;
                    case R.id.rb_change:
                        fragment=new Fragment_trends();
                        break;

                }
                switchFragment(fragment);
            }
        });

    }

    private void switchFragment(Fragment fragment) {
        this.getFragmentManager().beginTransaction().replace(R.id.fl_content,fragment).commit();
    }
}
