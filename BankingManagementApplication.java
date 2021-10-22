package com.bl.bankingmanagementapplication;

public class BankingManagementApplication {

	public static void main(String[] args) {
		
		System.out.println("welcome to banking management application");
		SavingsAcoount saver1 = new SavingsAcoount();
		saver1.getSavingBalance(2000);
		saver1.calculateMonthlyInterest();    // calculating saving balance for saver 1
		SavingsAcoount saver2 = new SavingsAcoount();
		saver2.getSavingBalance(3000);
		saver2.calculateMonthlyInterest();   // calculating saving balance for saver 2
	}

}
