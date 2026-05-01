package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		lists.add("リンゴ");
		lists.add("バナナ");
		lists.add("さくらんぼ");
		
		lists.remove(1);
		lists.add("オレンジ");
		
		System.out.println(lists);
	}

}
