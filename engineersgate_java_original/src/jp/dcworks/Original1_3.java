package jp.dcworks;

public class Original1_3 {
	public static void main (String[] args) {
		// 二重ループ
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				// iとjの積を出力
				System.out.print(i * j + " ");
			}
			// 段ごとに改行
			System.out.println();
		}
	}
}
