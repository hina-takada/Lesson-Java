package jp.co.aforce.sample.ApplicationClass;

import java.awt.Button;

public class Main {
	//10章：クラスの応用Main
	public static void main(String[] args) {
		Person person = new Person("名前", 10);
		System.out.println(person.getName() + "：" +
				person.getAge() + "歳です");

		Car carDefo = new Car();
		Car carArg = new Car("トヨタ");

		System.out.println(carDefo.getName());
		System.out.println(carArg.getName());

		Book book1 = new Book("Java入門ゼミ", "田中 恒一", 900);
		Book book2 = new Book("アルゴリズム思考の基本", "佐藤 美咲");

		System.out.println(book1.toString());
		System.out.println(book2.toString());

		System.out.println("=====================");

		Dog dog = new Dog();
		dog.meleSound();
		Cat cat = new Cat();
		cat.meleSound();

		PersonOver perOver = new PersonOver("尾崎", 30);
		System.out.println(perOver.toString());

		System.out.println("=====================");

		Employee ep = new Employee(1);
		System.out.println(ep.equals(ep));

		System.out.println("=====================");
		
		System.out.println(add(2,4));
		System.out.println(add(2,5,4));
		
		System.out.println("---------------------");
		
		Rectangle ra1 = new Rectangle(5, 4);
		Rectangle ra2 = new Rectangle(4);
		
		System.out.println(ra1.getWidth() + " " + ra1.getHeight());
		System.out.println(ra2.getWidth() + " " + ra2.getHeight());
		
		System.out.println("---------------------");
		//10章　問3
		System.out.println(add(2,4,6,7));
		
		System.out.println("=====================");
		
		InnerClass inner = new InnerClass();
		Thread thread = new Thread(inner);
		thread.start();
		
		System.out.println("----------------------");
		
		//10章：無名内部クラス　問2
		Button btu = new Button();
		btu.addActionListener(inner);
		
		
		System.out.println("=====================");
		//10章　キャスト
		double numDoub = 4.0;
		int numInt = (int)numDoub;
		
		System.out.println("----------------------");
		
		Animal dogCast = new Dog();
		dogCast.meleSound();
		
		System.out.println("----------------------");
		
		Shape circle = new Circle();
		Shape rect = new Rectangle(2, 5);
		
		System.out.println(circle instanceof Shape);
		System.out.println(rect instanceof Shape);
		
		circle.calc();
		rect.calc();
		
		System.out.println("=====================");
		//10章：静的フィールド
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		
		counter1.add();
		counter2.add();
		
		System.out.println("----------------------");
		
		

	}

	//オーバーロード
	static int add(int a, int b) {
		return a + b;
	}
	static int add(int a, int b,int c) {
		return a + b + c;
	}
	
	//10章　問3
	static int add(int a, int b,int c,int d) {
		return a + b + c + d;
	}

}
