package jp.co.aforce.sample;

public class IfPractice {
/****研修 制御構文（if文/switch文/while文/for文****/
	public static void main(String[] args) {
		
		/*************
		 *****if文****
		 *************/
		int a = 50;
		int b = 50;
		if (a == b) {
			System.out.println("aとbの値は同じ");
		}

		System.out.println("==================================");

		boolean isRainy = true;
		if (isRainy) {
			System.out.println("傘を持っていきましょう");
		}

		System.out.println("==================================");

		int temperature = 25;
		if (temperature >= 30) {
			System.out.println("真夏日です");
		} else {
			System.out.println("真夏日ではありません");
		}

		System.out.println("==================================");

		int score = 75;
		if (score >= 80) {
			System.out.println('優');
		} else if (score >= 70) {
			System.out.println('良');
		} else if (score >= 70) {
			System.out.println('可');
		} else if (score >= 70) {
			System.out.println("不可");
		}

		System.out.println("==================================");

		int time = 14;
		boolean isHoliday = false;

		if (time >= 9 && time <= 18 && !isHoliday) {
			System.out.println("勤務時間内です");
		} else {
			System.out.println("勤務時間外です");
		}

		System.out.println("==================================");

		boolean hasLicense = true;
		boolean hasCar = true;
		if (hasLicense) {
			System.out.println("運転免許をもっています");

			if (hasCar) {
				System.out.println("車も持っています");
			} else {
				System.out.println("しかし、車は持っていません");
			}
		} else {
			System.out.println("運転免許をもっていません");
		}
		
		
		System.out.println("==================================");
		/*************
		 ***Switch文**
		 *************/

		String coclr = "yellow";
		String message;

		switch (coclr) {
			case "red":
				message = "停止してください";
				break;
			case "yellow":
				message = "注意してください";
				break;
			case "green":
				message = "進んでください";
				break;
			default:
				message = "不正な信号の色です";
		}
		System.out.println("現在の信号:" + coclr + " - " + message);
		
		System.out.println("==================================");
		
		/*************
		 ***while文**
		 *************/
		
		int i = 0;
		/*while (1 < 3) {
			System.out.println(i);
		}*/
		
		System.out.println("==================================");
		
		do {
			System.out.println(i);
			i++;
		} while (i < 3);
		
		System.out.println("==================================");
		
		/*for文*/
		for(int j = 0; j < 3; j++) {
			System.out.println(j);
		}
		
		System.out.println("==================================");
		
		int[] numbers = {0,1,2};
		for(int n : numbers) {
			System.out.println(n);
		}
		
		System.out.println("拡張for文との違い");
		
		for(int ij = 0; ij < numbers.length ; ij++) {
			System.out.println(ij);
		}
		
		System.out.println("==================================");
		
		for(int k = 0; k < 5;k++) {
			if(k == 3) break;
			System.out.println(k);
		}
		
		
		
		
		
		
		

	}

}
