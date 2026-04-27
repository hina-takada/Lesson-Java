package jp.co.aforce.sample.ApplicationClass;

public class Circle implements Shape {

	int circle = 20;
	@Override
	public void calc() {
		double circumference = circle * Math.PI; 
		System.out.println((int)circumference);
	}
	
}
