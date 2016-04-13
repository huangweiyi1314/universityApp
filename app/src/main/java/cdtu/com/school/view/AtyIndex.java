package cdtu.com.school.view;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import cdtu.com.school.R;

/**
 * Created by huangjie on 2016/4/12.
 */
public class AtyIndex extends AppCompatActivity implements Animation.AnimationListener {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_index);
        initView();
        initevent();
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


    }

    /**
     * 初始化V
     */
    private void initView() {
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

        mOnTouchLitener = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int lastX = 0;
                int lastY = 0;
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        lastX = (int) event.getRawX();
                        lastY = (int) event.getRawY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        TranslateAnimation animation = new TranslateAnimation(0, 200, 0, 0);
                        animation.setDuration(200);
                        animation.setFillAfter(true);
                        if (event.getRawX() - lastX > 0) {
                            v.startAnimation(animation);
                        }
                        animation.setAnimationListener(AtyIndex.this);
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return true;
            }
        };
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
