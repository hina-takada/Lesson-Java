package jp.co.aforce.sample.ClassSample;

public class Circle {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	
	void area() {
		double diameter = Math.PI * Math.pow(radius, 2);
		System.out.println(String.format("面積は,%d㎠",(int)diameter));
	}
}
