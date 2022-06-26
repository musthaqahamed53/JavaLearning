package com.sheik.javaLearning;

public class StaticVariable {
	//eg to show static variable are shared among objects
	
	//static variable is nothing but a variable which additionally has a keyword called static
	
	static int accountBalance=0;
	String depositedBy;
	
	public static void main(String[] args) {
		
		StaticVariable obj1 = new StaticVariable();
		obj1.accountBalance=1000;
		obj1.depositedBy="Sheik";
		
		
		
		StaticVariable obj2 = new StaticVariable();
		obj2.accountBalance=2000;
		obj2.depositedBy="Musthaq";

		System.out.println("Object1 integer: "+ obj1.accountBalance);
		System.out.println("Object1 string: "+ obj1.depositedBy);
		System.out.println("Object2 integer: "+ obj2.accountBalance);
		System.out.println("Object2 string: "+ obj2.depositedBy);
	//only single copy of the static variable is created and shared among all the instances of class
	}

}
