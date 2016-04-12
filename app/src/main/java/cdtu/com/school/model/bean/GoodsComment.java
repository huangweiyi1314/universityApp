package cdtu.com.school.model.bean;

/**
 * Created by huangjie on 2016/4/11.
 * 商品评论
 */
public class GoodsComment extends Comment{
    private Goods goods;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "[id:" + id + ", content:" + content + ", user:"
                + user + ", date:" + date + ", zan:" + zan + "]";
    }


}
