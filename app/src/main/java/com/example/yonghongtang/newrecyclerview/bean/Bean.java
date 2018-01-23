package com.example.yonghongtang.newrecyclerview.bean;

import java.util.List;

/**
 * Created by yonghong.tang on 2017/12/21.
 */

public class Bean {


    /**
     * code : 200
     * msg : success
     * data : [{"id":"121","goods_name":"经典款丨美白嫩肤面膜7片","shop_price":49.9,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/121/goods_img/17062610568378169043195978.jpg","sales_volume":126940,"efficacy":"美白嫩肤 层层葆鲜","goods_type":"0","activityPrice":49.9,"sort":0},{"id":"684","goods_name":"解救肌渴丨花粹水润面膜套装10片","shop_price":29.9,"market_price":139,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/684/goods_img/17062610401397749701177609.jpg","sales_volume":106497,"efficacy":"水润充盈 鲜嫩少女肌","goods_type":"0","activityPrice":29.9,"sort":0},{"id":"772","goods_name":"热销爆款丨清润莹亮黑膜套装21片","shop_price":99.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/772/goods_img/171016095389114258195255761.jpg","sales_volume":85610,"efficacy":"自然莹亮  水感瓷肌","goods_type":"0","activityPrice":99.9,"sort":0},{"id":"5","goods_name":"亮采金桂花眼膜贴60片","shop_price":69,"market_price":129,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/5/goods_img/17103118031591202108007689.jpg","sales_volume":69221,"efficacy":"补水靓眼 改善熊猫眼","goods_type":"0","activityPrice":69,"sort":0},{"id":"343","goods_name":"美白嫩肤润肤水150ml","shop_price":69,"market_price":119,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/343/goods_img/170626103423611420000294568.jpg","sales_volume":62164,"efficacy":"补水保湿 美白嫩肤","goods_type":"0","activityPrice":59,"sort":0},{"id":"9","goods_name":"玫瑰滋养矿物睡眠面膜180g","shop_price":59.9,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/9/goods_img/170626112611018894167156705.jpg","sales_volume":54343,"efficacy":"镇店之宝 彻夜补水","goods_type":"0","activityPrice":59.9,"sort":0},{"id":"16","goods_name":"玫瑰滋养保湿四件套","shop_price":169.9,"market_price":259.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/16/goods_img/17062611152592656236701367.jpg","sales_volume":45984,"efficacy":"一整套源源补水","goods_type":"0","activityPrice":169.9,"sort":0},{"id":"446","goods_name":"芦荟补水保湿凝胶150g","shop_price":49.9,"market_price":89,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/446/goods_img/17112211433972519259384989.jpg","sales_volume":45321,"efficacy":"滋养肌肤 自然水润","goods_type":"0","activityPrice":29.9,"sort":0},{"id":"8","goods_name":"全新升级丨美白嫩肤面膜20片","shop_price":119.9,"market_price":359,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/8/goods_img/170818182578717903477668239.jpg","sales_volume":43331,"efficacy":"真美白 匠心造","goods_type":"0","activityPrice":129.9,"sort":0},{"id":"559","goods_name":"竹炭净透矿物泥浆面膜110g","shop_price":59,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/559/goods_img/170627164784010618075663103.jpg","sales_volume":26613,"efficacy":"控油净肤 细腻毛孔","goods_type":"0","activityPrice":59,"sort":0},{"id":"101","goods_name":"玫瑰滋养矿物洁面乳100ml","shop_price":29.9,"market_price":59,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/101/goods_img/170626105885015353255525556.jpg","sales_volume":24720,"efficacy":"温和清洁 补水保湿","goods_type":"0","activityPrice":26.9,"sort":0},{"id":"87","goods_name":"玫瑰滋养面膜7片","shop_price":79,"market_price":89,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/87/goods_img/170904211885816205585811962.jpg","sales_volume":22163,"efficacy":"岂止补水 更能锁水","goods_type":"0","activityPrice":1,"sort":0},{"id":"315","goods_name":"玫瑰滋养矿物润肤水","shop_price":65,"market_price":109,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/315/goods_img/17062610389695661847862326.jpg","sales_volume":21040,"efficacy":"补水保湿 静享芬芳","goods_type":"0","activityPrice":39.9,"sort":0},{"id":"1189","goods_name":"新品上市丨清透盈润面膜套装21片","shop_price":59.9,"market_price":297,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1189/goods_img/17093019432252555150652465.jpg","sales_volume":17676,"efficacy":"水感剔透 鲜颜嫩肌","goods_type":"0","activityPrice":59.9,"sort":0},{"id":"336","goods_name":"玫瑰滋养矿物润肤乳液","shop_price":69,"market_price":129,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/336/goods_img/170626103574019791491356888.jpg","sales_volume":17241,"efficacy":"有效保湿 持久滋养","goods_type":"0","activityPrice":69,"sort":0},{"id":"313","goods_name":"清爽平衡矿物爽肤水150ml","shop_price":65,"market_price":109,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/313/goods_img/17062610398875573627694321.jpg","sales_volume":16299,"efficacy":"补水控油 收敛毛孔","goods_type":"0","activityPrice":39.9,"sort":0},{"id":"17","goods_name":"男士黑茶控油护肤三件套","shop_price":99.9,"market_price":199.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/17/goods_img/170626111428511385203738370.jpg","sales_volume":15464,"efficacy":"控油保湿 型男必备","goods_type":"0","activityPrice":99.9,"sort":0},{"id":"58","goods_name":"矿物养肤霜(滋润型)50g","shop_price":79,"market_price":129,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/58/goods_img/17062611136002045493655733.jpg","sales_volume":14588,"efficacy":"滋润补水 保湿水润","goods_type":"0","activityPrice":59.9,"sort":0},{"id":"745","goods_name":"全新升级丨晶亮红石榴面膜7片","shop_price":79,"market_price":89,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/745/goods_img/17081617418998795654179347.jpg","sales_volume":12450,"efficacy":"深度排浊 一扫黯哑","goods_type":"0","activityPrice":79,"sort":0},{"id":"487","goods_name":"海洋弹性蛋白矿物精华眼霜25g","shop_price":139,"market_price":169,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/487/goods_img/170626101843492134395965.jpg","sales_volume":10836,"efficacy":"提拉紧致 润亮双眸","goods_type":"0","activityPrice":79.9,"sort":0},{"id":"1638","goods_name":"嫩肌酵素黑膜礼盒21片","shop_price":139.9,"market_price":299,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1638/goods_img/17120411512014997886545935.jpg","sales_volume":10720,"efficacy":"极地酵素 \u201c酵\u201d醒美肌","goods_type":"0","activityPrice":89.9,"sort":0},{"id":"161","goods_name":"送7片共14片|男士补水活力矿物蚕丝7片","shop_price":59.9,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/161/goods_img/170626104914816121546518189.jpg","sales_volume":10516,"efficacy":"补水保湿 清爽控油","goods_type":"0","activityPrice":49.9,"sort":0},{"id":"181","goods_name":"玫瑰滋养矿物身体乳150ml","shop_price":59,"market_price":69,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/181/goods_img/17062610488813716930552962.jpg","sales_volume":10043,"efficacy":"补水保湿 柔嫩丝滑","goods_type":"0","activityPrice":59,"sort":0},{"id":"317","goods_name":"红石榴矿物养肤水150ml","shop_price":69,"market_price":119,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/317/goods_img/17062610389915626170283673.jpg","sales_volume":9504,"efficacy":"有效补水 莹润透亮","goods_type":"0","activityPrice":49.9,"sort":0},{"id":"7","goods_name":"丝滑莹润矿物护手霜50g*2支","shop_price":59,"market_price":79,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/7/goods_img/170626112429717477141188399.jpg","sales_volume":8860,"efficacy":"柔润滑嫩 滋养保湿","goods_type":"0","activityPrice":29.9,"sort":0},{"id":"511","goods_name":"蜂蜜矿物润肤水150ml","shop_price":89,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/511/goods_img/170626105211814415951492415.jpg","sales_volume":8607,"efficacy":"持久补水 充沛水润","goods_type":"0","activityPrice":39.9,"sort":0},{"id":"319","goods_name":"补水首选丨男士补水活力矿物蚕丝21片","shop_price":99.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/319/goods_img/17062610389308105384234516.jpg","sales_volume":7560,"efficacy":"畅爽补水 活力四射","goods_type":"0","activityPrice":99.9,"sort":0},{"id":"61","goods_name":"男士黑茶控油保湿两件套 （洁面乳，保湿露）","shop_price":69.9,"market_price":129.9,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/61/goods_img/17062611124916581955077472.jpg","sales_volume":7170,"efficacy":"控油保湿 清爽洁净","goods_type":"0","activityPrice":59.9,"sort":0},{"id":"1281","goods_name":"红石榴矿物眼霜25g","shop_price":129,"market_price":159,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1281/goods_img/170626102555811776047044227.jpg","sales_volume":6922,"efficacy":"淡化细纹 净彻排浊","goods_type":"0","activityPrice":79.9,"sort":0},{"id":"869","goods_name":"男士深海水动力洁面乳","shop_price":39.9,"market_price":59,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/869/goods_img/17062610284582879718612169.jpg","sales_volume":6720,"efficacy":"洁净控油 深层补水","goods_type":"0","activityPrice":39.9,"sort":0}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 121
         * goods_name : 经典款丨美白嫩肤面膜7片
         * shop_price : 49.9
         * market_price : 99.0
         * is_coupon_allowed : true
         * is_allow_credit : false
         * goods_img : https://image.yunifang.com/yunifang/images/goods/121/goods_img/17062610568378169043195978.jpg
         * sales_volume : 126940
         * efficacy : 美白嫩肤 层层葆鲜
         * goods_type : 0
         * activityPrice : 49.9
         * sort : 0
         */

