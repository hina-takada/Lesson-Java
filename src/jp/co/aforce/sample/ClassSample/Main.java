package jp.co.aforce.sample.ClassSample;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("あかり", 10);
		System.out.println(person.getName() + ":" + person.getAge());
		
		Book book = new Book("山月記", "中島敦", 2000);
		book.showInfo();
		
		Student student = new Student();
		student.average();
		
		Employee emplo = new Employee(1, "木之元", 240000);
		emplo.raiseSalary(0.02);
		
		Circle circle = new Circle(10);
		circle.area();

	}

}
