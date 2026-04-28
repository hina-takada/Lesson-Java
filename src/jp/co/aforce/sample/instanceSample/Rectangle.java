package jp.co.aforce.sample.instanceSample;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int hegiht) {
		this.width = width;
		this.height = hegiht;
	}
	
	int area() {
		return height * width;
	}
}
