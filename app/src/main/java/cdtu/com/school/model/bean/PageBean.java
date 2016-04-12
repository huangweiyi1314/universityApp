package cdtu.com.school.model.bean;

/**
 * Created by huangjie on 2016/4/12.
 *  当前页所有的记录
 */

import java.util.List;

/**
 * 当前页所有的记录
 * @param <T>
 */
public class PageBean<T> {
    private int pc;//当前页码page code
    //private int tp;//总页数total page
    private int tr;//总记录数total record
    private int ps;//每页总记录数page size
    private List<T> beanList;//当前页的记录
    private String url;//它就是url后的条件

    /**
     * 它就是url后的条件
     * @return
     */
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    /**
     * 当前页码page code
     * @return
     */
    public int getPc() {
        return pc;
    }
    public void setPc(int pc) {
        this.pc = pc;
    }

    /**
     * 计算总页数:总页数total page
     */
    public int getTp() {
        int tp = tr / ps;//通过总记录数和每页记录数来计算总页数
        return tr % ps ==0?tp : tp +1 ;//余数不为零则需再添加一页
    }

//	public void setTp(int tp) {
//		this.tp = tp;
//	}

    /**
     * 总记录数total record
     * @return
     */
    public int getTr() {
        return tr;
    }

    /**
     * 总记录数total record
     */
    public void setTr(int tr) {
        this.tr = tr;
    }
    /**
     * 每页总记录数page size
     * @return
     */
    public int getPs() {
        return ps;
    }
    public void setPs(int ps) {
        this.ps = ps;
    }
    /**
     * 当前页的记录
     * @return
     */
    public List<T> getBeanList() {
        return beanList;
    }
    public void setBeanList(List<T> beanList) {
        this.beanList = beanList;
    }

}

