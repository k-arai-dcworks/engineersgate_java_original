package jp.dcworks;

public class Original2_2 {
	public static void main (String[] args) {
		// Sumで返された値を出力
		System.out.println("和：" + Sum(10, 2));
		
		// Sumで返された値を出力
		System.out.println("差：" + Difference(10, 2));
		
		// Sumで返された値を出力
		System.out.println("積：" + Product(10, 2));
		
		// Sumで返された値を出力
		System.out.println("商：" + Quotient(10, 2));
	}
	
	// 引数同士の和を返す関数
	public static int Sum(int num1, int num2) {
		return num1 + num2;
	}
	
	// 差
	public static int Difference(int num1, int num2) {
		return num1 - num2;
	}
	
	// 積
	public static int Product(int num1, int num2) {
		return num1 * num2;
	}
	
	// 商
	public static int Quotient(int num1, int num2) {
		return num1 / num2;
	}
}