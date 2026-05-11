package jp.dcworks.original3_1;

//円
class Circle implements Shape {
	private double radius;

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
