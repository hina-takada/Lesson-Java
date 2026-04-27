package jp.co.aforce.sample;
//研修基礎⑦　コンストラクター
public class Person {
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("名前は" + name + "です。年齢は、" + age + "です。");
	}
}
