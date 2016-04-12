package cdtu.com.school.model.bean;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by huangjie on 2016/4/12.
 * 购物车类
 */
public class Cart {
    public Map<String,CartItem> map = new LinkedHashMap<String, CartItem>();

    /**
     * 返回购物车累计总额：合计=所有条目小计之和
     */
    public double getTotal(){
        //处理二进制计算有误问题
        BigDecimal total = new BigDecimal("0");

        for (CartItem cartItem : map.values()) {
            BigDecimal subTotal = new BigDecimal(cartItem.getSubtotal() + "");
            total = total.add(subTotal);
        }

        return total.doubleValue();
    }

    /**
     * 添加条目到车中
     */
    public void add(CartItem cartItem){
        //判断原车中是否含有该条目

        if(map.containsKey(cartItem.getGoods().getId() ) ){
            CartItem _cartItem = map.get( cartItem.getGoods().getId() );//返回原条目
            _cartItem.setCount(_cartItem.getCount() + cartItem.getCount());
            map.put(cartItem.getGoods().getId() , _cartItem);
        }else{
            map.put(cartItem.getGoods().getId() , cartItem);
        }

    }

    /**
     * 清空购物车（清除所有条目）
     */
    public void clear(){
        map.clear();
    }

    /**
     * 删除某个条目
     */
    public void delete(String bid){
        map.remove(bid);
    }

    /**
     * 获取所有购物车条目
     */
    public Collection<CartItem> getCartItems(){
        return map.values();
    }

}
