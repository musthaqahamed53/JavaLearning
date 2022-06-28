package com.sheik.polymorphism;

public class Son extends Parents{
	
	@Override
	public void marriage() {
		System.out.println("My marriage my rules");
	}
	
	public static void main(String[] args) {
	
		Parents parents = new Son(); //parentclass ref = new childclass();
		//dynamic polymorphism -. parent class  reference = child class object
		//or runtime polymorphism
		
		parents.properties();
		parents.marriage();
	}
}
