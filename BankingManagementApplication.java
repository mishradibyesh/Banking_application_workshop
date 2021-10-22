package com.bl.bankingmanagementapplication;

public class BankingManagementApplication extends SavingsAcoount {

	public static void main(String[] args) {

		System.out.println("welcome to banking management application");
		SavingsAcoount saver1 = new SavingsAcoount();
		saver1.setSavingBalance(2000);
		modifyInterestRate(4);
		saver1.calculateMonthlyInterest();// calculating saving balance for saver 1
		modifyInterestRate(5);
		saver1.calculateMonthlyInterest();// calculating saving balance for saver 1 for next month

		SavingsAcoount saver2 = new SavingsAcoount();
		saver2.setSavingBalance(3000);    
		modifyInterestRate(4);
		saver2.calculateMonthlyInterest();  // calculating saving balance for saver 2
		modifyInterestRate(5);               
		saver2.calculateMonthlyInterest();// calculating saving balance for saver 2 for 2nd month


	}

}
