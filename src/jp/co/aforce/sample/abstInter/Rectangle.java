package jp.co.aforce.sample.abstInter;

public class Rectangle extends Shape implements ShapeInter{
	
	public Rectangle(int height, int width) {
		super(height, width);
	}

	/*@Override
	void calculateArea() {
		System.out.println(getHeight() + getWidth());
	}*/
	
	@Override
	void calculatePerimeter() {
		System.out.println((getHeight() + getWidth()) * 2);
	}

	@Override
	public void calculateArea() {
		System.out.println(getHeight() + getWidth());
	}
}
