package com.sheik.javaLearning;

public class BankAccounts {

	//data
	
	Long accountNumber = 1234567890l;  //long data type should be appended with "l" at the end
	
	String holderName = "Sheik Musthaq Ahamed";
	
	Integer accountBalance = 5000;
	
	
	
	public void getBalance() { //this method acts on the data called accountbalance
		
		System.out.println("The balance is "+accountBalance);
	}
	
	
	
	public static void main(String[] args) {
		
		//to access the getBalance() we must create object for the bankAccount class
		BankAccounts accounts = new BankAccounts();
		
		accounts.getBalance();
		
		

	}

}
