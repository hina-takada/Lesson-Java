package jp.co.aforce.sample.ApplicationClass;

public class Employee {
	private int id;
	
	public Employee(int id) {
		this.id = id;
	}
	//ここあとできく。
	@Override
	public boolean equals(Object obj) {
		if(this.id == ((Employee)obj).id) {
			return true;
		}
		return false;
		
	}
}
