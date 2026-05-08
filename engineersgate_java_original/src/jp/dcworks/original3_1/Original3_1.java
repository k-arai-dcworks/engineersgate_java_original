package jp.dcworks.original3_1;

public class Original3_1 {
	public static void main(String[] args) {
		// インスタンス化
		Shape[] shapes = {
				new Rectangle(3, 10),
				new Circle(3),
				new Triangle(3)
		};
		
		// 出力
		for (Shape shape : shapes) {
			System.out.println("面積：" + shape.area());
			System.out.println("周囲長：" + shape.perimeter());
		}
	}
}
