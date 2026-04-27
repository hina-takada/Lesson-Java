package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest5 {

	public static void main(String[] args) {
		//問題１
		Random rd = new Random();
		int fortune = rd.nextInt();
		System.out.println(fortune);
		
		switch (fortune) {
		case 1:
			System.out.println("吉");
			break;
			
		case 2:
			System.out.println("中吉");
			break;
			
		case 3:
			System.out.println("大吉");
			break;
			
		default:
			System.out.println("凶");
			break;
		}
		
		//問題２
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
				System.out.print(i + ",");
			}
		}
		
		System.out.println();
		
		//問題3
		for(int i = 1; i < 10; i++) {
			System.out.println();
			for(int j = 1 ; j < 10; j++) {
				System.out.print(i * j + " ");
			}
		}
		
		System.out.println();
		
		//問題4
		int num = 10;
		for(int i = 1 ; i < 10 ;i++) {
			System.out.println(num);
		}
		
	}

}
