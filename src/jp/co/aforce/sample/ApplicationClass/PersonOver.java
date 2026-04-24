package jp.co.aforce.sample.ApplicationClass;

public class PersonOver {
	private String name;
	private int age;
	
	public PersonOver(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "名前:" + name + " 年齢:" + age;
	}
}
