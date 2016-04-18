package cdtu.com.school.view;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cdtu.com.school.R;
import cdtu.com.school.model.bean.Hotel;
import cdtu.com.school.model.biz.AtyIndexBizImp;
import cdtu.com.school.model.instance.Instance;
import cdtu.com.school.model.utils.CommonAdapter;
import cdtu.com.school.model.utils.SchoolApplication;
import cdtu.com.school.model.utils.ViewHolder;

/**
 * Created by huangjie on 2016/4/12.
 */
public class AtyIndex extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_index);
        testData();
        initView();
        initevent();


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
                imageView.setImageResource(R.drawable.img6);
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
     * 初始化V
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
            public boolean onTouch(final View v, MotionEvent event) {
                TranslateAnimation animation = new TranslateAnimation(0, 200, 0, 0);
                animation.setDuration(200);

                if (((v.getId() != R.id.id_Atyindex_img_me)
                        && (v.getId() != R.id.id_Atyindex_img_search)
                        && (v.getId() != R.id.id_Atyindex_img_location))) {
                    animation.setFillAfter(true);
                }
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        lastX = (int) event.getRawX();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.i("huangjie", v.getId() + "");

                        if (event.getRawX() - lastX > 8) {
                            v.startAnimation(animation);
                            lastX = 0;
                        }
                        animation.setAnimationListener(new Animation.AnimationListener() {
                            @Override
                            public void onAnimationStart(Animation animation) {

                            }

                            @Override
                            public void onAnimationEnd(Animation animation) {
                                if (((v.getId() != R.id.id_Atyindex_img_me)
                                        && (v.getId() != R.id.id_Atyindex_img_search)
                                        && (v.getId() != R.id.id_Atyindex_img_location))) {
                                    v.setVisibility(View.INVISIBLE);
                                }

                            }

                            @Override
                            public void onAnimationRepeat(Animation animation) {

                            }
                        });
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return true;
            }
        };

    }
}
