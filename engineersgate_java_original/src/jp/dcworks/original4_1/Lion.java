package jp.dcworks.original4_1;

//Lionサブクラス
class Lion extends Animal {
	
	public Lion(String name) {
		super(name);	// スーパークラスのコンストラクタを呼び出し
	}
	
	@Override
	public void sound() {
		System.out.println(name + ":ガオー");	// スーパークラスのnameを参照
	}
}
