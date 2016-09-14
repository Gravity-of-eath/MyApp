package com.yaookun.handmarket.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by 姚 坤 on 2016/9/4.
 */
public class DetailBean implements Parcelable{
    protected DetailBean(Parcel in) {
        message = in.readString();
    }

    public DetailBean() {
    }

    public static final Creator<DetailBean> CREATOR = new Creator<DetailBean>() {
        @Override
        public DetailBean createFromParcel(Parcel in) {
            return new DetailBean(in);
        }

        @Override
        public DetailBean[] newArray(int size) {
            return new DetailBean[size];
        }
    };

    @Override
    public String toString() {
        return "DetailBean{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * message :
     * data : {"flag":"s18","items":[{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s0.mingxingyichu.cn/group5/M00/00/5D/wKgBfVZSkKSASXhOAAJWplxHT3E942.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"259","origin_price":"869","id":"5430409","description":"YUNPEIR韵佩尔性感尖头及踝靴子通勤婚鞋高跟鞋细跟短靴","trackValue":"item_sku_5430409","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"237","action":{"actionType":"detail","type":"sku","id":"5430409","source":"ecshop","sourceId":"1736963","width":"806","height":"1210","main_image":0,"collectionCount":"0","trackValue":"item_sku_5430409"},"collectionCount":"0"},"width":"806","height":"1210"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s5.mingxingyichu.cn/group5/M00/35/A8/wKgBf1ZzbviADQ9BAAOL6KXkZno031.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"229","origin_price":"759","id":"5425834","description":"YUNPEIR韵佩尔加厚平跟厚底银色雪地靴子甜美皮毛一体短靴","trackValue":"item_sku_5425834","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"315","action":{"actionType":"detail","type":"sku","id":"5425834","source":"ecshop","sourceId":"1732861","width":"806","height":"1210","main_image":0,"collectionCount":"0","trackValue":"item_sku_5425834"},"collectionCount":"0"},"width":"806","height":"1210"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s1.mingxingyichu.cn/group6/M00/72/13/wKgBjVZyhfSAczAdAAM5sR74Q04157.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"279","origin_price":"924","id":"5430266","description":"YUNPEIR韵佩尔复古铆钉粗跟黑色短靴子机车靴马丁靴子","trackValue":"item_sku_5430266","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"103","action":{"actionType":"detail","type":"sku","id":"5430266","source":"ecshop","sourceId":"1736817","width":"806","height":"1210","main_image":0,"collectionCount":"0","trackValue":"item_sku_5430266"},"collectionCount":"0"},"width":"806","height":"1210"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s6.mingxingyichu.cn/group5/M00/33/F8/wKgBfVZzgquAMwXKAAIEAt9Lq4g248.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"289","origin_price":"962","id":"5430308","description":"YUNPEIR韵佩尖头坡跟高跟黑色白领OL马丁靴子潮鞋大小码","trackValue":"item_sku_5430308","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"335","action":{"actionType":"detail","type":"sku","id":"5430308","source":"ecshop","sourceId":"1736859","width":"806","height":"1210","main_image":0,"collectionCount":"0","trackValue":"item_sku_5430308"},"collectionCount":"0"},"width":"806","height":"1210"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s3.mingxingyichu.cn/group5/M00/13/87/wKgBf1epvG-AX95mAAG3e59cjGs74.jpeg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"249","origin_price":"830","id":"6956858","description":"YUNPEIR韵佩尔真皮尖头短靴女高跟鞋粗跟通勤OL马丁靴子","trackValue":"item_sku_6956858","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"297","action":{"actionType":"detail","type":"sku","id":"6956858","source":"ecshop","sourceId":"2590133","width":"500","height":"500","main_image":0,"collectionCount":"0","trackValue":"item_sku_6956858"},"collectionCount":"0"},"width":"500","height":"500"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://mxycsku.mingxingyichu.cn/group5/M00/11/AC/wKgBfVeqq7aAebBNAAHaPLUdBm879.jpeg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"376","origin_price":"1253","id":"6957650","description":"YUNPEIR韵佩尔欧美真皮百搭短靴侧拉链粗跟中跟圆头靴子","trackValue":"item_sku_6957650","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"439","starCount":"1","action":{"actionType":"detail","type":"sku","id":"6957650","source":"ecshop","sourceId":"2590252","width":"500","height":"500","main_image":0,"collectionCount":"0","trackValue":"item_sku_6957650"},"collectionCount":"0"},"width":"500","height":"500"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://mxycsku.mingxingyichu.cn/group6/M00/AC/00/wKgBjVfCjTaAJl4MAADgfp1FVQU12.jpeg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"216","origin_price":"720","id":"6970979","description":"YUNPEIR韵佩尔真皮复古磨砂短靴粗跟女靴子方跟尖头女短靴","trackValue":"item_sku_6970979","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"436","action":{"actionType":"detail","type":"sku","id":"6970979","source":"ecshop","sourceId":"2593227","width":"500","height":"500","main_image":0,"collectionCount":"0","trackValue":"item_sku_6970979"},"collectionCount":"0"},"width":"500","height":"500"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s0.mingxingyichu.cn/group5/M00/66/DF/wKgBfVfCkXaAXcIUAANe2acfvVw35.jpeg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"336","origin_price":"1120","id":"6970983","description":"YUNPEIR韵佩尔欧美性感细跟短靴尖头蝴蝶结百搭气质女靴子","trackValue":"item_sku_6970983","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"287","action":{"actionType":"detail","type":"sku","id":"6970983","source":"ecshop","sourceId":"2593231","width":"800","height":"800","main_image":0,"collectionCount":"0","trackValue":"item_sku_6970983"},"collectionCount":"0"},"width":"800","height":"800"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s4.mingxingyichu.cn/group5/M00/C8/90/wKgBfVcDF4yAOy2QAAByzz0zq_U613.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"689","origin_price":"1749","id":"5974102","description":"爱得堡秋冬款男士皮靴马丁靴男英伦复古时尚男靴高帮男短靴子军靴","trackValue":"item_sku_5974102","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"317","starCount":"1","action":{"actionType":"detail","type":"sku","id":"5974102","source":"ecshop","sourceId":"2087965","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5974102"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s3.mingxingyichu.cn/group5/M00/CA/7E/wKgBf1cDF4yAMJ8CAABsttTVJGI416.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"499","origin_price":"1699","id":"5973954","description":"爱得堡秋冬款英伦男靴头层真皮靴子雕花布洛克马丁男靴复古高帮靴","trackValue":"item_sku_5973954","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"98","action":{"actionType":"detail","type":"sku","id":"5973954","source":"ecshop","sourceId":"2087821","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5973954"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s1.mingxingyichu.cn/group5/M00/CA/7D/wKgBf1cDF4yAdVIDAABgDVUif-k971.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"599","origin_price":"1599","id":"5973929","description":"爱得堡秋冬款男靴子春秋羊皮真皮马丁靴男潮流拉链短靴复古军靴","trackValue":"item_sku_5973929","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"305","action":{"actionType":"detail","type":"sku","id":"5973929","source":"ecshop","sourceId":"2087798","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5973929"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s6.mingxingyichu.cn/group5/M00/C8/90/wKgBfVcDF4yAURKAAABy3tuhGao704.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"649","origin_price":"1399","id":"5973988","description":"爱得堡春秋款英伦男靴潮流复古短筒真皮靴子布洛克男靴马丁靴","trackValue":"item_sku_5973988","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"384","action":{"actionType":"detail","type":"sku","id":"5973988","source":"ecshop","sourceId":"2087857","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5973988"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s1.mingxingyichu.cn/group6/M00/9A/84/wKgBjFaQdyGAbMqIAAYSK3vudTI67.jpeg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"549","origin_price":"1299","id":"5974030","description":"爱得堡秋款马丁靴男真皮靴军靴男士短靴高帮英伦靴子男新款潮","trackValue":"item_sku_5974030","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"165","action":{"actionType":"detail","type":"sku","id":"5974030","source":"ecshop","sourceId":"2087893","width":"1200","height":"1200","main_image":0,"collectionCount":"0","trackValue":"item_sku_5974030"},"collectionCount":"0"},"width":"1200","height":"1200"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s1.mingxingyichu.cn/group5/M00/CA/7E/wKgBf1cDF4yAN9ajAABmy4qlueQ824.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"799","origin_price":"1699","id":"5974037","description":"爱得堡秋冬款英伦男士皮靴休闲马丁靴子潮流男靴拉链工装靴男","trackValue":"item_sku_5974037","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"315","action":{"actionType":"detail","type":"sku","id":"5974037","source":"ecshop","sourceId":"2087899","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5974037"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s2.mingxingyichu.cn/group5/M00/CA/7E/wKgBf1cDF4yAGJyKAACB5dSiKL8297.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"699","origin_price":"1649","id":"5974039","description":"爱得堡秋款LA4休闲男靴英伦马丁靴男真皮靴子布洛克雕花短靴男","trackValue":"item_sku_5974039","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"388","action":{"actionType":"detail","type":"sku","id":"5974039","source":"ecshop","sourceId":"2087902","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5974039"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s1.mingxingyichu.cn/group6/M00/38/E4/wKgBjFdMHqKAPkQEAAERWbI0CME080.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"549","origin_price":"1299","id":"5974047","description":"爱得堡春款QS7复古男靴子英伦马丁靴男真皮军靴潮流短靴男皮靴","trackValue":"item_sku_5974047","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"482","starCount":"4","action":{"actionType":"detail","type":"sku","id":"5974047","source":"ecshop","sourceId":"2087910","width":"500","height":"500","main_image":0,"collectionCount":"0","trackValue":"item_sku_5974047"},"collectionCount":"0"},"width":"500","height":"500"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s2.mingxingyichu.cn/group6/M00/01/21/wKgBjVb4kfmAQm4BAAC6R0i2LH4837.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"999","origin_price":"1999","id":"5974054","description":"爱得堡冬款男士雪地靴男冬季休闲短筒羊毛男靴棉鞋英伦保暖男靴子","trackValue":"item_sku_5974054","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"361","starCount":"1","action":{"actionType":"detail","type":"sku","id":"5974054","source":"ecshop","sourceId":"2087916","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5974054"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s3.mingxingyichu.cn/group6/M00/6F/70/wKgBjVZxAIyAUX_rAAMVr__R8XM850.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"309","origin_price":"1034","id":"5508746","description":"YUNPEIR韵佩尔黑色简约时尚百搭圆头中筒靴厚底松糕鞋子","trackValue":"item_sku_5508746","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"273","action":{"actionType":"detail","type":"sku","id":"5508746","source":"ecshop","sourceId":"1778225","width":"806","height":"1210","main_image":0,"collectionCount":"0","trackValue":"item_sku_5508746"},"collectionCount":"0"},"width":"806","height":"1210"}],"tags":[],"appApi":"%2Fsearch%2Fskus"}
     */

    private String message;
    /**
     * flag : s18
     * items : [{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s0.mingxingyichu.cn/group5/M00/00/5D/wKgBfVZSkKSASXhOAAJWplxHT3E942.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"259","origin_price":"869","id":"5430409","description":"YUNPEIR韵佩尔性感尖头及踝靴子通勤婚鞋高跟鞋细跟短靴","trackValue":"item_sku_5430409","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"237","action":{"actionType":"detail","type":"sku","id":"5430409","source":"ecshop","sourceId":"1736963","width":"806","height":"1210","main_image":0,"collectionCount":"0","trackValue":"item_sku_5430409"},"collectionCount":"0"},"width":"806","height":"1210"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s5.mingxingyichu.cn/group5/M00/35/A8/wKgBf1ZzbviADQ9BAAOL6KXkZno031.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"229","origin_price":"759","id":"5425834","description":"YUNPEIR韵佩尔加厚平跟厚底银色雪地靴子甜美皮毛一体短靴","trackValue":"item_sku_5425834","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"315","action":{"actionType":"detail","type":"sku","id":"5425834","source":"ecshop","sourceId":"1732861","width":"806","height":"1210","main_image":0,"collectionCount":"0","trackValue":"item_sku_5425834"},"collectionCount":"0"},"width":"806","height":"1210"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s1.mingxingyichu.cn/group6/M00/72/13/wKgBjVZyhfSAczAdAAM5sR74Q04157.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"279","origin_price":"924","id":"5430266","description":"YUNPEIR韵佩尔复古铆钉粗跟黑色短靴子机车靴马丁靴子","trackValue":"item_sku_5430266","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"103","action":{"actionType":"detail","type":"sku","id":"5430266","source":"ecshop","sourceId":"1736817","width":"806","height":"1210","main_image":0,"collectionCount":"0","trackValue":"item_sku_5430266"},"collectionCount":"0"},"width":"806","height":"1210"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s6.mingxingyichu.cn/group5/M00/33/F8/wKgBfVZzgquAMwXKAAIEAt9Lq4g248.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"289","origin_price":"962","id":"5430308","description":"YUNPEIR韵佩尖头坡跟高跟黑色白领OL马丁靴子潮鞋大小码","trackValue":"item_sku_5430308","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"335","action":{"actionType":"detail","type":"sku","id":"5430308","source":"ecshop","sourceId":"1736859","width":"806","height":"1210","main_image":0,"collectionCount":"0","trackValue":"item_sku_5430308"},"collectionCount":"0"},"width":"806","height":"1210"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s3.mingxingyichu.cn/group5/M00/13/87/wKgBf1epvG-AX95mAAG3e59cjGs74.jpeg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"249","origin_price":"830","id":"6956858","description":"YUNPEIR韵佩尔真皮尖头短靴女高跟鞋粗跟通勤OL马丁靴子","trackValue":"item_sku_6956858","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"297","action":{"actionType":"detail","type":"sku","id":"6956858","source":"ecshop","sourceId":"2590133","width":"500","height":"500","main_image":0,"collectionCount":"0","trackValue":"item_sku_6956858"},"collectionCount":"0"},"width":"500","height":"500"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://mxycsku.mingxingyichu.cn/group5/M00/11/AC/wKgBfVeqq7aAebBNAAHaPLUdBm879.jpeg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"376","origin_price":"1253","id":"6957650","description":"YUNPEIR韵佩尔欧美真皮百搭短靴侧拉链粗跟中跟圆头靴子","trackValue":"item_sku_6957650","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"439","starCount":"1","action":{"actionType":"detail","type":"sku","id":"6957650","source":"ecshop","sourceId":"2590252","width":"500","height":"500","main_image":0,"collectionCount":"0","trackValue":"item_sku_6957650"},"collectionCount":"0"},"width":"500","height":"500"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://mxycsku.mingxingyichu.cn/group6/M00/AC/00/wKgBjVfCjTaAJl4MAADgfp1FVQU12.jpeg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"216","origin_price":"720","id":"6970979","description":"YUNPEIR韵佩尔真皮复古磨砂短靴粗跟女靴子方跟尖头女短靴","trackValue":"item_sku_6970979","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"436","action":{"actionType":"detail","type":"sku","id":"6970979","source":"ecshop","sourceId":"2593227","width":"500","height":"500","main_image":0,"collectionCount":"0","trackValue":"item_sku_6970979"},"collectionCount":"0"},"width":"500","height":"500"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s0.mingxingyichu.cn/group5/M00/66/DF/wKgBfVfCkXaAXcIUAANe2acfvVw35.jpeg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"336","origin_price":"1120","id":"6970983","description":"YUNPEIR韵佩尔欧美性感细跟短靴尖头蝴蝶结百搭气质女靴子","trackValue":"item_sku_6970983","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"287","action":{"actionType":"detail","type":"sku","id":"6970983","source":"ecshop","sourceId":"2593231","width":"800","height":"800","main_image":0,"collectionCount":"0","trackValue":"item_sku_6970983"},"collectionCount":"0"},"width":"800","height":"800"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s4.mingxingyichu.cn/group5/M00/C8/90/wKgBfVcDF4yAOy2QAAByzz0zq_U613.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"689","origin_price":"1749","id":"5974102","description":"爱得堡秋冬款男士皮靴马丁靴男英伦复古时尚男靴高帮男短靴子军靴","trackValue":"item_sku_5974102","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"317","starCount":"1","action":{"actionType":"detail","type":"sku","id":"5974102","source":"ecshop","sourceId":"2087965","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5974102"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s3.mingxingyichu.cn/group5/M00/CA/7E/wKgBf1cDF4yAMJ8CAABsttTVJGI416.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"499","origin_price":"1699","id":"5973954","description":"爱得堡秋冬款英伦男靴头层真皮靴子雕花布洛克马丁男靴复古高帮靴","trackValue":"item_sku_5973954","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"98","action":{"actionType":"detail","type":"sku","id":"5973954","source":"ecshop","sourceId":"2087821","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5973954"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s1.mingxingyichu.cn/group5/M00/CA/7D/wKgBf1cDF4yAdVIDAABgDVUif-k971.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"599","origin_price":"1599","id":"5973929","description":"爱得堡秋冬款男靴子春秋羊皮真皮马丁靴男潮流拉链短靴复古军靴","trackValue":"item_sku_5973929","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"305","action":{"actionType":"detail","type":"sku","id":"5973929","source":"ecshop","sourceId":"2087798","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5973929"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s6.mingxingyichu.cn/group5/M00/C8/90/wKgBfVcDF4yAURKAAABy3tuhGao704.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"649","origin_price":"1399","id":"5973988","description":"爱得堡春秋款英伦男靴潮流复古短筒真皮靴子布洛克男靴马丁靴","trackValue":"item_sku_5973988","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"384","action":{"actionType":"detail","type":"sku","id":"5973988","source":"ecshop","sourceId":"2087857","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5973988"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s1.mingxingyichu.cn/group6/M00/9A/84/wKgBjFaQdyGAbMqIAAYSK3vudTI67.jpeg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"549","origin_price":"1299","id":"5974030","description":"爱得堡秋款马丁靴男真皮靴军靴男士短靴高帮英伦靴子男新款潮","trackValue":"item_sku_5974030","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"165","action":{"actionType":"detail","type":"sku","id":"5974030","source":"ecshop","sourceId":"2087893","width":"1200","height":"1200","main_image":0,"collectionCount":"0","trackValue":"item_sku_5974030"},"collectionCount":"0"},"width":"1200","height":"1200"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s1.mingxingyichu.cn/group5/M00/CA/7E/wKgBf1cDF4yAN9ajAABmy4qlueQ824.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"799","origin_price":"1699","id":"5974037","description":"爱得堡秋冬款英伦男士皮靴休闲马丁靴子潮流男靴拉链工装靴男","trackValue":"item_sku_5974037","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"315","action":{"actionType":"detail","type":"sku","id":"5974037","source":"ecshop","sourceId":"2087899","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5974037"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s2.mingxingyichu.cn/group5/M00/CA/7E/wKgBf1cDF4yAGJyKAACB5dSiKL8297.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"699","origin_price":"1649","id":"5974039","description":"爱得堡秋款LA4休闲男靴英伦马丁靴男真皮靴子布洛克雕花短靴男","trackValue":"item_sku_5974039","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"388","action":{"actionType":"detail","type":"sku","id":"5974039","source":"ecshop","sourceId":"2087902","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5974039"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s1.mingxingyichu.cn/group6/M00/38/E4/wKgBjFdMHqKAPkQEAAERWbI0CME080.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"549","origin_price":"1299","id":"5974047","description":"爱得堡春款QS7复古男靴子英伦马丁靴男真皮军靴潮流短靴男皮靴","trackValue":"item_sku_5974047","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"482","starCount":"4","action":{"actionType":"detail","type":"sku","id":"5974047","source":"ecshop","sourceId":"2087910","width":"500","height":"500","main_image":0,"collectionCount":"0","trackValue":"item_sku_5974047"},"collectionCount":"0"},"width":"500","height":"500"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s2.mingxingyichu.cn/group6/M00/01/21/wKgBjVb4kfmAQm4BAAC6R0i2LH4837.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"999","origin_price":"1999","id":"5974054","description":"爱得堡冬款男士雪地靴男冬季休闲短筒羊毛男靴棉鞋英伦保暖男靴子","trackValue":"item_sku_5974054","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"361","starCount":"1","action":{"actionType":"detail","type":"sku","id":"5974054","source":"ecshop","sourceId":"2087916","width":"366","height":"470","main_image":0,"collectionCount":"0","trackValue":"item_sku_5974054"},"collectionCount":"0"},"width":"366","height":"470"},{"component":{"componentType":"item","publish_date":"2016","picUrl":"http://s3.mingxingyichu.cn/group6/M00/6F/70/wKgBjVZxAIyAUX_rAAMVr__R8XM850.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"309","origin_price":"1034","id":"5508746","description":"YUNPEIR韵佩尔黑色简约时尚百搭圆头中筒靴厚底松糕鞋子","trackValue":"item_sku_5508746","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"273","action":{"actionType":"detail","type":"sku","id":"5508746","source":"ecshop","sourceId":"1778225","width":"806","height":"1210","main_image":0,"collectionCount":"0","trackValue":"item_sku_5508746"},"collectionCount":"0"},"width":"806","height":"1210"}]
     * tags : []
     * appApi : %2Fsearch%2Fskus
     */

    private DataBean data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(message);
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "flag='" + flag + '\'' +
                    ", appApi='" + appApi + '\'' +
                    ", items=" + items +
                    ", tags=" + tags +
                    '}';
        }

