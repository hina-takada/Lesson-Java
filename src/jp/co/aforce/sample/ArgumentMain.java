package jp.co.aforce.sample;

public class ArgumentMain {

	public static void main(String[] args) {
		Argument argument = new Argument();
		argument.greet("前田");
		
		System.out.println();
		
		int argAdd = argument.add(4, 5);
		System.out.println(argAdd);
		
		System.out.println(argument.isEven(4));
		System.out.println(argument.isEven(7));
		
		//staticメソッド
		System.out.println(Argument.repeat("Java", 3));
		
		System.out.println("面積:" + argument.calcArea(4.0));

	}

}