        private String id;
        private String goods_name;
        private double shop_price;
        private double market_price;
        private boolean is_coupon_allowed;
        private boolean is_allow_credit;
        private String goods_img;
        private int sales_volume;
        private String efficacy;
        private String goods_type;
        private double activityPrice;
        private int sort;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public double getShop_price() {
            return shop_price;
        }

        public void setShop_price(double shop_price) {
            this.shop_price = shop_price;
        }

        public double getMarket_price() {
            return market_price;
        }

        public void setMarket_price(double market_price) {
            this.market_price = market_price;
        }

        public boolean isIs_coupon_allowed() {
            return is_coupon_allowed;
        }

        public void setIs_coupon_allowed(boolean is_coupon_allowed) {
            this.is_coupon_allowed = is_coupon_allowed;
        }

        public boolean isIs_allow_credit() {
            return is_allow_credit;
        }

        public void setIs_allow_credit(boolean is_allow_credit) {
            this.is_allow_credit = is_allow_credit;
        }

        public String getGoods_img() {
            return goods_img;
        }

        public void setGoods_img(String goods_img) {
            this.goods_img = goods_img;
        }

        public int getSales_volume() {
            return sales_volume;
        }

        public void setSales_volume(int sales_volume) {
            this.sales_volume = sales_volume;
        }

        public String getEfficacy() {
            return efficacy;
        }

        public void setEfficacy(String efficacy) {
            this.efficacy = efficacy;
        }

        public String getGoods_type() {
            return goods_type;
        }

        public void setGoods_type(String goods_type) {
            this.goods_type = goods_type;
        }

        public double getActivityPrice() {
            return activityPrice;
        }

        public void setActivityPrice(double activityPrice) {
            this.activityPrice = activityPrice;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }
    }
}