        private String flag;
        private String appApi;
        /**
         * component : {"componentType":"item","publish_date":"2016","picUrl":"http://s0.mingxingyichu.cn/group5/M00/00/5D/wKgBfVZSkKSASXhOAAJWplxHT3E942.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E","price":"259","origin_price":"869","id":"5430409","description":"YUNPEIR韵佩尔性感尖头及踝靴子通勤婚鞋高跟鞋细跟短靴","trackValue":"item_sku_5430409","eventIcon":"","stateMessage":"","country":"国内","nationalFlag":"http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png","sales":"237","action":{"actionType":"detail","type":"sku","id":"5430409","source":"ecshop","sourceId":"1736963","width":"806","height":"1210","main_image":0,"collectionCount":"0","trackValue":"item_sku_5430409"},"collectionCount":"0"}
         * width : 806
         * height : 1210
         */

        private List<ItemsBean> items;
        private List<?> tags;

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public String getAppApi() {
            return appApi;
        }

        public void setAppApi(String appApi) {
            this.appApi = appApi;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }

        public static class ItemsBean {
            /**
             * componentType : item
             * publish_date : 2016
             * picUrl : http://s0.mingxingyichu.cn/group5/M00/00/5D/wKgBfVZSkKSASXhOAAJWplxHT3E942.jpg?imageMogr2/format/WEBP/thumbnail/320x%3E
             * price : 259
             * origin_price : 869
             * id : 5430409
             * description : YUNPEIR韵佩尔性感尖头及踝靴子通勤婚鞋高跟鞋细跟短靴
             * trackValue : item_sku_5430409
             * eventIcon :
             * stateMessage :
             * country : 国内
             * nationalFlag : http://s0.mingxingyichu.cn/group6/M00/53/AB/wKgBjVeqzaKAEw9BAAAD_m-28wU681.png
             * sales : 237
             * action : {"actionType":"detail","type":"sku","id":"5430409","source":"ecshop","sourceId":"1736963","width":"806","height":"1210","main_image":0,"collectionCount":"0","trackValue":"item_sku_5430409"}
             * collectionCount : 0
             */

