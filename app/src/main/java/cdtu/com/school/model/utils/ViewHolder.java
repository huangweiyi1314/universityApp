package cdtu.com.school.model.utils;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by huangjie on 2016/4/12.
 */
public class ViewHolder {
    private SparseArray<View> mViews;//存储所有的view
    private View mConvertView;
    private int mPosition;

    public ViewHolder(Context context, ViewGroup parent, int LayoutID, int position) {
        this.mViews = mViews;
        mViews = new SparseArray<>();
        mConvertView = LayoutInflater.from(context).inflate(LayoutID, parent, false);
        mConvertView.setTag(this);

    }

    /**
     * 入口方法使用ViewHolder首先调用此方法
     * @param context
     * @param convertView
     * @param LayoutID
     * @param position
     * @param parent
     * @return
     */
    public static  ViewHolder getInstance(Context context,View convertView,int LayoutID,int position,ViewGroup parent ){
              if (convertView==null){
                  return  new ViewHolder(context,parent,LayoutID,position);
              }else{
                  ViewHolder holder = (ViewHolder) convertView.getTag();
                  holder.mPosition = position;
                  return  holder;
              }
    }

    /**
     * 根据id来查找控件，如果没有，那么添加到viewholder中去
     * @param viewID
     * @param <T>
     * @return
     */
      public <T extends View> T getView(int viewID){
          View view = mViews.get(viewID);
          if (view==null){
              view = mConvertView.findViewById(viewID);
              mViews.put(viewID,view);

          }
          return (T) view;
      }

}
