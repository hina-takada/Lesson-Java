package jp.co.aforce.sample.ApplicationClass;

public class Main {
	//10章：クラスの応用Main
	public static void main(String[] args) {
		//コンストラクター
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
		//オーバーライド
		Animal dog = new Dog();
		dog.meleSound();
		Animal cat = new Cat();
		cat.meleSound();

		PersonOver perOver = new PersonOver("尾崎", 30);
		System.out.println(perOver);

		System.out.println("-----------------------");
		
		Employee ep1 = new Employee(1);
		Employee ep2 = new Employee(2);
		Employee ep3 = new Employee(1);
		
		
		System.out.println(ep1.equals(ep2));
		System.out.println(ep1.equals(ep3));

		System.out.println("=====================");
		
		//オーバーロード
		System.out.println(add(2,4));
		System.out.println(add(2,5,4));
		
		System.out.println("---------------------");
		
		Rectangle ra1 = new Rectangle(5, 4);
		Rectangle ra2 = new Rectangle(4);
		
		System.out.println(ra1.getWidth() + " " + ra1.getHeight());
		System.out.println(ra2.getWidth() + " " + ra2.getHeight());
		
		System.out.println("---------------------");
		//10章　問3
		int result = add(3,5,6,2,6);
		System.out.println(result);
		
		System.out.println("=====================");
		
		System.out.println("=====================");
		//10章　キャスト
		double numDoub = 4.0;
		int numInt = (int)numDoub;
		
		System.out.println("----------------------");
		
		Animal dogCast = new Dog();
		dogCast.meleSound();
		
		System.out.println("----------------------");
		
		Shape shape1 = new Circle();
		Shape shape2 = new Rectangle(2, 5);
		
		if(shape1 instanceof Shape) {
			Circle circle = (Circle)shape1;
			circle.calc();
		}
		
		if(shape2 instanceof Shape) {
			Rectangle rect = (Rectangle)shape2;
			rect.calc();
		}
		
		
		System.out.println("=====================");
		//10章：静的フィールド
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		
		System.out.println(Counter.count);
		
		System.out.println("----------------------");
		
		Student st1 = new Student("田中");
		Student st2 = new Student("小林");
		
		System.out.println(st1.getName() + "は、" + Student.schoolName);
		System.out.println(st2.getName() + "は、" + Student.schoolName);
		
		System.out.println(Configuration.appName);
		System.out.println(Configuration.version);
		
		System.out.println("=====================");
		//静的メソッド
		System.out.println(MathUtils.add(3, 4));
		
		System.out.println("----------------------");
		
		System.out.println(StringUtils.toUpperCase("apple"));
		
		System.out.println("----------------------");
		
		int[] array = {3,5,6,7,3,40};
		System.out.println(ArrayUtils.max(array));
		
		
		System.out.println("=====================");
		
		MathConstants mc = new MathConstants();
		double circleArea = Math.pow(3, 2) * mc.PI;
		System.out.println(circleArea);
		
		System.out.println("----------------------");
		
		PhysicsConstants pc = new PhysicsConstants();
		System.out.printf("%,d",pc.SPEED_OF_LIGHT * 1);
		
		System.out.println("\n----------------------");
		
		AppConfig ap = new AppConfig();
		System.out.printf("アプリケーション名：%s,バージョン：%.1f",ap.APP_NAME ,ap.VERSION);
		
		System.out.println("\n=====================");
		//列挙型
		for(Day day : Day.values()) {
			System.out.println(day);
		}
		System.out.println("----------------------");
		
		for(Season season : Season.values()) {
			System.out.print(season);
		}
		System.out.println("\n----------------------");
		
		for(TrafficLight light : TrafficLight.values()) {
			System.out.println(light + ":" + light.getMessage());
		}
		

	}

	//オーバーロード
	static int add(int a, int b) {
		return a + b;
	}
	static int add(int a, int b,int c) {
		return a + b + c;
	}
	
	//10章　問3
	static int add(int... numbers) {
		int total = 0;
		for(int number : numbers) {
			total += number;
		}
		return total;
	}

}
