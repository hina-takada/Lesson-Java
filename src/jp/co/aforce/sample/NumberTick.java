package jp.co.aforce.sample;

import java.util.Scanner;

public class NumberTick {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("年齢を入力してください");
		int age = scanner.nextInt();
		
		if(age < 0 || age > 200) {
			System.out.println("0～200までの数字を入力してください。");
		}else if(age <= 3) {
			System.out.println("無料");
		}else if(age >= 4 && age <= 12) {
			System.out.println("500円");
		}else if(age >= 13 && age <= 17) {
			System.out.println("800円");
		}else if(age >= 18 && age <= 59) {
			System.out.println("1200円");
		}else {
			System.out.println("700円");
		}
		
		
		
	}

}
