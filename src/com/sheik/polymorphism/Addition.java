package com.sheik.polymorphism;

public class Addition {

	int add(int n1, int n2) {
		return n1+n2;
	}
	
	int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	double add(double n1, double n2) {
		return n1=n2;
	}
	public static void main(String[] args) {
		
		Addition addition = new Addition();
		
		System.out.println("Sum of two numbers: "+addition.add(20,21));
		
		System.out.println("Sum of two numbers: "+addition.add(25.55,28.65));
		
		System.out.println("Sum of two numbers: "+addition.add(20,21,58));
	}

}
