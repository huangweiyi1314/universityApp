package cdtu.com.school.model.bean;

/**
 * 景点类
 */
import java.util.List;

public class Scenery {
	private String id;
	private String name;
	private String imgs;
	private double price;
	private String tel;
	private String intro;//简介
	private String address;
	private List<SceneryComment> comments;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public List<SceneryComment> getComments() {
		return comments;
	}
	public void setComments(List<SceneryComment> comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Scenery [id=" + id + ", name=" + name + ", imgs=" + imgs
				+ ", price=" + price + ", tel=" + tel + ", intro=" + intro
				+ "]";
	}
}
