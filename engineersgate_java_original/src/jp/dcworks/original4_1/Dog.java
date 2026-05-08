package jp.dcworks.original4_1;

//Dogサブクラス
class Dog extends Animal {
	
	public Dog(String name) {
		super(name);	// スーパークラスのコンストラクタを呼び出し
	}
	
	@Override
	public void sound() {
		System.out.println(name + ":ワン");	// スーパークラスのnameを参照
	}
}
