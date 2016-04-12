package cdtu.com.school.model.bean;

/**
 * 景点评论
 * Created by huangjie on 2016/4/12.
 */
public class SceneryComment extends Comment{
    private Scenery scenery;

    public Scenery getScenery() {
        return scenery;
    }

    public void setScenery(Scenery scenery) {
        this.scenery = scenery;
    }

    @Override
    public String toString() {
        return "[id:" + id + ", content:" + content + ", user:"
                + user + ", date:" + date + ", zan:" + zan + "]";
    }
}

