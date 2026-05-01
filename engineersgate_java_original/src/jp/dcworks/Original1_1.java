package jp.dcworks;

public class Original1_1 {
	public static void main (String[] args) {
		// 変数宣言
		String str1 = "aaa";
		String str2 = "bbb";
		System.out.println("1: " + str1 + " ,2: " + str2);
		
		// 反転処理
		String str3 = str1;
		str1 = str2;
		str2 = str3;
		System.out.println("1: " + str1 + " ,2: " + str2);
	}
}
