package jp.dcworks;

// Map利用のためにインポート
import java.util.HashMap;
import java.util.Map;

public class Original1_5 {
	public static void main (String[] args) {
		// HashMapを定義
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "りんご");
		map.put(2, "いちご");
		map.put(3, "みかん");
		map.put(4, "バナナ");
		map.put(5, "メロン");
		
		// 1行で全体出力する場合
		// System.out.println(map);
		
		// エントリー（キーと値）を出力
		for(Integer key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
