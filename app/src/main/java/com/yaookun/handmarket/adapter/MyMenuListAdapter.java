package com.yaookun.handmarket.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yaookun.handmarket.R;
import com.yaookun.handmarket.bean.MenuItemBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 姚 坤 on 2016/9/13.
 */
public class MyMenuListAdapter extends BaseAdapter {

    Context context;
    List<MenuItemBean> listitem;

    public MyMenuListAdapter(Context context, List<MenuItemBean> listitem) {
        this.context = context;
//        this.listitem = listitem;
        this.listitem=new ArrayList<>();
        this.listitem.add(new MenuItemBean(android.R.drawable.ic_menu_upload,"首页"));
        this.listitem.add(new MenuItemBean(android.R.drawable.ic_menu_save,"收藏"));
        this.listitem.add(new MenuItemBean(android.R.drawable.ic_menu_edit,"购物车"));
        this.listitem.add(new MenuItemBean(android.R.drawable.ic_menu_delete,"退出登录"));
    }

    @Override
    public int getCount() {
        return listitem.size();
    }

    @Override
    public MenuItemBean getItem(int position) {
        return listitem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHoder viewHoder;
        if(convertView==null){
            convertView=View.inflate(context, R.layout.main_menu_item,null);
            viewHoder=new ViewHoder(convertView);
            viewHoder.imageView= (ImageView) convertView.findViewById(R.id.main_menu_item_icon);
            viewHoder.textView= (TextView) convertView.findViewById(R.id.main_menu_item_name);
        }else{
            viewHoder= (ViewHoder) convertView.getTag();
        }
        viewHoder.imageView.setImageResource(listitem.get(position).getMenu_item_icon_resid());
        viewHoder.textView.setText(listitem.get(position).getMenu_item_name());
        return convertView;
    }
    class ViewHoder{
        ImageView imageView;
        TextView textView;
        View Conview;

        public ViewHoder(View conview) {
            Conview = conview;
            this.Conview.setTag(this);
        }
    }
}
