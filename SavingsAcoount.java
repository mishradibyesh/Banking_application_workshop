package com.bl.bankingmanagementapplication;

public class SavingsAcoount {
static  double annulInterestRate;     // to store annul interest rate
private double savingBalance;          // to store amount the saver currently having 

public void calculateMonthlyInterest() {    // calculating monthly  interest
	SavingsAcoount saver = new SavingsAcoount();
	annulInterestRate =  saver.modifyInterestRate(4);     //setting interest rate by calling method interest rate 
	savingBalance = savingBalance * annulInterestRate ; // calculating saving balace by interest provides
    System.out.println("the new balace is now $"+savingBalance);
}
public static double modifyInterestRate(double annulInterestRate ) {
	annulInterestRate = annulInterestRate ;
			return annulInterestRate;
}
public void getSavingBalance(double savingBalance) {   // setting saving balance private variable
	this.savingBalance = savingBalance;
}

}
