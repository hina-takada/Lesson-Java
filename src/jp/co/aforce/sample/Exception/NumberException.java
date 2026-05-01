package jp.co.aforce.sample.Exception;

public class NumberException {
	public static void main(String[] args) {
		//
		/*try {
			Scanner scanner = new Scanner(System.in);
			int number = Integer.parseInt(scanner.nextLine());
			System.out.println(number / 2);
		} catch (NumberFormatException e) {
			System.out.println("数値以外の入力：" + e.getMessage());
		}*/
		
        try {						
            String str = null;						
            System.out.println(str.length());						
        } catch (ArithmeticException e) {						
            System.out.println("ArithmeticException が発生しました");						
        } catch (NullPointerException e) {						
            System.out.println("NullPointerException が発生しました");						
        } catch (Exception e) {						
            System.out.println("Exception が発生しました");						
        }						

		
	}
}
