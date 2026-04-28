package jp.co.aforce.sample.instanceSample;

public class Student {
	private String name;
	private int[] scores;
	
	public Student(String name,int[] scores) {
		this.name = name;
		this.scores = scores;
	}
	
	String getName() {
		return name;
	}
	
	int totalCalc() {
		int sum = 0;
		for(int socre : scores) {
			sum += socre;
		}
		return sum;
		
	}
	
	double avgCalc() {
		return (double)totalCalc() / scores.length;
		
	}
	
}
