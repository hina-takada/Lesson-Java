package com.example.app;

import com.example.school.Student;
import com.example.utils.MathUtils;

public class Main {
	public static void main(String[] args) {
		MathUtils mu = new MathUtils(); 
		System.out.println(mu.add(3,5));
		
		Student student = new Student("小林", 2);
		student.introduce();
	}
}
