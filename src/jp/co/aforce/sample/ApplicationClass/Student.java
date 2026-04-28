package jp.co.aforce.sample.ApplicationClass;
//10章：静的メソッド(問題2)
public class Student {
	static String schoolName = "ABC学校";
	String name;
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
}
