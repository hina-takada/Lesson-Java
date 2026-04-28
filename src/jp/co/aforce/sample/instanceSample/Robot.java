package jp.co.aforce.sample.instanceSample;

public class Robot {
	private String name;
	
	public Robot(String name) {
		this.name = name;
	}
	
	void move() {
		System.out.println(name + "が動きました。");
	}
}
