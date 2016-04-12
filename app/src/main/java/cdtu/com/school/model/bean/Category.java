package cdtu.com.school.model.bean;

/**
 * Created by huangjie on 2016/4/11.
 * 商品分类
 */
public class Category {
    private String id;
    private String name;
    private String img;
    private String intro;

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

    public String getIntro() {
        return intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
    @Override
    public String toString() {
        return "[id:" + id + ", name:" + name + ", img:" + img
                + ", intro:" + intro + "]";
    }


}

