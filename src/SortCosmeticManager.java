import java.util.Arrays;

/**
 * 按单价排序的管理类
 * 
 * @author Lizhanbo
 *
 */
public class SortCosmeticManager extends CosmeticManager {

	@Override
	public void printInfo() {
		Cosmetic c = null;
		Cosmetic[] temp = Arrays.copyOf(cs, count);
		System.out.println(temp.length);
		for (int i = 0; i < temp.length - 1; i++) {
			for (int j = 0; j < temp.length - i - 1; j++) {
				if (temp[j].getPrice() > temp[j + 1].getPrice()) {
					c = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = c;
				}
			}
		}
		for (Cosmetic cmc : temp) {
			System.out.println(cmc.toString());
		}
	}
}
