package jp.co.aforce.sample.abstInter;
//12章：インタフェース
public class Bicycle implements Movable {

	@Override
	public void move() {
		System.out.println("バイク動く");
	}
	
}
