package cdtu.com.school.model.bean;

/**
 * 帖子评论
 * Created by huangjie on 2016/4/12.
 */
public class PostComment extends Comment{
    private Post post;//所对应的帖子

    public Post getPost() {
        return post;
    }


    public void setPost(Post post) {
        this.post = post;
    }


    @Override
    public String toString() {
        return "[id:" + id + ", content:" + content + ", user:"
                + user + ", date:" + date + ", zan:" + zan + "]";
    }

}

