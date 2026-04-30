package jp.co.aforce.sample.Exception;

import java.util.Scanner;

public class NumberException {
	public static void main(String[] args) {
		//
		try {
			Scanner scanner = new Scanner(System.in);
			String num = scanner.next();
			double divide = Integer.parseInt(num) / 2;
			System.out.println(divide);
		
		} catch (NumberFormatException e) {
			System.out.println("数値以外の入力：" + e.getMessage());
		}
		
		
	}
}
