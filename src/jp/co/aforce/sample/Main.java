package jp.co.aforce.sample;

public class Main {

	public static void main(String[] args) {
		/*基礎⑦　静的フィールド*/
		Player p1 = new Player();
		Player p2 = new Player();
		
		/*Player p1 = new Player(100);
		Player p2 = new Player(100);*/
		
		System.out.println("初期状態:");
		System.out.println("p1.hp = " + p1.hp1);//hp.p1
		System.out.println("p2.hp = " + p2.hp2);
		
		//p1がダメージを受ける
		
		p1.hp1 -= 30;
		/*hp.p1 -= 30;*/
		
		System.out.println("\nダメージ後:");
		System.out.println("p1.hp = " + p1.hp1);
		System.out.println("p2.hp = " + p2.hp2);
		
		/*インスタンス
		 * Taiyaki taiyaki1 = new Taiyaki();
		taiyaki1.setFilling("クリーム");
		taiyaki1.showFilleing();
		
		Taiyaki taiyaki2 = new Taiyaki();
		taiyaki2.setFilling("あんこ");
		taiyaki2.showFilleing();*/
		
		
		

	}

}
