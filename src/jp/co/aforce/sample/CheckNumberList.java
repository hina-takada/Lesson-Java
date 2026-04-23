package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckNumberList {

	public static void main(String[] args) {
		//****問題****//
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		List<String> sizeList = new ArrayList<>();

		if (num > 10) {
			sizeList.add("large");
		} else {
			sizeList.add("small");
		}
		
		System.out.println(sizeList);
	}

}
