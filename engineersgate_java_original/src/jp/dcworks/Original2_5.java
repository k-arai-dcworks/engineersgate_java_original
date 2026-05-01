package jp.dcworks;

public class Original2_5 {
	// 2点の座標を設定
	static Point p1 = new Point(2, 9);
	static Point p2 = new Point(-3, 18);
	
	public static void main (String[] args) {
		System.out.println(difference());
	}
	
	// 座標の距離計算
	static double difference() {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	}
}

class Point {
	int x, y;
	
	// コンストラクタ
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}