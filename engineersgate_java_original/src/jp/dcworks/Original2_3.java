package jp.dcworks;

public class Original2_3 {
	public static void main (String[] args) {
		// それぞれのクラスの関数を利用して出力
		System.out.println(Sum.sum(10, 2));
		System.out.println(Difference.difference(10, 2));
		System.out.println(Product.product(10, 2));
		System.out.println(Quotient.quotient(10, 2));
	}
}

class Sum {
	// 引数同士の和を返す関数
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class Difference {
	// 差
	public static int difference(int num1, int num2) {
		return num1 - num2;
	}
}

class Product {
	// 積
	public static int product(int num1, int num2) {
		return num1 * num2;
	}
}

class Quotient {
	// 商
	public static int quotient(int num1, int num2) {
		return num1 / num2;
	}
}