package jp.dcworks.original2_4;

public class Original2_4 {
	public static void main(String[] args) {
		Sum sum = new Sum(10, 2); // インスタンス生成
		System.out.println("和:" + sum.sumResult()); // 出力

		Difference dif = new Difference(10, 2); // インスタンス生成
		System.out.println("差:" + dif.differenceResult()); // 出力

		Product pro = new Product(10, 2); // インスタンス生成
		System.out.println("積:" + pro.productResult()); // 出力

		Quotient quo = new Quotient(10, 0); // インスタンス生成
		System.out.println("商:" + quo.quotientResult()); // 出力
	}
}