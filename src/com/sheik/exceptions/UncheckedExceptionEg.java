package com.sheik.exceptions;

public class UncheckedExceptionEg {

	//Unchecked exceptions or run time exceptions
	
	static String name1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(name1.length());
		
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "com.sheik.exceptions.UncheckedExceptionEg.name1" is null
	}

}
