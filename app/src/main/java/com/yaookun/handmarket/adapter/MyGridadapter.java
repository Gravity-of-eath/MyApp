package com.yaookun.handmarket.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.yaookun.handmarket.R;
import com.yaookun.handmarket.bean.GoodsBean;

import java.util.List;

/**
 * Created by 姚 坤 on 2016/9/3.
 */
public class MyGridadapter extends BaseAdapter {

    List<GoodsBean.ComponentBean> beans;
    Context context;

    public MyGridadapter(Context context) {
        this.context = context;
    }

    public void setBeans(List<GoodsBean.ComponentBean> beans) {
        this.beans = beans;
    }

    @Override
    public int getCount() {
        return beans.size();
    }

    @Override
    public GoodsBean.ComponentBean getItem(int position) {
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
            convertView = View.inflate(context, R.layout.scenditem, null);
            viewHoder = new ViewHoder(convertView);
            viewHoder.textView = (TextView) convertView.findViewById(R.id.griditem_textView_item);
            viewHoder.imageView= (ImageView) convertView.findViewById(R.id.griditem_imageView_icon);
        } else {
            viewHoder = (ViewHoder) convertView.getTag();
        }
        viewHoder.textView.setText(beans.get(position).getWord());
        Picasso.with(context).load(beans.get(position).getPicUrl()).into(viewHoder.imageView);
        return convertView;
    }
    class ViewHoder{
        ImageView imageView;
        TextView textView;
        View Conview;
        public ViewHoder(View conview) {
            Conview = conview;
            Conview.setTag(this);
        }
    }

}
