/**
 * 测试类
 * @author Lizhanbo
 *
 */
public class Test {
	public static void main(String[] args) {
		SortCosmeticManager cm = new SortCosmeticManager();
		cm.add(new Cosmetic("香奈儿","进口",1000));
		cm.add(new Cosmetic("圣罗兰","进口",800));
		cm.add(new Cosmetic("大宝","国产",20));
		cm.add(new Cosmetic("万紫千红","国产",15));
		cm.printInfo();
	}
}
