package com.yaookun.handmarket.callback;

import com.yaookun.handmarket.bean.DetailBean;
import com.yaookun.handmarket.bean.GoodsBean;

import java.util.List;

/**
 * Created by 姚 坤 on 2016/9/3.
 */
public interface Mycallback {
    public void setData(List<GoodsBean> beans);
    public void setDetailData(DetailBean beans);
}
