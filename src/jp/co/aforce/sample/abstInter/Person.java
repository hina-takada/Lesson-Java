package jp.co.aforce.sample.abstInter;

public abstract class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	void introduce(){}

	public String getName() {
		return name;
	};
	
	
}
