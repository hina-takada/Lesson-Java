package com.example.utils;
//11章：アクセス制御
public class Person {
	/*問3*/
	protected String name;
	protected int age;
	protected String address;
	
	/*問2
	 * private String name;
	private int age;
	private String address;*/
	
	/*問1
	 * private String name;
	protected int age;
	public String address;*/
	
	public Person(String name,int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
