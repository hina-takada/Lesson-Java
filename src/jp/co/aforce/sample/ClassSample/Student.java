package jp.co.aforce.sample.ClassSample;

public class Student {
	
	String[] names = {"林","遠藤","近藤"};
	int[] scores = {69,60,80};
	
	public void average () {
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		int ave = sum /scores.length;
		System.out.println("平均点： " + ave);
	}
	
}
