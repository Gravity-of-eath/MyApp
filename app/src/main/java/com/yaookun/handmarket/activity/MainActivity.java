package com.yaookun.handmarket.activity;

import android.provider.Settings;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.yaookun.handmarket.R;
import com.yaookun.handmarket.adapter.MyMenuListAdapter;
import com.yaookun.handmarket.fragment.CollectFragment;
import com.yaookun.handmarket.fragment.HomeFragment;
import com.yaookun.handmarket.fragment.CarFragment;

public class MainActivity extends AppCompatActivity {

    TextView tv_name;
    ImageView iv_user;
    ListView lv_menu;
    LinearLayout linearLayout;
    Toolbar toolbar;
    SlidingPaneLayout slidingPaneLayout;
    MyMenuListAdapter adapter;
    HomeFragment homeFragment;
    CarFragment carFragment;
    CollectFragment collectFragment;
    FragmentManager manager;
    FragmentTransaction transaction;
    long oldtime=0,time=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("首页");
        toolbar.setSubtitle("请购物");
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setNavigationIcon(R.mipmap.open);
        manager=getSupportFragmentManager();
        homeFragment=new HomeFragment();
        homeFragment.setContext(this);
        carFragment=new CarFragment();
        carFragment.setContext(this);
        collectFragment=new CollectFragment();
        collectFragment.setContext(this);
        transaction= manager.beginTransaction();
        transaction.add(R.id.LLcontent,homeFragment);
        transaction.add(R.id.LLcontent,carFragment);
        transaction.add(R.id.LLcontent,collectFragment);
        transaction.commit();
        refreshFragment(0);

        tv_name= (TextView) findViewById(R.id.main_menu_tv_name);
        iv_user= (ImageView) findViewById(R.id.main_menu_cirimgviw);
        lv_menu= (ListView) findViewById(R.id.main_menu_lv);
        linearLayout= (LinearLayout) findViewById(R.id.LLcontent);
        slidingPaneLayout= (SlidingPaneLayout) findViewById(R.id.spl);
        slidingPaneLayout.setSliderFadeColor(getResources().getColor(android.R.color.transparent));

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(slidingPaneLayout.isOpen()){
                    slidingPaneLayout.closePane();
                    toolbar.setNavigationIcon(R.mipmap.open);
                }else {
                    slidingPaneLayout.openPane();
                    toolbar.setNavigationIcon(R.mipmap.back);
                }
            }
        });
        slidingPaneLayout.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
                linearLayout.setScaleY((float) (1-slideOffset*0.2));
            }

            @Override
            public void onPanelOpened(View panel) {
                toolbar.setNavigationIcon(R.mipmap.back);
            }

            @Override
            public void onPanelClosed(View panel) {
                toolbar.setNavigationIcon(R.mipmap.open);
            }
        });
        adapter=new MyMenuListAdapter(this,null);
        lv_menu.setAdapter(adapter);
        lv_menu.setSelector(R.drawable.itemselect);
        lv_menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                lv_menu.setItemChecked(position,true);
                slidingPaneLayout.closePane();
                refreshFragment(position);
            }
        });
    }
    public void refreshFragment(int pos){
        FragmentTransaction transaction= manager.beginTransaction();
        transaction.hide(homeFragment);
        transaction.hide(carFragment);
        transaction.hide(collectFragment);
        switch (pos){
            case 0:
                transaction.show(homeFragment);
                toolbar.setTitle("首页");
                toolbar.setSubtitle("请购物");
                break;
            case 1:
                transaction.show(carFragment);
                toolbar.setTitle("收藏");
                toolbar.setSubtitle("收藏的商品");
                break;
            case 2:
                transaction.show(collectFragment);
                toolbar.setTitle("购物车");
                toolbar.setSubtitle("包含已购买的商品");
                break;
            case 3:
                Toast.makeText(this,"未登录",Toast.LENGTH_LONG).show();
                toolbar.setTitle("请登录");
                toolbar.setSubtitle(" ");
                break;
        }
        transaction.commit();

    }

    @Override
    public void onBackPressed() {
        time=System.currentTimeMillis();
        if(time-oldtime<1500){
            this.finish();
        }else{
            oldtime=time;
            Toast.makeText(this,"再按一次退出",Toast.LENGTH_SHORT).show();
        }
//        super.onBackPressed();
    }
}
