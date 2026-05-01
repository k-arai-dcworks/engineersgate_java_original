package jp.dcworks;

public class Original4_1 {
	public static void main (String[] args) {
		// インスタンス化
		Dog dog = new Dog("イヌ");
		Cat cat = new Cat("ネコ");
		Lion lion = new Lion("ライオン");
		
		// サウンドメソッド呼び出す
		dog.sound();
		cat.sound();
		lion.sound();
	}
}

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

// Dogサブクラス
class Dog extends Animal {
	
	public Dog(String name) {
		super(name);	// スーパークラスのコンストラクタを呼び出し
	}
	
	@Override
	public void sound() {
		System.out.println(super.name + ":ワン");	// スーパークラスのnameを参照
	}
}

// Catサブクラス
class Cat extends Animal {
	
	public Cat(String name) {
		super(name);	// スーパークラスのコンストラクタを呼び出し
	}
	@Override
	public void sound() {
		System.out.println(super.name + ":ニャー");	// スーパークラスのnameを参照
	}
}

// Lionサブクラス
class Lion extends Animal {
	
	public Lion(String name) {
		super(name);	// スーパークラスのコンストラクタを呼び出し
	}
	
	@Override
	public void sound() {
		System.out.println(super.name + ":ガオー");	// スーパークラスのnameを参照
	}
}