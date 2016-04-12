package cdtu.com.school.model.bean;

/**
 * 美食评论
 * Created by huangjie on 2016/4/12.
 */
public class FoodComment extends Comment{
    private Food food;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "[id:" + id + ", content:" + content + ", user:"
                + user + ", date:" + date + ", zan:" + zan + "]";
    }



}