            private ComponentBean component;
            private String width;
            private String height;

            @Override
            public String toString() {
                return "ItemsBean{" +
                        "component=" + component +
                        ", width='" + width + '\'' +
                        ", height='" + height + '\'' +
                        '}';
            }

            public ComponentBean getComponent() {
                return component;
            }

            public void setComponent(ComponentBean component) {
                this.component = component;
            }

            public String getWidth() {
                return width;
            }

            public void setWidth(String width) {
                this.width = width;
            }

            public String getHeight() {
                return height;
            }

            public void setHeight(String height) {
                this.height = height;
            }

            public static class ComponentBean {
                private String componentType;
                private String publish_date;
                private String picUrl;
                private String price;
                private String origin_price;
                private String id;
                private String description;
                private String trackValue;
                private String eventIcon;
                private String stateMessage;
                private String country;
                private String nationalFlag;
                private String sales;

                @Override
                public String toString() {
                    return "ComponentBean{" +
                            "componentType='" + componentType + '\'' +
                            ", publish_date='" + publish_date + '\'' +
                            ", picUrl='" + picUrl + '\'' +
                            ", price='" + price + '\'' +
                            ", origin_price='" + origin_price + '\'' +
                            ", id='" + id + '\'' +
                            ", description='" + description + '\'' +
                            ", trackValue='" + trackValue + '\'' +
                            ", eventIcon='" + eventIcon + '\'' +
                            ", stateMessage='" + stateMessage + '\'' +
                            ", country='" + country + '\'' +
                            ", nationalFlag='" + nationalFlag + '\'' +
                            ", sales='" + sales + '\'' +
                            ", action=" + action +
                            ", collectionCount='" + collectionCount + '\'' +
                            '}';
                }

