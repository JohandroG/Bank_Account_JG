package com.bankAcc;

public class BankAccount {
	private double checking_balance;
	private double savings_balance;
	private static int numOfAcc;
	private static double moneyTotal;
	
	public BankAccount() {
		this.checking_balance = 0;
		this.savings_balance = 0;
		BankAccount.numOfAcc += 1;
	}
	
//	Getters
	
	public void getChekingInfo() {
		System.out.println("The balance in the checking account is: "+ this.checking_balance);
	}
	public void getSavingInfo() {
		System.out.println("The balance in the saving account is: "+ this.savings_balance);
	}

//	Setters
	
	public void addMoney(String account, int money) {
		if (account == "checking") {
			this.checking_balance += money;
			System.out.println("You have deposited to checking: $" + money);
		}
		if (account == "savings") {
			this.savings_balance += money;
			System.out.println("You have deposited to savings: $" + money);
		}
		else {
			System.out.println("This is not a valid account please select 'savings' or 'checking'");	
		}
	}
	
	public void withdrawn(String account, int money) {
		if (account == "checking") {
			if (this.checking_balance > money) {
				this.checking_balance -= money;
				System.out.println("You have withdrawn of checking: $" + money);
			}
			else {
				System.out.println("ERROR");
				System.out.println("You are trying to withdrawn: "+money);
				System.out.println("But you only have: "+ this.checking_balance);
			}
		}
		if (account == "savings") {
			if (this.savings_balance > money) {
				this.savings_balance -= money;
				System.out.println("You have withdrawn of savings: $" + money);
			}
			else {
				System.out.println("ERROR");
				System.out.println("You are trying to withdrawn: "+money);
				System.out.println("But you only have: "+ this.savings_balance);
			}
		}
		else {
			System.out.println("This is not a valid account please select 'savings' or 'checking'");	
		}
		
	}
	
	public void totalAmount() {
		BankAccount.moneyTotal = this.checking_balance + this.savings_balance;
		System.out.println("From your accounts you have: $"+BankAccount.moneyTotal);
	}
	
	public static void howmanyAcc() {
		System.out.println("We have: "+BankAccount.numOfAcc+" account(s)");
	}
	
	
	
	
}
