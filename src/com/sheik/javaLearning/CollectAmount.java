package com.sheik.javaLearning;

public class CollectAmount {

	public Integer collectedAmount = 1000;
	
	public Integer collectAmountAndGiveItToMe() {
		
		System.out.println("Daddy have collected Rs. "+collectedAmount+ " and sent it to you");
		
		return collectedAmount;
	}
	
		
	public static void main(String[] args) {
		// Return Types

		CollectAmount amount= new CollectAmount();
		Integer amountNew = amount.collectAmountAndGiveItToMe();
		System.out.println("Got the amount son Rs. "+ amountNew);
	}

}
