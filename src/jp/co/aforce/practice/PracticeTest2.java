package jp.co.aforce.practice;

public class PracticeTest2 {

	public static void main(String[] args) {
		//問題1
		final double TAX = 1.1;
		System.out.println("消費税率：" + TAX);
		
		//問題2
		int x = 480;
		double price = x * TAX;
		System.out.println("税込み：" + price + "円");
		
		//問題3
		String name = "高田";
		System.out.println(name);
		
		//問題4
		String stPrice = "この商品の値段は、";
		String yen = "円です。";
		System.out.println(stPrice + (int)price + yen);
		
		//問題5
		
		
	}

}
