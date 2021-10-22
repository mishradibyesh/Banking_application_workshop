package com.bl.bankingmanagementapplication;

public class SavingsAcoount {
	static  double annulInterestRate;     // to store annul interest rate
	private double savingBalance;          // to store amount the saver currently having 

	public void calculateMonthlyInterest() {                                // calculating monthly  interest
		savingBalance = savingBalance * annulInterestRate ;                // calculating saving balance by interest provides
		System.out.println("the new balace is now $"+savingBalance);
	}
	public static void modifyInterestRate(double annulInterestRate1 ) {    //setting annul interest rate
		annulInterestRate = annulInterestRate1 ;
	}

	public void setSavingBalance(double savingBalance) {   // setting saving balance private variable
		this.savingBalance = savingBalance;
	}

}
