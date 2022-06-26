package com.sheik.inheritance;

public class Bmw extends Car {
	//bmw is a child of car
	//car is a parent of bmw
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bmw bmw = new Bmw();
		bmw.engine(); 
		System.out.println("Wheel count: "+bmw.wheels);
		//so we acquired the property of other class without writing the data and method in this class
		
	}

}
