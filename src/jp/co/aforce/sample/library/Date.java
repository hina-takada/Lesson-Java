package jp.co.aforce.sample.library;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//16章：ライブラリ
public class Date {

	public static void main(String[] args) {
		//1問
		LocalDate today = LocalDate.now();
		LocalDate nextWeek = today.plusDays(7);
		System.out.println(nextWeek);
		
		//2問目
		final int VALUE= -10;
		System.out.println(Math.abs(VALUE));
		
		//3問目
		List<Integer> lists = Arrays.asList(5,3,8,1);
		
		Collections.sort(lists);
		
		System.out.println(lists);
		
		//問題4
		LocalDateTime currentTime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分");
		String formatNow = dtf.format(currentTime);
		System.out.println(formatNow);
	}

}
