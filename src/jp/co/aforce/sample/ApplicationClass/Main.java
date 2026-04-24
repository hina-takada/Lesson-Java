package jp.co.aforce.sample.ApplicationClass;

public class Main {

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
		
		
		
		
		
		
		
		
		
		
		

	}

}
