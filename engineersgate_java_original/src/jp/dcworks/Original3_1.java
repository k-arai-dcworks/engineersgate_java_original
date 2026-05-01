package jp.dcworks;

public class Original3_1 {
	public static void main (String[] args) {
		// インスタンス化
		Rectangle r = new Rectangle(3, 10);
		Circle c = new Circle(3);
		Triangle t = new Triangle(3);
		
		// 出力
		System.out.println("面積:" + r.area() + "/周囲長:" + r.perimeter());
		System.out.println("面積:" + c.area() + "/周囲長:" + c.perimeter());
		System.out.println("面積:" + t.area() + "/周囲長:" + t.perimeter());
	}
}

// 長方形
class Rectangle implements Shape {
	double base, height;
	
	// コンストラクタ
	Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double area() {
		return base * height;
	}

	@Override
	public double perimeter() {
		return base * 2 + height * 2;
	}
}

//円
class Circle implements Shape {
	double radius;
	
	// コンストラクタ
	Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return radius * radius * Math.PI;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
}

//正三角形
class Triangle implements Shape {
	double side;
	
	// コンストラクタ
	Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		// 正三角形の面積公式:(√3 / 4) * a^2
		return (Math.sqrt(3) / 4) * (side * side);
	}

	@Override
	public double perimeter() {
		return side * 3;
	}
}

// インターフェイス
interface Shape {
	double area();		// 面積を返す
	double perimeter();	// 周囲長を返す
}
