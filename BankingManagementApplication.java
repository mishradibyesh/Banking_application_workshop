package com.bl.bankingmanagementapplication;

public class BankingManagementApplication {

	public static void main(String[] args) {
		
		System.out.println("welcome to banking management application");
		SavingsAcoount saver1 = new SavingsAcoount();
		saver1.setSavingBalance(2000);
		saver1.calculateMonthlyInterest(4);    // calculating saving balance for saver 2
		SavingsAcoount saver2 = new SavingsAcoount();
		saver2.setSavingBalance(3000);
		saver2.calculateMonthlyInterest(4);   // calculating saving balance for saver 2
		
		System.out.println("after changing interest rate");
		 // calculating by changing interest rate
		
		saver1.calculateMonthlyInterest(5);    // calculating saving balance for saver 1
		saver2.calculateMonthlyInterest(5);     // calculating saving balance for saver 1

	}

}
