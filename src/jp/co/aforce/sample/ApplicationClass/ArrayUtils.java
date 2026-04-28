package jp.co.aforce.sample.ApplicationClass;
//10章：静的メソッド
public class ArrayUtils {
	
	static int max(int[] maximum) {
		int maxValue = maximum[0];
		for(int value : maximum) {
			if(value > maxValue) {
				maxValue = value;
			}
		}
		
		return maxValue;
		
		/*for(int i = 1; i < maximum.length; i++) {
			max = Math.max(max, maximum[i]);
		}*/
	}
}
