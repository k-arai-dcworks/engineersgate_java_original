package jp.dcworks.original2_4;

public class Difference {
	// インスタンス変数定義
	private int num1, num2;

	// コンストラクタ
	Difference(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// 差の結果を返すメソッド
	public int differenceResult() {
		return num1 - num2;
	}
}
