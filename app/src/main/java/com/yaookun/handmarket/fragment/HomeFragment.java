package com.yaookun.handmarket.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Response;
import com.yaookun.handmarket.R;
import com.yaookun.handmarket.activity.SecondActivity;
import com.yaookun.handmarket.adapter.MyGridadapter;
import com.yaookun.handmarket.adapter.Myadapt;
import com.yaookun.handmarket.bean.DetailBean;
import com.yaookun.handmarket.bean.GoodsBean;
import com.yaookun.handmarket.callback.Mycallback;
import com.yaookun.handmarket.parser.Parser;
import com.yaookun.handmarket.task.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements Mycallback {

    String urlpath = "http://api-v2.mall.hichao.com/category/list?ga=%2Fcategory%2Flist";
    List<GoodsBean> beanList = new ArrayList<>();
    ListView listView;
    GridView gridView;
    Myadapt myadapt;
    MyGridadapter myGridadapter;
    Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        listView = (ListView)view.findViewById(R.id.listview);
        gridView = (GridView)view.findViewById(R.id.gridview);
        ListListener listListener = new ListListener();
        gridView.setOnItemClickListener(listListener);
        myadapt = new Myadapt(context);
        myadapt.setBeans(beanList);
        listView.setAdapter(myadapt);
        myGridadapter = new MyGridadapter(context);
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
                    beanList = Parser.jsonToObj(json);
                    new Task(HomeFragment.this).execute(beanList);
                }

            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("=============", "==========" + position);
                myGridadapter.setBeans(beanList.get(position).getItems());
                myGridadapter.notifyDataSetChanged();
                listView.setSelector(R.drawable.itemselect);
            }
        });
        return view;
    }

    @Override
    public void setData(List<GoodsBean> beans) {

        myadapt.setBeans(beanList);
        myadapt.notifyDataSetChanged();
        myGridadapter.setBeans(beans.get(0).getItems());
        Log.e("=================", "==========" + beans.get(3).getItems().toString());
        gridView.setAdapter(myGridadapter);
        myGridadapter.notifyDataSetChanged();
        myadapt.notifyDataSetChanged();
        listView.setSelection(0);
    }

    @Override
    public void setDetailData(DetailBean beans) {

    }
    class ListListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Log.e("=============", "==========" + position);
            Intent intent = new Intent(context,SecondActivity.class);
            intent.putExtra("name", myGridadapter.getItem(position).getWord());
            startActivity(intent);
        }
    }
}
