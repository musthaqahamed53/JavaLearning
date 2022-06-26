package com.sheik.javaLearning;

public class Coffee_if_elseif {

	//datatype boolean - it'll return true or false
	
	boolean isCupEmpty=false; //default return type false
	//boolean isCupEmpty=true;
	
	
	public static void main(String[] args) {
		
		Coffee_if_elseif coffee_if_elseif = new Coffee_if_elseif();
		
		if(coffee_if_elseif.isCupEmpty) {
			System.out.println("Fill the cup");
		}
		else {
			System.out.println("The cup is full. Drink the coffee");
		}
	}

}
