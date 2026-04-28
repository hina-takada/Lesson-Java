package jp.co.aforce.sample.instanceSample;

public class Main {

	public static void main(String[] args) {
		//mainメソッド
		System.out.println("Hello world");
		
		int num1 = 30;
		int num2 = 10;
		System.out.println(num1 + num2);
		
		System.out.println(args[0]);
		
		String name = "安倍";
		int age = 20;
		
		System.out.println(String.format("私の名前は、%sです。"
				+ "年齢は、%dです", name,age));
		
		
		//インスタンス
		Dog dog = new Dog();
		dog.setName("ココ");

		System.out.println(dog.getName());
		
		System.out.println("---------------------");
		
		Cat cat = new Cat();
		cat.name = "たま";
		cat.meow();
		
		System.out.println("---------------------");

		Car car1 = new Car("Mazda RX-7", 190);
		Car car2 = new Car("Toyota Prius", 140);
		Car car3 = new Car("Subaru Impreza", 170);
		
		car1.car();
		car2.car();
		car3.car();
		
		System.out.println("---------------------");
		
		Rectangle rect = new Rectangle(12, 9);
		System.out.println(String.format("面積は、%d㎝", rect.area()));
		
		System.out.println("---------------------");
		
		Robot robot1 = new Robot("A1");
		Robot robot2 = new Robot("A2");
		
		robot1.move();
		robot2.move();
		
		System.out.println("---------------------");
		
		int[] scores1 = {60,80,72};
		Student st1 = new Student("高橋",scores1);
		
		System.out.println(st1.getName() + "合計：" + st1.totalCalc() + "点");
		System.out.println("平均:" + st1.avgCalc() );
		

	}

}
