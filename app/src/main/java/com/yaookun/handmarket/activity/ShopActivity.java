package com.yaookun.handmarket.activity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.yaookun.handmarket.R;
import com.yaookun.handmarket.bean.DBInfo;

public class ShopActivity extends AppCompatActivity implements View.OnClickListener {

    WebView webView;
    Button btn_collect,btn_buynow,btn_car;
    String basepath="http://m.hichao.com/lib/interface.php?m=goodsdetail&sid=";
    String create_collect="create table if not exists "+ DBInfo.TAB_COLLECT_NAME+"(_id integer primary key autoincrement , "+DBInfo.RANK_NAME+" text);";
    String create_car="create table if not exists "+DBInfo.TAB_CAR_NAME+"(_id integer primary key autoincrement , "+DBInfo.RANK_NAME+" text);";
    String sourceid;
    SQLiteDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        sourceid=getIntent().getStringExtra("sourceid");
        btn_collect= (Button) findViewById(R.id.shop_btn_collect);
        btn_collect.setOnClickListener(this);
        btn_car= (Button) findViewById(R.id.shop_btn_car);
        btn_car.setOnClickListener(this);
        btn_buynow= (Button) findViewById(R.id.shop_btn_buynow);
        btn_buynow.setOnClickListener(this);
        webView= (WebView) findViewById(R.id.shop_web);
        webView.loadUrl(basepath+sourceid);
        database=openOrCreateDatabase("data_save",MODE_PRIVATE,null);
        database.execSQL(create_collect);
        if(isCollect()){
            btn_collect.setEnabled(false);
            btn_collect.setBackgroundColor(getResources().getColor(R.color.colorRed));
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.shop_btn_collect:
            {
                Toast.makeText(this,"收藏",Toast.LENGTH_SHORT).show();
                ContentValues values=new ContentValues();
                values.put(DBInfo.RANK_NAME,sourceid);
               long row= database.insert("collects",null,values);
                if(row>-1){
                    Toast.makeText(this,"收藏成功",Toast.LENGTH_SHORT).show();
                    btn_collect.setEnabled(false);
                    btn_collect.setBackgroundColor(getResources().getColor(R.color.colorRed));
                }
            }
                break;
            case R.id.shop_btn_car:
                Toast.makeText(this,"购物车",Toast.LENGTH_SHORT).show();
                break;
            case R.id.shop_btn_buynow:
//                Toast.makeText(this,"立即购买",Toast.LENGTH_SHORT).show();
                isCollect();
                break;

        }

    }
    public boolean isCollect(){
       Cursor cursor= database.query(
               DBInfo.TAB_COLLECT_NAME,
                new String[]{DBInfo.DB_ID}
                ,DBInfo.RANK_NAME+" = ?",
                new String[]{sourceid},null,null,null,null);
        if(cursor.moveToNext()){
            Log.e("cccccccccccccccccccccc","====="+cursor.getString(0));
            return true;
        }
        Log.e("cccccccccccccccccccccc","====="+cursor.getColumnCount());
        return  false;
    }
}
