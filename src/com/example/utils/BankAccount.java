package com.example.utils;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	
	int deposit(int amount){
		return amount + balance;
	}
}
