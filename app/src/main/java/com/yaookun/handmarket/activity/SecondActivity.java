package com.yaookun.handmarket.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Response;
import com.yaookun.handmarket.R;
import com.yaookun.handmarket.adapter.SecondAdapter;
import com.yaookun.handmarket.bean.DetailBean;
import com.yaookun.handmarket.bean.GoodsBean;
import com.yaookun.handmarket.callback.Mycallback;
import com.yaookun.handmarket.parser.Parser;
import com.yaookun.handmarket.task.SecondTask;

import java.io.IOException;
import java.util.List;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 1) {
                Bundle bundle = msg.getData();
                beans = bundle.getParcelable("bean");
                Log.e("==========", "==========" + beans);
                SecondAdapter secondAdapter = new SecondAdapter(SecondActivity.this);
                secondAdapter.setItemsBeanList(beans.getData().getItems());
                listView.setAdapter(secondAdapter);
                super.handleMessage(msg);
            }else if(msg.what==2){
                String path=beans.getData().getItems().get(msg.arg1).getComponent().getAction().getSourceId();
                Log.e("============","------pos-----"+path);
                Intent intent=new Intent(SecondActivity.this,ShopActivity.class);
                intent.putExtra("sourceid",path);
                startActivity(intent);
            }
        }
    };

    ListView listView;
    DetailBean beans;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        toolbar= (Toolbar) findViewById(R.id.second_tool_bar);
        toolbar.setTitle("详情列表");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView = (ListView) findViewById(R.id.second_listView);
        toolbar.setNavigationOnClickListener(this);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String urlpath = Parser.getUrl(name);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(urlpath).build();
        try {
            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Request request, IOException e) {
                }
                @Override
                public void onResponse(Response response) throws IOException {
                    String json = response.body().string();
                    DetailBean detailBean = Parser.jsonToDetailBean(json);
                    Message msg = handler.obtainMessage(1);
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("bean", detailBean);
                    msg.setData(bundle);
                    handler.sendMessage(msg);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Message msg=  handler.obtainMessage(2);
                msg.arg1=position;
                handler.sendMessage(msg);
            }
        });
    }
    @Override
    public void onClick(View v) {
        Log.e("========","====his.finish();==");
        this.finish();
    }
}
