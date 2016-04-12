package cdtu.com.school.model.bean;

import java.util.List;

/**
 * Created by huangjie on 2016/4/11.
 * 酒店类
 */
public class Hotel {
    private String id;
    private String name;
    private String intro;//简介
    private String img;
    private String tel;
    private double avg;//人均消费
    private String activity;//优惠活动
    private String address;
    private List<HotelComment> comments;

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

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }


    public List<HotelComment> getComments() {
        return comments;
    }

    public void setComments(List<HotelComment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Hotel [id=" + id + ", name=" + name + ", intro=" + intro
                + ", img=" + img + ", address=" + address + ", tel=" + tel
                + ", avg=" + avg + ", activity=" + activity + ", comments="
                + comments + "]";
    }

}
