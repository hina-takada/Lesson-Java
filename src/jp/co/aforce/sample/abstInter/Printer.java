package jp.co.aforce.sample.abstInter;

public interface Printer {
	abstract void print();
	default void showStatus() {System.out.println("接続中");};
}
