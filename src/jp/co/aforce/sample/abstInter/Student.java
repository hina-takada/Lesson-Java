package jp.co.aforce.sample.abstInter;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}
	
	@Override
	void introduce() {
		System.out.println("はじめまして、" + getName() + "です");
	}
	
}
