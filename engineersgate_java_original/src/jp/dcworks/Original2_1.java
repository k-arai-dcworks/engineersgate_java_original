package jp.dcworks;

public class Original2_1 {
	public static void main (String[] args) {
		int result = sum(10, 2);
		System.out.print(result);	// sumで返された値を出力
	}
	
	// 引数同士の和を返す関数
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
}