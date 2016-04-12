package cdtu.com.school.model.bean;

/**
 *
 * 订单条目类
 */
public class OrderItem {
    private String iid;
    private int count;
    private double subtotal;
    private  Order order1;//所属订单，order1是为了避免数据库的关键字
    private boolean iscomment;//该条目是否被评论
    private Goods goods;
    private int state;//0表示卖家还未发货，1表示卖家已经发货还未收货，2表示已经收货


    public boolean isIscomment() {
        return iscomment;
    }
    public void setIscomment(boolean iscomment) {
        this.iscomment = iscomment;
    }
    public String getIid() {
        return iid;
    }
    public void setIid(String iid) {
        this.iid = iid;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }


    public Order getOrder1() {
        return order1;
    }
    public void setOrder1(Order order1) {
        this.order1 = order1;
    }

    public Goods getGoods() {
        return goods;
    }
    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "[iid:" + iid + ", count:" + count + ", subtotal:"
                + subtotal + ", iscomment:" + iscomment + ", goods:"
                + goods + ",state:" + state  + "]";
    }



}
