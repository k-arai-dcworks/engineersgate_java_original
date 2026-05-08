package jp.dcworks.original2_4;

public class Quotient {
	// インスタンス変数定義
	private Integer num1, num2;

	// コンストラクタ
	Quotient(int num1, int num2) {
			this.num1 = num1;
			this.num2 = num2;
		}

	// 商の結果を返すメソッド
	public Integer quotientResult() {
		if(num2 == 0) {
			return null;
		} else {
			return num1 / num2;
		}
	}
}
