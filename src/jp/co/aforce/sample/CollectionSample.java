package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionSample {	
	public static void main(String[] args) {
		//研修中の練習問題
		//リスト
		List<Integer> lists = new ArrayList<>();
		lists.add(1);
		lists.add(2);
		lists.add(3);
		lists.add(4);
		System.out.println(lists);
		System.out.println(lists.get(1));
		lists.remove(Integer.valueOf(4));
		lists.remove(Integer.valueOf(2));
		lists.add(2);
		lists.add(5);
		lists.add(6);
		System.out.println(lists);
		lists.set(2, 4);
		System.out.println(lists);
		lists.remove(lists);
		System.out.println(lists);
		
		//その他のメソッド
		System.out.println(lists.size());
		if(lists.isEmpty()) {
			System.out.println("空");
		}
		System.out.println("ある");
		
		
		//HashSet
		Map<String, Integer> nameMap = new HashMap<String, Integer>();
		nameMap.put("Bob", 1);
		nameMap.put("Alice", 2);
		nameMap.put("John", 2);
		nameMap.put("Tom", 1);
		
		/*nullPo
		 * int value = nameMap.get("Taro");*/
		
		//その他のメソッド
		
		
		//まとめ問題
		Map<String, Integer> shop = new HashMap<String, Integer>();
		shop.put("りんご",100);
		shop.put("みかん", 80);
		shop.put("バナナ", 120);
		shop.put("いちご", 300);
		
		String fruit = "みかん";
		if(fruit.equals("") || !shop.containsKey(fruit)) {
			System.out.println("申し訳ありません。その商品は取り扱っておりません");
		}else {
			System.out.println(shop.get(fruit) + "円です");
		}
		
		/**********************************
		 **************6章演習*************
		 **********************************/
		
		//配列とリスト
		/*3
		String[] names = { "田中", "木村", "小道", "斎藤", "大久保" };
		int[] results = { 68, 70, 60, 80, 90 };
		int sum = 0;
		for(int result : results) {
			sum += result;
		}
		
		int avg = sum / results.length;
		System.out.println(avg);
		
		//Map版
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("田中", 68);
		map.put("木村", 70);
		map.put("小道", 60);
		map.put("斎藤", 80);
		map.put("大久保", 98);
		
		int sum = 0;
		for(int result : map.values()) {
			sum += result;
		}
		
		double avg = (double)sum / map.size();
		System.out.println(avg);
		*/

		/*2
		 * List<String> animals =  Arrays.asList("いぬ","ねこ","さる","コアラ");
		String[] array = animals.toArray(new String[animals.size()]);
		System.out.println(Arrays.toString(array));*/

		/*1
		 * Integer[] nums = {40,58,28,59};
		 */
		/*List変換時は,
		 * Arraysを使うか、配列の型をListの対応する型にする
		List<Integer> numList = Arrays.asList(nums);
		System.out.println(numList);*/

		//ハッシュ
		/*3
		 * HashSet<String> lang = new HashSet<String>();
		lang.add("Java");
		lang.add("Python");
		lang.add("Java");
		lang.add("Ruby");
		lang.add("Python");
		
		System.out.println(lang);*/

		/*２
		 * HashMap<String,Integer> price = new HashMap<>();
		price.put("りんご", 400);
		price.put("なし", 600);
		price.put("ばなな", 300);
		price.put("ぶどう", 700);
		
		System.out.println(price.get("りんご") + "円");*/

		/*1
		 * Map<String, String> prefecture = new HashMap<>();
		prefecture.put("福岡県", "福岡市");
		prefecture.put("千葉県", "千葉市");
		prefecture.put("宮城県", "仙台");
		prefecture.put("栃木県", "宇都宮市");
		
		for(Map.Entry<String,String> entry: prefecture.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}*/

		//リスト
		/*3************************
		 * List<String> string = new LinkedList<>();
		string.add("空");
		string.add("海");
		string.add("森");
		string.add("山");
		string.add("家");
		System.out.println(string.removeFirst());
		System.out.println(string.removeLast());*/

		/*2************************
		 * List<String> alphabet = Arrays.asList("a","d","b","e","c");
		Collections.sort(alphabet);
		System.out.println(alphabet);*/

		/*1************************
		 * List<Integer> num = Arrays.asList(32,64,74,23,64);
		if(num.contains(32)) {
			System.out.println("値は存在する");
		}else {
			System.out.println("値は存在しない");
		}*/

		//コレクションとは

		/*2
		 * Set<Integer> num = new HashSet<>();
		num.add(23);
		num.add(40);
		num.add(59);
		num.add(57);
		num.add(40);//重複用
		System.out.println(num);*/

		/*１リンゴ、バナナ、さくらんぼ
		 * List<Integer> number = Arrays.asList(1,2,3,4,5);
		Collections.reverse(number);
		System.out.println(number);*/
	}

}
