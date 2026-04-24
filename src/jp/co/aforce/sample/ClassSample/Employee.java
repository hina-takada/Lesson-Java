package jp.co.aforce.sample.ClassSample;

public class Employee {
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	
	void raiseSalary(double percent) {
		int raise = salary + (int)(salary * percent);
		System.out.println(String.format("昇給後の給料:%,d円", raise));
	}
	
	
}
