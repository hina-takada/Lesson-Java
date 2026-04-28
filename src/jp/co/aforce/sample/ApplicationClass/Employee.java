package jp.co.aforce.sample.ApplicationClass;

public class Employee {
	private int id;
	
	public Employee(int id) {
		this.id = id;
	}
	//
	@Override
	public boolean equals(Object obj) {
		if(this == obj)return true;
		if(obj == null || getClass() != obj.getClass())return false;
		Employee employee = (Employee)obj;
		return id == employee.id;
		
		/*if(this.id == ((Employee)obj).id) {
			return true;
		}
		return false;*/
		
	}
}
