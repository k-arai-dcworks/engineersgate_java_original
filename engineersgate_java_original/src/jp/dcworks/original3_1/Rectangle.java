package jp.dcworks.original3_1;

//長方形
class Rectangle implements Shape {
	private double base, height;

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
