package jp.dcworks;

public class Original2_5 {
	// 2点の座標を設定
	static Point p1 = new Point(2, 9);
	static Point p2 = new Point(-3, 18);
	
	public static void main (String[] args) {
		System.out.println(p1.distance(p2));
	}
}

class Point {
	int x, y;
	
	// コンストラクタ
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 座標の距離計算
	public double distance(Point other) {
        return Math.sqrt(
            (this.x - other.x) * (this.x - other.x) +
            (this.y - other.y) * (this.y - other.y)
        );
    }
}