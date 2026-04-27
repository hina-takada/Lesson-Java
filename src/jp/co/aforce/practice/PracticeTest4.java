package jp.co.aforce.practice;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class PracticeTest4 {
	public static void main(String[] args) {
		//問題1
		List<String> animals = Arrays.asList("犬","猫","うさぎ","へび");
		
		//問題2
		String tiger = "トラ";
		if(animals.contains(tiger)) {
			System.out.println(tiger + "はリストに含まれています");
		}else {
			System.out.println(tiger + "はリストに含まれていません");
		}
		
		//問題3
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		
		switch (month) {
		case 1:
			System.out.println("冬物セール");
			break;
			
		case 2,3,4:
			System.out.println("春物を売る");
			break;
			
		case 5:
			System.out.println("春物セール");
			break;
			
		case 6,7:
			System.out.println("夏物を売る");
			break;
			
		case 8:
			System.out.println("夏物セール");
			break;
			
		case 9:
			System.out.println("秋物を売る");
			break;
			
		case 10,11,12:
			System.out.println("冬物を売る");
			break;
			
		default:
			System.out.println("不正な月です");
			break;
		}
	}
}
