package cdtu.com.school.model.bean;

import java.math.BigDecimal;

/**
 * Created by huangjie on 2016/4/12.
 * 购物车条目类
 */
public class CartItem {
    private Goods goods;
    private int count;

    /**
     *获取小计
     */
    public double getSubtotal(){
        BigDecimal d1 = new BigDecimal(goods.getPrice() + "");
        BigDecimal d2 = new BigDecimal(count + "");
        return d1.multiply(d2).doubleValue(); //总额=数量×单价
    }

    public Goods getGoods() {
        return goods;
    }
    public void setGoods(Goods goods) {
        this.goods = goods;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String toString() {
        return "CartItem [Goods=" + goods + ", count=" + count + "]";
    }

}

