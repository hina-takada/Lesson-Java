package com.example.app;

import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.animal.Dog;
import com.example.model.Data;
import com.example.school.Student;
import com.example.service.Service;
import com.example.utils.BankAccount;
import com.example.utils.Helper;
import com.example.utils.MathUtils;
import com.example.utils.Utility;

public class Main {
	public static void main(String[] args) {
		//11章：名前空間・スコープ
		MathUtils mu = new MathUtils(); 
		System.out.println(mu.add(3,5));
		
		Student student = new Student("小林", 2);
		student.introduce();
		
		Dog dog1 = new Dog();
		com.example.vehicle.Dog dog2 = new com.example.vehicle.Dog();
		
		Helper helper = new Helper();
		/*使用できない。デフォルトアクセス修飾子のため
		 * helper.showMessage("", "");*/
		
		Data data = new Data();
		Service service = new Service();
		
		data.dataString();
		service.serviceString();
		
		/*****11章:import******/
		List<String> animals = new ArrayList<String>();
		animals.add("犬");
		animals.add("サル");
		animals.add("雉");
		
		for(String animal : animals) {
			System.out.println(animal);
		}
		
		double Circle = Math.PI * Math.pow(3, 2);
		System.out.println((int)Circle);
		
		Utility.greet();
		
		List<Integer> lists = new ArrayList<Integer>();
		Random random = new Random();
		
		for(int i = 0; i < 10;i++) {
			lists.add(random.nextInt(20));
		}
		
		for(int list : lists) {
			System.out.print(list + ",");
		}
		
		double r = sqrt(2);
		System.out.println("\n" + r);
		
		
		BankAccount ba = new BankAccount(5000);
		System.out.println(ba.getBalance());
		
		
		
		
		
		
		
		
		
		
		
	}
}
