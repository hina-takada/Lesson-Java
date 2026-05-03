package jp.co.aforce.sample.thread;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello Wrold");
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new MyRunnable());
		thread.start();
	}
	
}
