package com.sheik.javaLearning;

public class NoArgConstructor_Employee {

	
	
	int emp_id;
	String emp_name;
	
	//define a no argument constructor or Non parameterized constructor
	
	NoArgConstructor_Employee(){
		emp_id=1;
		emp_name="Sheik";		
		System.out.println("Employee object is created");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NoArgConstructor_Employee argConstructor_Employee = new NoArgConstructor_Employee();
		
		
	}

}
