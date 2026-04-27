package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticeTest3 {

	public static void main(String[] args) {
		//問題1
		String[] product = { "シャープペンシル", "ボールペン", "リングノート", "クリップ", "消しゴム" };

		//問題2
		System.out.println(product[1]);

		//問題3
		List<String> employee = Arrays.asList("山田太郎", "鈴木花子", "佐藤二郎", "山田太郎", "高橋三郎");

		//問題5
		System.out.println(employee.get(2));

		//問題6
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(18);
		list2.add(20);

		//統合
		list1.addAll(list2);
		//昇順
		Collections.sort(list1);

		for (int list : list1) {
			System.out.println(list);
		}

		//問題7
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(13);
		list3.add(14);
		list3.add(17);
		list3.add(21);
		
		Collections.sort(list3);
		for(int list : list3) {
			System.out.println(list);
		}

	}

}
