package jp.co.aforce.sample.abstInter;

public interface BMessage {
	default void message() {System.out.println("Bのメッセージ");};
}