                /**
                 * actionType : detail
                 * type : sku
                 * id : 5430409
                 * source : ecshop
                 * sourceId : 1736963
                 * width : 806
                 * height : 1210
                 * main_image : 0
                 * collectionCount : 0
                 * trackValue : item_sku_5430409
                 */

                private ActionBean action;
                private String collectionCount;

                public String getComponentType() {
                    return componentType;
                }

                public void setComponentType(String componentType) {
                    this.componentType = componentType;
                }

                public String getPublish_date() {
                    return publish_date;
                }

                public void setPublish_date(String publish_date) {
                    this.publish_date = publish_date;
                }

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getOrigin_price() {
                    return origin_price;
                }

                public void setOrigin_price(String origin_price) {
                    this.origin_price = origin_price;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getTrackValue() {
                    return trackValue;
                }

                public void setTrackValue(String trackValue) {
                    this.trackValue = trackValue;
                }

                public String getEventIcon() {
                    return eventIcon;
                }

                public void setEventIcon(String eventIcon) {
                    this.eventIcon = eventIcon;
                }

                public String getStateMessage() {
                    return stateMessage;
                }

                public void setStateMessage(String stateMessage) {
                    this.stateMessage = stateMessage;
                }

                public String getCountry() {
                    return country;
                }

                public void setCountry(String country) {
                    this.country = country;
                }

                public String getNationalFlag() {
                    return nationalFlag;
                }

                public void setNationalFlag(String nationalFlag) {
                    this.nationalFlag = nationalFlag;
                }

                public String getSales() {
                    return sales;
                }

                public void setSales(String sales) {
                    this.sales = sales;
                }

                public ActionBean getAction() {
                    return action;
                }

                public void setAction(ActionBean action) {
                    this.action = action;
                }

                public String getCollectionCount() {
                    return collectionCount;
                }

                public void setCollectionCount(String collectionCount) {
                    this.collectionCount = collectionCount;
                }

                public static class ActionBean {
                    private String actionType;
                    private String type;
                    private String id;
                    private String source;
                    private String sourceId;
                    private String width;
                    private String height;
                    private int main_image;
                    private String collectionCount;
                    private String trackValue;

                    @Override
                    public String toString() {
                        return "ActionBean{" +
                                "actionType='" + actionType + '\'' +
                                ", type='" + type + '\'' +
                                ", id='" + id + '\'' +
                                ", source='" + source + '\'' +
                                ", sourceId='" + sourceId + '\'' +
                                ", width='" + width + '\'' +
                                ", height='" + height + '\'' +
                                ", main_image=" + main_image +
                                ", collectionCount='" + collectionCount + '\'' +
                                ", trackValue='" + trackValue + '\'' +
                                '}';
                    }

                    public String getActionType() {
                        return actionType;
                    }

                    public void setActionType(String actionType) {
                        this.actionType = actionType;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getSource() {
                        return source;
                    }

                    public void setSource(String source) {
                        this.source = source;
                    }

                    public String getSourceId() {
                        return sourceId;
                    }

                    public void setSourceId(String sourceId) {
                        this.sourceId = sourceId;
                    }

                    public String getWidth() {
                        return width;
                    }

                    public void setWidth(String width) {
                        this.width = width;
                    }

                    public String getHeight() {
                        return height;
                    }

                    public void setHeight(String height) {
                        this.height = height;
                    }

                    public int getMain_image() {
                        return main_image;
                    }

                    public void setMain_image(int main_image) {
                        this.main_image = main_image;
                    }

                    public String getCollectionCount() {
                        return collectionCount;
                    }

                    public void setCollectionCount(String collectionCount) {
                        this.collectionCount = collectionCount;
                    }

                    public String getTrackValue() {
                        return trackValue;
                    }

                    public void setTrackValue(String trackValue) {
                        this.trackValue = trackValue;
                    }
                }
            }
        }
    }
}
