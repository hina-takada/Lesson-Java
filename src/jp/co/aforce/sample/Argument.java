package jp.co.aforce.sample;

public class Argument {

	void greet(String name) {
		//引数・戻り値
		System.out.println("こんにちは" + name + "さん");
	}

	int add(int a, int b) {
		return a + b;
	}

	boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}

		return false;
	}

	public static String repeat(String word, int times) {
		String words = "";
		for(int i = 0; i < times; i++) {
			 words += word;
		}
		return words;
		
	}

	double calcArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	
}
