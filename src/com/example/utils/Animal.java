package com.example.utils;

public class Animal {
	
	protected void makeSound() {
		System.out.println("サウンド");
	}
	
	
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.makeSound();
	}
}
