package jp.co.aforce.sample;

import java.util.Scanner;

public class IfExercises {

	public static void main(String[] args) {
		//演習課題(第7章)
		Scanner sc = new Scanner(System.in);
		/***************
		 ******if文*****
		 ***************/
		/*４*/
		int age = sc.nextInt();
		if(age < 0) {
			System.out.println("0以上の数字を入力してください");
		}else if(age <= 12) {
			System.out.println("無料");
		}else if(age >= 13 && age <= 59) {
			System.out.println("1000円");
		}else {
			System.out.println("500円");
		}
		
		
		/*３(?)
		 * int[] numbers = new int[3];
		for(int i = 0; i < numbers.length;i++) {
			numbers[i] = sc.nextInt();
			
			if(!(numbers[i] <= 0)) {
				System.out.println("この長さは有効");
			}else {
				System.out.println("この長さでは三角形は無理です");
			}
		}*/
		
		
		
		/*２
		 * int number = sc.nextInt();
		if(number < 0) {
			System.out.println("負の数");
		}else if(number == 0){
			System.out.println("どちらでもない");
		}else {
			System.out.println("正の数");
		}*/
		
		/*１
		 * int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}*/
		
		
		/***************
		 *****switch****
		 ***************/
		
		String score = sc.next();
		final String evaluation = "評価：";
		switch (score) {
			case "A":
				System.out.println(evaluation + "A");
				break;
				
			case "B":
				System.out.println(evaluation + "B");
				break;
				
			case "C":
				System.out.println(evaluation + "C");
				break;
				
			case "D":
				System.out.println(evaluation + "D");
				break;
				
			case "F":
				System.out.println(evaluation + "F");
				break;
				
			default:
				System.out.println("A～Fを入力してください");
				break;
		}
		
		/*２
		 * int months = sc.nextInt();
		switch (months) {
				case 1:
					System.out.println("1月");
					break;
					
				case 2:
					System.out.println("2月");
					break;
					
				case 3:
					System.out.println("3月");
					break;
					
				case 4:
					System.out.println("4月");
					break;
					
				case 5:
					System.out.println("5月");
					break;
					
				case 6:
					System.out.println("6月");
					break;
					
				case 7:
					System.out.println("7月");
					break;
					
				case 8:
					System.out.println("8月");
					break;
					
				case 9:
					System.out.println("9月");
					break;
					
				case 10:
					System.out.println("10月");
					break;
					
				case 11:
					System.out.println("11月");
					break;
					
				case 12:
					System.out.println("12月");
					break;
					
				default:
					System.out.println("1～12の数字を入力してください");
					break;
		}*/
		
		/*１
		 * int weekday = sc.nextInt();
		switch (weekday) {
			case 1:
				System.out.println("月曜日");
				break;
				
			case 2:
				System.out.println("火曜日");
				break;
				
			case 3:
				System.out.println("水曜日");
				break;
				
			case 4:
				System.out.println("木曜日");
				break;
				
			case 5:
				System.out.println("金曜日");
				break;
				
			case 6:
				System.out.println("土曜日");
				break;
				
			case 7:
				System.out.println("日曜日");
				break;
				
			default:
				System.out.println("1～7の数字を選択してください");
				break;
		}
		*/
		
	}

}
