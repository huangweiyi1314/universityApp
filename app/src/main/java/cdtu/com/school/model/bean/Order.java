package cdtu.com.school.model.bean;

import java.util.Date;
import java.util.List;

/**
 * 订单
 * Created by huangjie on 2016/4/11.
 */
public class Order {
    private String oid;
    private Date ordertime;
    private double total;
    //订单有不同的状态，不同的数字分别代表不同的状态
    //0.未付款，但是客户已取消该订单
    //1.未付款2.已付款但未发货3.已发货但未确认收货
    //4.已确认交易成功但还没有评论
    //5.交易完成，评论完成
    private int state;
    private User owner;//订单的所有者
    private String address;
    private String cancelinfo;//取消订单的信息（原因）
    private List<OrderItem> orderItemList ;//当前订单下所有订单条目
}
