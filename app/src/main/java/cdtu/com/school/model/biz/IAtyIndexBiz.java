package cdtu.com.school.model.biz;

import cdtu.com.school.model.utils.NetConnection;

/**
 * Created by huangjie on 2016/4/13.
 */
public interface IAtyIndexBiz {
    public String  getLocation();//获取当前城市
    public String getLocationUniversity(String location);//获取当前城市大学列表
    public void  getData(NetConnection.netSuccessCallBack successCallBack,NetConnection.netFailCallBack failCallBack,String... parmas);//获取网络数据,第一个参数是模块名
    public void addUnisersity(String city,String universityName);//往数据库中添加
}
