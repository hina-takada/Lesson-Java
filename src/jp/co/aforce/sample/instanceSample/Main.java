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

		Car car1 = new Car("Mazda RX-7", 190);
		Car car2 = new Car("Toyota Prius", 140);
		Car car3 = new Car("Subaru Impreza", 170);
		
		car1.car();
		car2.car();
		car3.car();
		
		System.out.println("---------------------");
		
		Rectangle rect = new Rectangle(12, 9);
		rect.area();
		
		System.out.println("---------------------");
		
		Robot robot1 = new Robot();
		Robot robot2 = new Robot();
		
		robot1.move("歩く");
		robot2.move("走る");
		
		System.out.println("---------------------");
		
		Student student1 = new Student("高橋", 70, 50, 74);
		Student student2 = new Student("田中", 80, 60, 90);
		
		student1.totalCalc();
		student1.avgCalc();
		
		student2.totalCalc();
		student2.avgCalc();
		
		System.out.println("---------------------");
		

	}

}
