package jp.co.aforce.sample.abstInter;

public class CMessage implements AMessage , BMessage {

	@Override
	public void message() {
		AMessage.super.message();
		BMessage.super.message();
		System.out.println("Cのメッセージ");
	}
	
}
