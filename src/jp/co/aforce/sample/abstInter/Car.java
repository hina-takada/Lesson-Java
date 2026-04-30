package jp.co.aforce.sample.abstInter;
//第12章：抽象クラス（Vehicle）
//(インタフェースにも使用)
public class Car implements Movable /*extends Vehicle*/{
	@Override
	public void move() {
		System.out.println("車が動く");
	}
	
	/*@Override
	void move() {
		System.out.println("車が動く");
	}*/
	
	
	
}
