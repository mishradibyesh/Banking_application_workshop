package com.bl.bankingmanagementapplication;

public class BankingManagementApplication  {

	public static void main(String[] args) {

		System.out.println("welcome to banking management application");
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);

		SavingsAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();          // calculating saving balance for saver 1 for first month
		System.out.println("first month interest for saver 1 is $"+saver1.getSavingBalance());
		saver2.calculateMonthlyInterest();          // calculating saving balance for saver 2 for first month 
		System.out.println("first month interest for saver 2 is $"+saver2.getSavingBalance());

		System.out.println("#############################################");
		
		SavingsAccount.modifyInterestRate(0.05);  // changing the interest rate for 2nd month
		
		saver1.calculateMonthlyInterest();      // calculating saving balance for saver 1 for 2nd month
		System.out.println("second month interest for saver 1 is $"+saver1.getSavingBalance());
		saver2.calculateMonthlyInterest();         // calculating saving balance for saver 2 for 2nd month
		System.out.println("second month interest for saver 2 is $"+saver2.getSavingBalance());


	}

}
