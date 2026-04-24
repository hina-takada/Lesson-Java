package jp.co.aforce.sample.instanceSample;

public class Student {
	private String name;
	private int scoreMath;
	private int scoreScience;
	private int scoreEnglish;
	
	public Student(String name,int scoreMath,int scoreScience,int scoreEnglish) {
		this.name = name;
		this.scoreMath = scoreMath;
		this.scoreScience = scoreScience;
		this.scoreEnglish = scoreEnglish;
	}
	
	void totalCalc() {
		int total = scoreMath + scoreScience + scoreEnglish;
		System.out.println("合計：" + total + "点");
	}
	
	void avgCalc() {
		int avg = (scoreMath + scoreScience + scoreEnglish) / 3;
		System.out.println("平均:" + avg );
	}
	
}
