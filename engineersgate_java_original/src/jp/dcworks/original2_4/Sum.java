package jp.dcworks.original2_4;

public class Sum {
	// インスタンス変数定義
	private int num1, num2;

	// コンストラクタ
	Sum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// 和の結果を返すメソッド
	public int sumResult() {
		return num1 + num2;
	}
}
