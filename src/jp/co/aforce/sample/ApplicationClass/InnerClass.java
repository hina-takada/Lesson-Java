package jp.co.aforce.sample.ApplicationClass;

//10章　無名内部クラス
public class InnerClass {
	public static void main(String[] args) {
		//問題1
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World!");
			}
		};
		
		Thread thread = new Thread();
		thread.start();
		
		//問題2 
			
		//問題3
	}
}
