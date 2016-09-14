package com.yaookun.handmarket.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yaookun.handmarket.R;
import com.yaookun.handmarket.bean.GoodsBean;

import java.util.List;

/**
 * Created by 姚 坤 on 2016/9/3.
 */
public class Myadapt extends BaseAdapter {

    List<GoodsBean> beans;
    Context context;

    public Myadapt(Context context) {
        this.context = context;
    }

    public void setBeans(List<GoodsBean> beans) {
        this.beans = beans;
    }

    @Override
    public int getCount() {
        return beans.size();
    }

    @Override
    public GoodsBean getItem(int position) {
        return beans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHoder viewHoder;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item, null);
            viewHoder = new ViewHoder(convertView);
            viewHoder.textView = (TextView) convertView.findViewById(R.id.textView);
        } else {
            viewHoder = (ViewHoder) convertView.getTag();
        }
        viewHoder.textView.setText(beans.get(position).getTitle());
        return convertView;
    }

    class ViewHoder {
        TextView textView;
        View convertView;

        public ViewHoder(View convertView) {
            this.convertView = convertView;
            convertView.setTag(this);
        }
    }
}
