package jp.co.aforce.sample;

public class ForExercises {
//第7章：制御構文（while,for/breake）
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);*/
		
		//フィボナッチ数列
		int fib = 1;
		int sum = 0;
		for(int i = 0; i <= 10 ; i++) {
			if(sum != 0)System.out.println(sum);
			
			int next = fib + sum;
			fib = sum;
			sum = next;
		}
		
		
		//breake
		/*３
		 * int[][] numbers = {{4,2,6,5,8},{2,7,3,5}};
		for(int[] number : numbers) {
			for(int num : number) {
				if(num == 5)break;
				System.out.println(num);
			}
			break;
		}*/
		
		/*２
		 * int[] nums = {1,2,3,4,5,6,7,8,9,10};
		for(int num : nums){
			if(num == 7)break;
			System.out.println(num);
		}*/
		
		/*1
		 * for(int i = 1; i <= 10 ; i++) {
			if(i == 5) break;
			System.out.println(i);
		}*/
		
		
		//拡張for文
		/*３
		 * int[] nums = {3,5,4,6,7,2};
		int total = 0;
		for(int num : nums) {
			total += num;
		}
		System.out.println(total);*/
		
		/*２
		 * List<String> strs = Arrays.asList("朝","夜","昼","夕方");
		for(String str : strs) {
			System.out.println(str);
		}*/
		
		/*１
		 * int[] nums = {1,2,3,5,6};
		for(int num : nums) {
			System.out.println(num);
		}*/
		
		
		//for文()
		
		/*２
		 * int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);*/
		
		/*１
		 * for(int i = 1;i <= 10;i++) {
			System.out.println(i);
		}*/
		
		
		//do-while文
		/*３
		 * int number = sc.nextInt();
		int sum = 0;
		do {
			sum += number;
			number = sc.nextInt();
		} while (number != 0);
		System.out.println(sum);*/
		
		/*２
		 * int num = 1;
		int sum = 0;
		do {
			sum += num;
			num++;
			
		} while (num <= 100);
		System.out.println(sum);*/
		
		/*１
		 * int num = 1;
		do {
			System.out.println(num++);
		} while (num <= 10);*/
		
		
		
		//while文
		/*int num = sc.nextInt();
		int sum = 0;
		
		while (num != 0) {
			sum += num;
			num = sc.nextInt();
		}
		System.out.println(sum);*/
		
		/*２
		 * int num = 1;
		int sum = 0;
		while (num <= 100) {
			sum += num;
			num++;
		}
		System.out.println(sum);*/
		
		/*１
		 * int num = 1;
		while (num <= 10) {
			System.out.println(num++);
		}*/

	}

}
