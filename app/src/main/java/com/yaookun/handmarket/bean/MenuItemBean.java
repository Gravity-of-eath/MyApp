package com.yaookun.handmarket.bean;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 姚 坤 on 2016/9/13.
 */
public class MenuItemBean {
    String menu_item_name;
    int menu_item_icon_resid;

    public int getMenu_item_icon_resid() {
        return menu_item_icon_resid;
    }

    public String getMenu_item_name() {
        return menu_item_name;
    }

    public MenuItemBean(int menu_item_icon_resid, String menu_item_name) {
        this.menu_item_icon_resid = menu_item_icon_resid;
        this.menu_item_name = menu_item_name;
    }
}
