package jp.dcworks.original3_1;

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
