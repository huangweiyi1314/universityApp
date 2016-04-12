package cdtu.com.school.model.bean;

import java.util.List;

/**
 * 注册用户
 * Created by huangjie on 2016/4/11.
 */
public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private boolean state;//激活状态
    private String code;//激活码
    private String tel;
    private String sex;
    private String type;//用户类型：normal即为普通用户，shopkeeper即为店家
    private String address;//用户的收货地址
    private String intro;//个人简介
    private String icon;//头像
    private List<Order> orders;
}
