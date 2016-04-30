package cdtu.com.school.presenter;

import android.widget.ListView;

import cdtu.com.school.model.biz.AtyIndexBizImp;
import cdtu.com.school.model.biz.IAtyIndexBiz;
import cdtu.com.school.view.IAtyIndex;

/**
 * Created by huangjie on 2016/4/14.
 */
public class AtyIndexPresenter {
    private IAtyIndexBiz atyIndexBiz;
    private IAtyIndex atyIndex;
      AtyIndexPresenter(IAtyIndex AtyIndex){
        this.atyIndex = atyIndex;
          atyIndexBiz = new AtyIndexBizImp();
      }
    public void replaceAdapter(){

    }

}
