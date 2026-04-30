package jp.co.aforce.sample.abstInter;

//第12章：抽象クラスとインターフェイス
public class Main {
	public static void main(String[] args) {
		//抽象クラス
		//問1
		Car car = new Car();
		car.move();
		
		//問3
		Dog dog = new Dog();
		dog.makeSound();
		/*dog.sleep();*/
		
		//問4
		Student student = new Student("もも");
		student.introduce();
		
		//問5
		Rectangle rectang = new Rectangle(5, 6);
		rectang.calculateArea();
		rectang.calculatePerimeter();
		
		
		/*インタフェース*/
		//問1
		Computer computer = new Computer();
		computer.powerOn();
		computer.useDevice();
		
		//問2
		AnimalInter dogInter = new Dog();
		dogInter.makeSound();
		
		//問3
		Bird bird = new Bird();
		bird.fly();
		bird.makeSound();
		
		//問4
		Circle circle = new Circle();
		/*System.out.println(circle.calculateArea(5)); */
		
		//問5
		LaserPrinter lp = new LaserPrinter();
		lp.showStatus();
		lp.print();
		
		//問7
		Circle ci = new Circle();
		Rectangle ri = new Rectangle(4, 6);
		
		ci.calculateArea();
		ri.calculateArea();
		
		//問8
		
		
		
		
		
		
		
		
		
		
	}

}
