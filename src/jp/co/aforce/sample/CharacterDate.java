package jp.co.aforce.sample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CharacterDate {

	public static void main(String[] args) {
		//第4章；文字,第5章:日付(問題2)
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2027, 4, 3);
		long day = ChronoUnit.DAYS.between(today, birthday);
		System.out.println("誕生日まで、" + day + "日です");
		
	}

}
