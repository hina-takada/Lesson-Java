package jp.co.aforce.sample.ClassSample;

public class Student {
	
	String name;
	int[] scores;
	
	public Student(String name,int[] scores) {
		this.name = name;
		this.scores = scores;
	}
	
	public double average () {
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		return (double)sum /scores.length;	
	}
	
}
