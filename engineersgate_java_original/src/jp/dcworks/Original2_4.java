package jp.dcworks;

public class Original2_4 {
	public static void main (String[] args) {
		Sum_ sum = new Sum_(10, 2);			// インスタンス生成
		System.out.println("和:" + sum.num);	// インスタンス変数出力
		
		Difference_ diffirence = new Difference_(10, 2);	// インスタンス生成
		System.out.println("差:" + diffirence.num);			// インスタンス変数出力
		
		Product_ product = new Product_(10, 2);		// インスタンス生成
		System.out.println("積:" + product.num);		// インスタンス変数出力
		
		Quotient_ quotient = new Quotient_(10, 2);	// インスタンス生成
		System.out.println("商:" + quotient.num);		// インスタンス変数出力
	}
}

class Sum_ {
	// インスタンス変数定義
	int num;
	
	// コンストラクタ
	Sum_(int num1, int num2) {
		num = num1 + num2;	// 引数の和をインスタンス変数に代入
	}
}

class Difference_ {
	// インスタンス変数定義
	int num;
	
	// コンストラクタ
	Difference_(int num1, int num2) {
		num = num1 - num2;	// 引数の差をインスタンス変数に代入
	}
}

class Product_ {
	// インスタンス変数定義
	int num;
	
	// コンストラクタ
	Product_(int num1, int num2) {
		num = num1 * num2;	// 引数の積をインスタンス変数に代入
	}
}

class Quotient_ {
	// インスタンス変数定義
	int num;
	
	// コンストラクタ
	Quotient_(int num1, int num2) {
		num = num1 / num2;	// 引数の商をインスタンス変数に代入
	}
}