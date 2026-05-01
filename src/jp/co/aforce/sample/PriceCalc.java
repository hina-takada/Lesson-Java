package jp.co.aforce.sample;

import java.util.Scanner;

public class PriceCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("商品の単価を入力してください。");
		int price = scanner.nextInt();
		System.out.println("購入個数を入力してください。");
		int num = scanner.nextInt();
		//割引前の合計金額
		int beforTotal = price * num;

		//割引後の価格
		int total = waribiki(num,beforTotal);
		//税込み価格
		int zekomiPrice = total + ((total * 10) / 100);

		System.out.println("商品単価：" + price);
		System.out.println("購入個数：" + num);
		System.out.println("割引前の合計金額：" + beforTotal);
		System.out.println("割引額：" + waribiki(num, beforTotal) );
		System.out.println("割引後の価格：" + total);
		System.out.println("消費税額：10%");
		System.out.println("税込み価格：" + zekomiPrice);

	}
	
	static int waribiki(int num, int total) {
		//購入金割引：
		if (total >= 5000) {
			total = (total * 5 )/ 100;
		}
		if (total >= 10000) {
			total =(total * 5 ) / 100;
		}
		
		//購入個数割引：
		if (num >= 3) {
			 total -= 50;
		} else if (num >= 5) {
			total -= 100;
		}
		
		return total;
	}
	

}
