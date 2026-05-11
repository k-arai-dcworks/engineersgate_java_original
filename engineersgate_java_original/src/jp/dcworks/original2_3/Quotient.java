package jp.dcworks.original2_3;

public class Quotient {
	// 商
	public static Integer quotientResult(int num1, int num2) {
		if(num2 == 0) {
			return null;
		} else {
			return num1 / num2;
		}
	}
}
