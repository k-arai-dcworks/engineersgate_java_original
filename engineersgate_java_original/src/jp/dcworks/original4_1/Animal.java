package jp.dcworks.original4_1;

class Animal {
	protected String name;
	
	// コンストラクタ
	Animal(String name) {
		this.name = name;	// クラス変数nameに引数のnameを代入
	}
	
	// 鳴き声メソッド
	public void sound() {
		System.out.println("鳴き声設定なし");
	}
}
