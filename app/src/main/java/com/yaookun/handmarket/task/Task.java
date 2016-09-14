package com.yaookun.handmarket.task;

import android.os.AsyncTask;

import com.yaookun.handmarket.bean.GoodsBean;
import com.yaookun.handmarket.callback.Mycallback;

import java.util.List;

/**
 * Created by 姚 坤 on 2016/9/3.
 */
public class Task extends AsyncTask<List<GoodsBean>,Void,List<GoodsBean>> {

    Mycallback mycallback;

    public Task(Mycallback mycallback) {
        this.mycallback = mycallback;
    }

    @Override
    protected List<GoodsBean> doInBackground(List<GoodsBean>... params) {
        return params[0];
    }

    @Override
    protected void onPostExecute(List<GoodsBean> goodsBeen) {
        super.onPostExecute(goodsBeen);
        mycallback.setData(goodsBeen);
    }
}
