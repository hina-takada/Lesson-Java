package jp.co.aforce.sample.ApplicationClass;
//10章：静的メソッド
public class Counter {
	static int count;
	
	void add() {
		System.out.println(count++);
	}
}
