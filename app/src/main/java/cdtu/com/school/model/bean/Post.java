package cdtu.com.school.model.bean;

import java.util.Date;
import java.util.List;

/**
 * Created by huangjie on 2016/4/12.
 * 论坛帖子
 */
public class Post {
    private String id;
    private String title;
    private String content;
    private String imgs;
    private List<PostComment> comments; //评论
    private int zan;//
    private int repost;//转发次数
    private User user;//该贴子所对应的用户
    private String address;//发帖位置
    private Date date;//发帖时间


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getImgs() {
        return imgs;
    }
    public void setImgs(String imgs) {
        this.imgs = imgs;
    }
    public List<PostComment> getComments() {
        return comments;
    }
    public void setComments(List<PostComment> comments) {
        this.comments = comments;
    }
    public int getZan() {
        return zan;
    }
    public void setZan(int zan) {
        this.zan = zan;
    }
    public int getRepost() {
        return repost;
    }
    public void setRepost(int repost) {
        this.repost = repost;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

//	@Override
//	public String toString() {
//		return "Post [id=" + id + ", title=" + title + ", content=" + content
//				+ ", imgs=" + imgs + ", zan=" + zan + ", repost=" + repost
//				+ "]";
//	}

    @Override
    public String toString() {
        return "[id:" + id + ", title:" + title + ", content:" + content
                + ", imgs:" + imgs + ", comments:" + comments + ", zan:" + zan
                + ", repost:" + repost + ", user:" + user + ", address:"
                + address +",date:" + date + "]";
    }



}

