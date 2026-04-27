package jp.co.aforce.sample.ApplicationClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//10章　無名内部クラス
public class InnerClass implements Runnable , ActionListener{
	//問題1
	@Override
	public void run() {
		System.out.println("Hello World!");
		
	}

	//問題2 途中
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("クリック");
	}
	
	//問題3
}
