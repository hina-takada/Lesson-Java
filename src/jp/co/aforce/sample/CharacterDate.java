package jp.co.aforce.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CharacterDate {

	public static void main(String[] args) throws ParseException {
		//第4章；文字,第5章:日付(問題2)
		//解答
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String birthDateString = "2027-03-04";
		
		Date birthday = sdf.parse(birthDateString);
		long diffInMillies = Math.abs(birthday.getTime() - today.getTime());
		long daysUntilBirthday = TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);
		
		System.out.println("誕生日は、" + daysUntilBirthday);
		
		
		
		/*LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2027, 4, 3);
		long day = ChronoUnit.DAYS.between(today, birthday);
		System.out.println("誕生日まで、" + day + "日です");*/
		
	}

}
