package cdtu.com.school.view;

import android.view.View;

/**
 * Created by huangjie on 2016/4/12.
 */
public interface IAtyIndex {
    //打开定位框
    public void showLocationSchool();
    //打开其它acitivity
    public void toStartOtherAty();
    public void changeAdapter();//改变Adapter
    public void replaceView();//替换View
    public void restoreView();//复原View
    public View getView();//获取View
    public void InvaliedVIew();//通知View刷新界面


}
