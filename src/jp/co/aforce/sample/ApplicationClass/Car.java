package jp.co.aforce.sample.ApplicationClass;

public class Car {
	private String name;
	
	public Car() {
		this.name = "Unkown";
	}
	
	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
