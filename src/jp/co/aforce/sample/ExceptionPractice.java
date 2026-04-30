package jp.co.aforce.sample;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		try {
			int age = 15;
			if(age < 18) {
				throw new IllegalArgumentException("18歳未満は登録できません。");
			}
			System.out.println("登録が完了しました。");
		} catch (IllegalArgumentException e) {
			System.out.println("例外が発生しました:\n" + e.getMessage());
		}
		
		
		
		/*try {
			int[] nums = {1,2,3,4,5};
			System.out.println(nums[5]);
		} catch (NullPointerException e) {
			System.out.println("ヌルポが発生しました:" + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲外" + e.getMessage());
			}
		System.out.println("プログラムは継続します");*/
		
		
		/*try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("ヌルポが発生しました:" + e.getMessage());
		}
		System.out.println("プログラムは継続します");
		*/
		
		
		/*String str = "";
		System.out.println(str.length());
		System.out.println("プログラムは継続します");*/
	}

}
