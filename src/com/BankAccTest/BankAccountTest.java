package com.BankAccTest;
import com.bankAcc.*;

public class BankAccountTest {
	public static void main(String[] args) {
		
		BankAccount marta = new BankAccount();
		BankAccount julia = new BankAccount();
		BankAccount pedro = new BankAccount();
		
		BankAccount.howmanyAcc();
		
		
//		=================================================
		marta.getChekingInfo();
		marta.getSavingInfo();
		marta.addMoney("mybank", 500);
		marta.addMoney("savings", 500);
		marta.addMoney("checking", 5000);
		marta.withdrawn("savings", 200);
		marta.withdrawn("savings", 1000);
		marta.getChekingInfo();
		marta.getSavingInfo();
		
		
//		=================================================
		System.out.println("===================================");
		julia.getChekingInfo();
		julia.getSavingInfo();
		julia.addMoney("mybank", 500);
		julia.addMoney("savings", 2000);
		julia.addMoney("checking", 5000);
		julia.withdrawn("checking", 200);
		julia.withdrawn("savings", 1000);
		julia.getChekingInfo();
		julia.getSavingInfo();
		
	}
	
	
	
	
	
}
