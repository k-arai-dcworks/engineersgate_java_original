package jp.dcworks.original4_1;

public class Original4_1 {
	public static void main(String[] args) {
		// 配列で一括インスタンス化
		Animal[] animals = {
				new Dog("イヌ"),
				new Cat("ネコ"),
				new Lion("ライオン")
		};

		for (Animal animal : animals) {
			animal.sound();
		}
	}
}