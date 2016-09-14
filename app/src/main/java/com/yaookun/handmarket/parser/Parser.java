package com.yaookun.handmarket.parser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yaookun.handmarket.bean.DetailBean;
import com.yaookun.handmarket.bean.GoodsBean;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 姚 坤 on 2016/9/3.
 */
public class Parser {

    public static  List<GoodsBean> jsonToObj(String json){
        List<GoodsBean> beans = new ArrayList<>();
        GoodsBean bean;
        List< GoodsBean.ComponentBean> listitems;
        GoodsBean.ComponentBean componentBean ;

        try {
            JSONObject count=new JSONObject(json);
            JSONObject data=count.getJSONObject("data");
            //获取外层数组
            JSONArray array=data.getJSONArray("items");
            int size=array.length();
            for(int i=0;i<size;i++){
                listitems=new ArrayList<>();
                bean=new GoodsBean();

                JSONObject item=array.getJSONObject(i);
                JSONObject component=item.getJSONObject("component");
                String title=component.getString("title");
                bean.setTitle(title);
                String cateimg=component.getString("cateimg");
                bean.setCateimg(cateimg);
                String componentType=component.getString("componentType");
                bean.setComponentType(componentType);
//获取内层数组
               JSONArray iteminter= component.getJSONArray("items");
                int intersize=iteminter.length();
                for(int j=0;j<intersize;j++){
                    componentBean=new GoodsBean.ComponentBean();

                    JSONObject goods=iteminter.getJSONObject(j);
                    JSONObject intercomponent=goods.getJSONObject("component");
                    String word=intercomponent.getString("word");
                    componentBean.setWord(word);
                    String picUrl=intercomponent.getString("picUrl");
                    componentBean.setPicUrl(picUrl);
                    String id=intercomponent.getString("id");
                    componentBean.setId(id);
                    String intercomponentType=intercomponent.getString("componentType");
                    componentBean.setComponentType(intercomponentType);

                    listitems.add(componentBean);
                }
                bean.setItems(listitems);
                beans.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return beans;
    }

public static DetailBean jsonToDetailBean(String json){
    DetailBean detailBean=new DetailBean();
    Gson gson=new Gson();
    Type type=new TypeToken<DetailBean>(){}.getType();
    detailBean=gson.fromJson(json,type);

    return detailBean;

}





public static String getUrl(String body){
    String urlhead="http://api-v2.mall.hichao.com/search/skus?query=";
    String urlfoot="%20%20&sort=all&ga=%252Fsearch%252Fskus&flag=&cat=&asc=1";
    String urlbody=null;
    try {
         urlbody= URLEncoder.encode(body,"utf-8");
    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return urlhead+urlbody+urlfoot;

}

}
