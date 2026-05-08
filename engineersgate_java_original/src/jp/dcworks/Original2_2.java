package jp.dcworks;

public class Original2_2 {
	public static void main(String[] args) {
		// sumで返された値を出力
		System.out.println("和：" + sum(10, 2));

		// differenceで返された値を出力
		System.out.println("差：" + difference(10, 2));

		// productで返された値を出力
		System.out.println("積：" + product(10, 2));

		// quotientで返された値を出力
		System.out.println("商：" + quotient(10, 2));
	}

	// 引数同士の和を返す関数
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	// 差
	public static int difference(int num1, int num2) {
		return num1 - num2;
	}

	// 積
	public static int product(int num1, int num2) {
		return num1 * num2;
	}

	// 商
	public static Integer quotient(Integer num1, Integer num2) {
		if(num2 == 0) {
			return null;
		} else {
			return num1 / num2;
		}
	}
}