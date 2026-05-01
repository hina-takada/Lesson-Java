package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class TaskManegment {
	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		lists.add("TASK001");
		lists.add("TASK002");
		lists.add("TASK003");
		lists.add("TASK001");
		lists.add("TASK004");
		lists.add("TASK002");
		
		System.out.println("処理済みのタスクIDの一覧示：");
		for(String list : lists) {
			System.out.println("-" + list);
		}
		
		String newTask1 = "TASK003"; 
		String newTask2 = "TASK005"; 
		
		if(lists.contains(newTask1)) {
			System.out.println("タスクID" + newTask1 + "は既に処理済みです。");
		}else {
			System.out.println("タスクID" + newTask2 + "は未処理です。");
		}
		
		if(lists.contains(newTask2)) {
			System.out.println("タスクID" + newTask2 + "は既に処理済みです。");
		}else {
			System.out.println("タスクID" + newTask1 + "は未処理です。");
		}
		
		System.out.println("処理済みのタスクの総数：" + lists.size());
		
	}
}
