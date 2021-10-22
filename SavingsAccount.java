package com.bl.bankingmanagementapplication;

public class SavingsAccount {
	static  double annulInterestRate;     
	private double savingBalance;          

	// initializing the value of saving balance 

	public SavingsAccount (int savingBalance) {             
		this.savingBalance = savingBalance ;
	}

	// calculating monthly  interest

	public double calculateMonthlyInterest() {    
		double annInterest = (savingBalance * annulInterestRate/12) ;             // calculating saving balance by interest provides
		savingBalance = savingBalance + annInterest;
		return savingBalance;
	}

// getter for saving balance
	public double getSavingBalance() { 
		return savingBalance;
	}


	//setting annul interest rate
	public static void modifyInterestRate(double annulInterestRate1 ) {    
		annulInterestRate = annulInterestRate1 ;
	}

}
