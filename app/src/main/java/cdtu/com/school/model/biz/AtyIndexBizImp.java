package cdtu.com.school.model.biz;

import android.util.Log;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;

import cdtu.com.school.model.instance.Instance;
import cdtu.com.school.model.utils.NetConnection;
import cdtu.com.school.model.utils.SchoolApplication;
import cdtu.com.school.model.utils.ToastUtils;

/**
 * Created by huangjie on 2016/4/13.
 */
public class AtyIndexBizImp implements IAtyIndexBiz, BDLocationListener {
    private LocationClient mLocationClient;
    private String locationCity;

    @Override
    public String getLocation() {
        mLocationClient = new LocationClient(SchoolApplication.getContext());
        setLocation();
        mLocationClient.registerLocationListener(this);
        mLocationClient.start();
        return locationCity;
    }

    /**
     * 设置定位参数
     */
    private void setLocation() {
        LocationClientOption option = new LocationClientOption();
        option.setOpenGps(true);
        option.setIsNeedAddress(true);
        option.setServiceName("com.baidu.location.service_v2.9");
        option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);
        option.setCoorType("bd0911");
        mLocationClient.setLocOption(option);

    }

    @Override
    public String getLocationUniversity(String location) {
        //new NetConnection();
        return null;
    }

    @Override
    public void getData(String url) {
         /*  new NetConnection(url, new NetConnection.netSuccessCallBack() {
               @Override
               public void Success(String result) {
                 Log.i("huangjie","<<<<<<<<<<<<<<"+result);
               }
           }, new NetConnection.netFailCallBack() {
               @Override
               public void Failed() {
                   ToastUtils.show("请检查你的网络");
               }
           });*/
    }


    @Override
    public void onReceiveLocation(BDLocation bdLocation) {
        if (bdLocation != null) {
            locationCity = bdLocation.getCity();
            Log.i("huangie", "location_address" + locationCity);
        }

    }
}
