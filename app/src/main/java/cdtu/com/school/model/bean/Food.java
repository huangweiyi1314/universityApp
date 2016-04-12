package cdtu.com.school.model.bean;

import java.util.List;

/**
 * 美食类
 * Created by huangjie on 2016/4/12.
 */
public class Food {
    private String id;
    private String name;
    private String img;
    private double avg;//人均消费
    private String tel;
    private String address;
    private String intro;
    private List<FoodComment> comments;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public List<FoodComment> getComments() {
        return comments;
    }

    public void setComments(List<FoodComment> comments) {
        this.comments = comments;
    }

    //	@Override
//	public String toString() {
//		return "Food [id=" + id + ", name=" + name + ", img=" + img + ", agv="
//				+ avg + ", tel=" + tel + "]";
//	}
    @Override
    public String toString() {
        return "[id:" + id + ", name:" + name + ", address:" + address
                + ", img:" + img + ", avg:" + avg + ", tel:" + tel + ", intro:"
                + intro + "]";
    }

}
