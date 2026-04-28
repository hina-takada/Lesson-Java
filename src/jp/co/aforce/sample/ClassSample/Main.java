package jp.co.aforce.sample.ClassSample;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("あかり", 10);
		System.out.println(person.getName() + ":" + person.getAge());
		
		Book book = new Book("山月記", "中島敦", 2000);
		book.showInfo();
		
		int[] scores = {69,60,80};
		Student student = new Student("松本",scores);
		System.out.println("平均点：" + student.average());
		
		Employee emplo = new Employee(1, "木之元", 240000);
		emplo.raiseSalary(10);
		System.out.println("昇給後の給料:" + emplo.getSalary() +"円");
		
		Circle circle = new Circle(10);
		circle.area();

	}

}
