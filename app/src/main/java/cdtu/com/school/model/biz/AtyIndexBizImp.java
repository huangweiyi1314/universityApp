package cdtu.com.school.model.biz;

import android.util.Log;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;

import cdtu.com.school.model.instance.Instance;
import cdtu.com.school.model.utils.NetConnection;
import cdtu.com.school.model.utils.SchoolApplication;

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
        return null;
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

        return null;
    }

    @Override
    public void getData(NetConnection.netSuccessCallBack successCallBack, NetConnection.netFailCallBack failCallBack, String... parmas) {

        new NetConnection(parmas[0], successCallBack, failCallBack);

    }


    @Override
    public void addUnisersity(String city, String universityName) {
        Instance.addUnisersityDb(city, universityName);

    }

    @Override
    public void onReceiveLocation(BDLocation bdLocation) {
        if (bdLocation != null) {
            locationCity = bdLocation.getCity();
            Log.i("huangie", "location_address" + bdLocation.getAddress());
        }

    }
}
