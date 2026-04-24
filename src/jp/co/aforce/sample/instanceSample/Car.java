package jp.co.aforce.sample.instanceSample;

public class Car {
	private String model;//車種
	private int speed;//速度
	
	public Car(String model,int speed) {
		this.model = model;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public int getSpeed() {
		return speed;
	}
	
	void car() {
		System.out.println(String.format("車種:%-20s  速度:%5d", model,speed));
	}
}
