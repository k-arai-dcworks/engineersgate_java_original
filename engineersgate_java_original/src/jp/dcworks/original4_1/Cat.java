package jp.dcworks.original4_1;

//Catサブクラス
class Cat extends Animal {
	
	public Cat(String name) {
		super(name);	// スーパークラスのコンストラクタを呼び出し
	}
	@Override
	public void sound() {
		System.out.println(name + ":ニャー");	// スーパークラスのnameを参照
	}
}
