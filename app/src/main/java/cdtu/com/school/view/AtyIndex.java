package cdtu.com.school.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cdtu.com.school.R;
import cdtu.com.school.model.bean.Hotel;
import cdtu.com.school.model.biz.AtyIndexBizImp;
import cdtu.com.school.model.instance.Instance;
import cdtu.com.school.model.utils.CommonAdapter;
import cdtu.com.school.model.utils.HttpMethod;
import cdtu.com.school.model.utils.NetConnection;
import cdtu.com.school.model.utils.SchoolApplication;
import cdtu.com.school.model.utils.ViewHolder;

/**
 * Created by huangjie on 2016/4/12.
 */
public class AtyIndex extends AppCompatActivity implements IAtyIndex {
    private ImageView mfoodImg;
    private ImageView mMovieImg;
    private ImageView mSceneryImg;
    private ImageView mForumImg;
    private ImageView mHotalImg;
    private ImageView mNearlyImg;
    private ImageView mMeImg;
    private ImageView mSearchImg;
    private ImageView mLocationImg;
    private LinearLayout mLinearlayoutFood;
    private LinearLayout mLinearlayoutMovie;
    private LinearLayout mLinearlayoutForum;
    private LinearLayout mLinearlayoutScenery;
    private LinearLayout mLinearlayoutHotal;
    private LinearLayout mLinearlayoutMe;
    private LinearLayout mLinearlayoutLocation;
    private LinearLayout mLinearlayoutSearch;
    private LinearLayout mLinearlayoutNearly;
    private View.OnTouchListener mOnTouchLitener;
    private ListView mRightListview;
    private ViewPager mViewPager;
    private List<View> mViewPagerImageView;
    private List<Hotel> datas;
    private int lastX;//记录当按下的时候的位置
    private LinearLayout.LayoutParams params;
    private int firstDownLeftMargin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_index);
        testData();
        initView();
        initevent();
        Map<String,String> params = new HashMap<String,String>();
        params.put("method","login");
        params.put("username","a");
        params.put("password","a");
        params.put("from","e73aa629aa9d40e8b7073ee8f7f0d58e");
        String home_url="http://ipoter.cn/lifeapp";
        String img_url="http://ipoter.cn";
        Log.i("----","---"+home_url);
        new NetConnection(home_url+"/user",HttpMethod.POST, new NetConnection.netSuccessCallBack() {
            @Override
            public void Success(String result) {
               Log.i("huangjie","<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<黄杰"+result);
            }
        }, new NetConnection.netFailCallBack() {
            @Override
            public void Failed() {

            }
        },params);

    }

    private void testData() {
        datas = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            Hotel hotel = new Hotel();
            hotel.setName("hotal" + i);
            hotel.setIntro("ajifsfimsagjsg");
            datas.add(hotel);
        }
    }

    private void initevent() {
        mMeImg.setOnTouchListener(mOnTouchLitener);
        mLocationImg.setOnTouchListener(mOnTouchLitener);
        mSearchImg.setOnTouchListener(mOnTouchLitener);
        mfoodImg.setOnTouchListener(mOnTouchLitener);
        mForumImg.setOnTouchListener(mOnTouchLitener);
        mHotalImg.setOnTouchListener(mOnTouchLitener);
        mSceneryImg.setOnTouchListener(mOnTouchLitener);
        mNearlyImg.setOnTouchListener(mOnTouchLitener);
        mMovieImg.setOnTouchListener(mOnTouchLitener);
        new AtyIndexBizImp().getLocation();
        mViewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return Instance.ATY_INDEX_VIEWPAGER_COUNT;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ImageView imageView = new ImageView(SchoolApplication.getContext());
                imageView.setImageResource(R.drawable.img3);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                container.addView(imageView);
                mViewPagerImageView.add(imageView);
                return imageView;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(mViewPagerImageView.get(position));

            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }
        });
        mRightListview.setAdapter(new CommonAdapter<Hotel>(SchoolApplication.getContext(), datas, R.layout.aty_index_right_listview_item) {
            @Override
            public void convert(ViewHolder holder, Hotel hotel) {
                holder.setTextViewText(R.id.id_Atyindex_listview_item_tvName, hotel.getName());
                holder.setTextViewText(R.id.id_Atyindex_listview_item_tvdes, hotel.getIntro());
                holder.setImageViewImg(R.id.id_Atyindex_listview_item_img, Instance.VIEWPAGER_IMAGE[0]);
            }
        });

    }

    /**
     * 初始化View
     */
    private void initView() {
        mViewPagerImageView = new ArrayList<>();
        mfoodImg = (ImageView) findViewById(R.id.id_Atyindex_img_food);
        mForumImg = (ImageView) findViewById(R.id.id_Atyindex_img_forum);
        mHotalImg = (ImageView) findViewById(R.id.id_Atyindex_img_hotal);
        mMovieImg = (ImageView) findViewById(R.id.id_Atyindex_img_movies);
        mSceneryImg = (ImageView) findViewById(R.id.id_Atyindex_img_scenery);
        mNearlyImg = (ImageView) findViewById(R.id.id_Atyindex_img_nearly);
        mMeImg = (ImageView) findViewById(R.id.id_Atyindex_img_me);
        mLocationImg = (ImageView) findViewById(R.id.id_Atyindex_img_location);
        mSearchImg = (ImageView) findViewById(R.id.id_Atyindex_img_search);
        mLinearlayoutFood = (LinearLayout) findViewById(R.id.id_Atyindex_Li_food);
        mLinearlayoutForum = (LinearLayout) findViewById(R.id.id_Atyindex_Li_forum);
        mLinearlayoutHotal = (LinearLayout) findViewById(R.id.id_Atyindex_Li_hotal);
        mLinearlayoutScenery = (LinearLayout) findViewById(R.id.id_Atyindex_Li_scenery);
        mLinearlayoutSearch = (LinearLayout) findViewById(R.id.id_Atyindex_Li_search);
        mLinearlayoutNearly = (LinearLayout) findViewById(R.id.id_Atyindex_Li_nearly);
        mLinearlayoutMe = (LinearLayout) findViewById(R.id.id_Atyindex_Li_me);
        mLinearlayoutMovie = (LinearLayout) findViewById(R.id.id_Atyindex_Li_movies);
        mLinearlayoutLocation = (LinearLayout) findViewById(R.id.id_Atyindex_Li_location);
        mRightListview = (ListView) findViewById(R.id.id_Atyindex_listview);
        mViewPager = (ViewPager) findViewById(R.id.id_Atyindex_viewpager);
        mOnTouchLitener = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int x = (int) event.getRawX();
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i("huangjie", "ACTION_DOWN 执行了");
                        params = (LinearLayout.LayoutParams) v.getLayoutParams();
                        firstDownLeftMargin = params.leftMargin;
                        lastX = (x - params.leftMargin);
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i("huangjie", "ACTION_UP执行了");
                        if (v.getId() == R.id.id_Atyindex_img_me
                                || v.getId() == R.id.id_Atyindex_img_search
                                || v.getId() == R.id.id_Atyindex_img_location) {
                            params.leftMargin = firstDownLeftMargin;
                            v.setLayoutParams(params);
                            params = null;
                        } else if (event.getRawX() - lastX > 10) {
                            v.setVisibility(View.INVISIBLE);

                        } else if (event.getRawX() - lastX < 0) {
                            params.leftMargin = firstDownLeftMargin;
                            v.setLayoutParams(params);
                            params = null;
                        }
                        break;
                    case MotionEvent.ACTION_MOVE:
                        LinearLayout.LayoutParams params1 = (LinearLayout.LayoutParams) v.getLayoutParams();
                        params1.leftMargin = x - lastX;
                        v.setLayoutParams(params1);
                        break;
                }
                //跳转到其它activity
              //  enterOtherAty(v);
                return true;
            }
        };
    }

    @Override
    public void showLocationSchool() {

    }

    @Override
    public void enterOtherAty(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.id_Atyindex_img_me:
                intent.setClass(AtyIndex.this, AtyMe.class);
                startActivity(intent);
                break;
            case R.id.id_Atyindex_img_location:

                break;
            case R.id.id_Atyindex_img_search:

                break;
            case R.id.id_Atyindex_img_food:
                intent.setClass(AtyIndex.this, AtyFood.class);
                startActivity(intent);
                break;
            case R.id.id_Atyindex_img_movies:
                intent.setClass(AtyIndex.this, AtyMovies.class);
                startActivity(intent);
                break;
            case R.id.id_Atyindex_img_forum:
                intent.setClass(AtyIndex.this, AtyForum.class);
                startActivity(intent);
                break;
            case R.id.id_Atyindex_img_scenery:
                intent.setClass(AtyIndex.this, AtyScenery.class);
                startActivity(intent);
                break;
            case R.id.id_Atyindex_img_hotal:
                intent.setClass(AtyIndex.this, AtyHotal.class);
                startActivity(intent);
                break;
            case R.id.id_Atyindex_img_nearly:
                intent.setClass(AtyIndex.this, AtyNearly.class);
                startActivity(intent);
                break;

        }
    }


}
