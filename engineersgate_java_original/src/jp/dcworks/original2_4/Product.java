package jp.dcworks.original2_4;

public class Product {
	// インスタンス変数定義
	private int num1, num2;

	// コンストラクタ
	Product(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// 積の結果を返すメソッド
	public int productResult() {
		return num1 * num2;
	}
}