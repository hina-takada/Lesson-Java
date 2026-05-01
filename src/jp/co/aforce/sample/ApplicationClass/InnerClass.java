package jp.co.aforce.sample.ApplicationClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

//10章　無名内部クラス
public class InnerClass {
	public static void main(String[] args) {
		/*問題1
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World!");
			}
		};
		
		
		Thread thread = new Thread();
		thread.start();
		*/

		//問題2 
		/*JFrame frame = new JFrame("サンプル");
		JButton button = new JButton("Bttuon");
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ボタン");
			}
		});
		
		frame.add(button);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);*/

		//問題3
		
		Timer timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Tick");
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
