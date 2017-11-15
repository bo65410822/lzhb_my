/**
 * 化妆品类
 * @author Lizhanbo
 *
 */
public class Cosmetic {
	private String name;//品牌
	private String type;//国产或者进口
	private int price;//单价
	
	public Cosmetic() {}
	
	public Cosmetic(String name, String type, int price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cosmetic [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
}
