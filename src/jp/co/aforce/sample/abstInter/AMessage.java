package jp.co.aforce.sample.abstInter;

public interface AMessage {
	default void message() {System.out.println("Aのメッセージ");};
}
