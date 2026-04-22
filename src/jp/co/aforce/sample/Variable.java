package jp.co.aforce.sample;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		//研修演習 第3章：変数
		Scanner scanner = new Scanner(System.in);
		
		/* 7*/
		System.out.println("入力してください");
		System.out.println("商品名");
		String product = scanner.next();
		System.out.println("価格");
		int price = scanner.nextInt();
		System.out.println("購買個数");
		int count = scanner.nextInt();
		
		int total = price * count;
		System.out.println(String.format("商品：%sは、価格:%d円なので、%d個買うと%d円です。", product ,price,count,total));
		
		
		/*６
		 * System.out.println("名前");
		String name = scanner.next();
		System.out.println("年齢");
		int age = scanner.nextInt();
		System.out.println("誕生日を-区切りで入力してください");
		String brithday = scanner.next();
		
		String i = String.format("名前:%s 年齢:%d 誕生日:%s", name,age,brithday);
		System.out.println(i);*/
		
		/*5
		 * System.out.println("名前を入力してください");
		String name = scanner.next();
		System.out.println("こんにちは、" + name + "さん！");*/
		
		
		/* 4
		 * String name = "Java";
		double version = 17.0;
		boolean isFun = true;*/
		
		
		/*3
		 * int width = 7;
		int height = 4;
		int area = width * height;
		System.out.println(area);*/
		
		
		/* 2
		 * int a = 8;
		int b = 5;
		int sum = a + b;
		System.out.println(sum);*/
		
		
		/* 1
		 * int num = 10;
		System.out.println(num);*/

	}

}
