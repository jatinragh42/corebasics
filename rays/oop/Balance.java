package com.rays.oop;

public class Balance {

	private int balance = 0;
	private int deposit = 0;
	private int withdrawal = 0;
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	
	
	public void setDeposit(int deposit) {
		this.deposit = getBalance() + deposit;
	}
	public int getDeposit() {
		return deposit;
	}
	
	
	
	public void setWithdrawal(int withdrawal) {
		this.withdrawal = getDeposit()-withdrawal;
	}
	public int getWithdrawal() {
		return withdrawal;
	}
}