package jp.co.aforce.sample.ApplicationClass;

//10章：列挙型
public enum TrafficLight {
	//信号
	赤("止まる"), 
	黄("注意してください"),
	緑("進んでください");
	
	
	private final String MESSAGE;
	
	private TrafficLight(String message) {
		this.MESSAGE = message;
	}
	
	String getMessage() {
		return MESSAGE;
	}

}
