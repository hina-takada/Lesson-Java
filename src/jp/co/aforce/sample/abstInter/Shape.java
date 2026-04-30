package jp.co.aforce.sample.abstInter;

public class Shape {
	private int height;
	private int width;
	
	public Shape(int height,int width) {
		this.height = height;
		this.width = width;
	}
	
	void calculateArea() {};
	void calculatePerimeter() {}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	};
	
	
}
