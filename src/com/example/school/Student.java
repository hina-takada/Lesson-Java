package com.example.school;

public class Student {
	private String name;
	private int grade;

	public Student(String name,int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public void introduce() {
		System.out.printf("名前は、%sです。学年は、%d年です。\n",name,grade);
	}
}
