package cdtu.com.school.model.bean;

import java.util.Date;

/**
 * 用户评价最基本的类（所有评价的父类）
 * Created by huangjie on 2016/4/11.
 */
public abstract class Comment {
    public String id;
    public String content;
    public User user;
    public Date date;
    public int zan;//赞数

    public int getZan() {
        return zan;
    }

    public void setZan(int zan) {
        this.zan = zan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Comment [id=" + id + ", content=" + content + ", user=" + user
                + ", date=" + date + ", zan=" + zan + "]";
    }

}
