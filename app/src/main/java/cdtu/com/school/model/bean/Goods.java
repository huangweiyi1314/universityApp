package cdtu.com.school.model.bean;

import java.util.List;

/**
 * 商品
 * Created by huangjie on 2016/4/11.
 */
public class Goods {
    private String id;
    private String name;
    private int count;
    private double price;
    private String img;
    private Category category;
    private Shop shop;
    private List<GoodsComment> comments;//商品评论
    private boolean online;//商品是否上线（上线即能够直接购买）,0:下线，1：上线
    private boolean illegal;//是否非法：一些商品不合格，系统管理能够强制让其下架，而店家就再也不能将其上架了。0-false合法（即默认合法），1-true非法


    public Goods() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<GoodsComment> getComments() {
        return comments;
    }

    public void setComments(List<GoodsComment> comments) {
        this.comments = comments;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public boolean isIllegal() {
        return illegal;
    }

    public void setIllegal(boolean illegal) {
        this.illegal = illegal;
    }

    @Override
    public String toString() {
        return " [id:" + id + ", name:" + name + ", count:" + count
                + ", price:" + price + ", img:" + img + ", category:"
                + category + ",comments:" + comments + ",online:" + online + "]";
    }


}
