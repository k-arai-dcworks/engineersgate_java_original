package jp.dcworks;

public class Original1_4 {
	public static void main (String[] args) {
		// 配列宣言
		int[] arr = new int[100];
		
		// 1-100までの数値を代入
		for (int i = 0; i < 100; i++) {
			arr[i] = i + 1;
			
			// 偶数のみ表示
			if(arr[i] %2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
