package com.sheik.javaLearning;

public class StaticBlock {

	//static block is nothing but a block of code which additionally has a keyword called static
	static {
		System.out.println("inside Static block 1");
	}
	static {
		System.out.println("inside static block 2");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Inside main method");

	}

}
