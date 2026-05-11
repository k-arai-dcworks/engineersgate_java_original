package jp.dcworks.original2_3;

public class Original2_3 {
	public static void main (String[] args) {
		// それぞれのクラスの関数を利用して出力
		System.out.println("和：" + Sum.sumResult(10, 2));
		System.out.println("差：" + Difference.differenceResult(10, 2));
		System.out.println("積：" + Product.productResult(10, 2));
		System.out.println("商：" + Quotient.quotientResult(10, 0));
	}
}