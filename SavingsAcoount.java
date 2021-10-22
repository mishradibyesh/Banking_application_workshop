package com.bl.bankingmanagementapplication;

public class SavingsAcoount {
static  double annulInterestRate;     // to store annul interest rate
private double savingBalance;          // to store amount the saver currently having 

public void calculateMonthlyInterest(double annulInterestRate) {    // calculating monthly  interest
	annulInterestRate = modifyInterestRate(annulInterestRate);
	savingBalance = savingBalance * annulInterestRate ; // calculating saving balance by interest provides
    System.out.println("the new balace is now $"+savingBalance);
}
public static double modifyInterestRate(double annulInterestRate ) {
	
	return annulInterestRate;
}

public void setSavingBalance(double savingBalance) {   // setting saving balance private variable
	this.savingBalance = savingBalance;
}

}
