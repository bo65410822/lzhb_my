import java.util.Arrays;
/**
 * 化妆品管理类
 * @author Lizhanbo
 *
 */
public class CosmeticManager {
	
	protected Cosmetic []  cs = new Cosmetic[4];
    protected int count = 0;
	/**
	 * 进货功能
	 * @param c 
	 */
	public void add(Cosmetic c) {
		int size = cs.length;
		if (count>=size) {
			int newlen = size * 2;
			cs = Arrays.copyOf(cs, newlen);
		}
		cs[count] = c;
		count++;
	}
	
	/**
	 * 输出所有产品的信息
	 */
	public void printInfo() {
		for(Cosmetic c : cs) {
			System.out.println(c.toString());
		}
	}
}
