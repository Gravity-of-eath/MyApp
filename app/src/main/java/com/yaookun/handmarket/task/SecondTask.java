package com.yaookun.handmarket.task;

import android.os.AsyncTask;

import com.yaookun.handmarket.bean.DetailBean;
import com.yaookun.handmarket.callback.Mycallback;

/**
 * Created by 姚 坤 on 2016/9/3.
 */
public class SecondTask extends AsyncTask<DetailBean,Void,DetailBean> {

    Mycallback mycallback;

    public SecondTask(Mycallback mycallback) {
        this.mycallback = mycallback;
    }

    @Override
    protected DetailBean doInBackground(DetailBean... params) {
        return params[0];
    }

    @Override
    protected void onPostExecute(DetailBean goodsBeen) {
        super.onPostExecute(goodsBeen);
        mycallback.setDetailData(goodsBeen);
    }
}
