package jp.co.aforce.sample.abstInter;

public class Circle implements MathConstants , ShapeInter{

	@Override
	public void calculateArea() {
		 System.out.println(Math.PI * Math.pow(3, 2));
	}
//	double calculateArea(int a){
//		return PI * Math.pow(a, 2);
//	}
	
	
}
