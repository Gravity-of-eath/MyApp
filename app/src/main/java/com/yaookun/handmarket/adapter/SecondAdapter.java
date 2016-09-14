package com.yaookun.handmarket.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.yaookun.handmarket.R;
import com.yaookun.handmarket.bean.DetailBean;

import java.util.List;

/**
 * Created by 姚 坤 on 2016/9/4.
 */
public class SecondAdapter extends BaseAdapter {

    Context context;
    List<DetailBean.DataBean.ItemsBean> itemsBeanList;

    public SecondAdapter(List<DetailBean.DataBean.ItemsBean> itemsBeanList, Context context) {
        this.itemsBeanList = itemsBeanList;
        this.context = context;
    }

    public SecondAdapter(Context context) {
        this.context = context;
    }

    public void setItemsBeanList(List<DetailBean.DataBean.ItemsBean> itemsBeanList) {
        this.itemsBeanList = itemsBeanList;
    }

    @Override
    public int getCount() {
        return itemsBeanList.size();
    }

    @Override
    public DetailBean.DataBean.ItemsBean getItem(int position) {
        return itemsBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHoder viewHoder;
        if(convertView==null){
            convertView=View.inflate(context, R.layout.griditem,null);
            viewHoder=new ViewHoder(convertView);
            viewHoder.imageView= (ImageView) convertView.findViewById(R.id.griditem_imageView);
            viewHoder.textView= (TextView) convertView.findViewById(R.id.griditem_textView2);
            viewHoder.price= (TextView) convertView.findViewById(R.id.grid_item_price);
            viewHoder.oldprice= (TextView) convertView.findViewById(R.id.grid_item_oldprice);
            viewHoder.number= (TextView) convertView.findViewById(R.id.grid_item_number);
        }else{
            viewHoder= (ViewHoder) convertView.getTag();
        }
        viewHoder.textView.setText(itemsBeanList.get(position).getComponent().getDescription());
        viewHoder.price.setText("￥"+itemsBeanList.get(position).getComponent().getPrice());
        viewHoder.oldprice.setText("原￥："+itemsBeanList.get(position).getComponent().getOrigin_price());
        viewHoder.number.setText("销量："+itemsBeanList.get(position).getComponent().getSales());
        Picasso.with(context).load(itemsBeanList.get(position).getComponent().getPicUrl()).into(viewHoder.imageView);
        return convertView;
    }

    class ViewHoder{
        ImageView imageView;
        TextView textView;
        TextView price;
        TextView oldprice;
        TextView number;
        View conview;

        public ViewHoder(View conview) {
            this.conview = conview;
            conview.setTag(this);
        }
    }
}
