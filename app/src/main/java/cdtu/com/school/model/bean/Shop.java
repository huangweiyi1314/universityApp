package cdtu.com.school.model.bean;

import java.util.List;

/**
 * 商品店铺类
 * Created by huangjie on 2016/4/11.
 */public class Shop {
    private String id;
    private String name;
    private String img;
    private double star;//星级
    private User boss;
    private String address;
    private String intro;
    private List<Goods> goods ;


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
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public double getStar() {
        return star;
    }
    public void setStar(double star) {
        this.star = star;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<Goods> getGoods() {
        return goods;
    }
    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
    public User getBoss() {
        return boss;
    }
    public void setBoss(User boss) {
        this.boss = boss;
    }
    public String getIntro() {
        return intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "[id:" + id + ", name:" + name + ", img:" + img + ", star:"
                + star + ", boss:" + boss + ", address:" + address + ", goods:"
                + goods + ",intro" + intro +  "]";
    }


}
