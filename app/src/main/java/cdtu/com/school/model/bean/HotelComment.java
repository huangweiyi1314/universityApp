package cdtu.com.school.model.bean;

/**
 * 酒店评论
 * Created by huangjie on 2016/4/11.
 */
public class HotelComment extends Comment{
    private Hotel hotel;

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "[id:" + id + ", content:" + content + ", user:"
                + user + ", date:" + date + ", zan:" + zan + "]";
    }
}