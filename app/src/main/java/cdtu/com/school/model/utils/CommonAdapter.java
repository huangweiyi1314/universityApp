package cdtu.com.school.model.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.io.PipedOutputStream;
import java.util.List;

/**
 * Created by huangjie on 2016/4/12.
 */
public  abstract class CommonAdapter<T> extends BaseAdapter {
    private Context mcontext;
    private LayoutInflater mInflater;
    private List<T> mDatas;
    private int mLayoutID;//布局文件的ID

    public CommonAdapter(Context mcontext,List<T> mDatas,int LayoutId) {
        this.mcontext = mcontext;
        mInflater = LayoutInflater.from(mcontext);
        this.mDatas = mDatas;
        this.mLayoutID = LayoutId;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      ViewHolder holder = ViewHolder.getInstance(mcontext, convertView, mLayoutID, position, parent);

        convert(holder,getItem(position));

        return holder.getConvertView();
    }

    /**
     * 给每个item中的View赋值
     * @param holder
     * @param t
     */
    public abstract  void convert(ViewHolder holder,T t);
}
