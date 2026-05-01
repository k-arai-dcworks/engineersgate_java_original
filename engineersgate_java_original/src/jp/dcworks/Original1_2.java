package jp.dcworks;

public class Original1_2 {
	public static void main (String[] args) {
		// 配列宣言
		int[] arr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = new int[arr1.length];	// 配列の大きさをarr1と同じに
		
		// 反転処理
		for(int i : arr1) {
			// arr1の一番後ろの要素から順番に代入
			arr2[i] = arr1[(arr1.length - 1) - i];
			
			System.out.print(arr2[i] + " ");
		}
	}
}
