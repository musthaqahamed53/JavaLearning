package com.sheik.javaLearning;

public class StaticMethod {

	public static void method1() {
		System.out.println("Static method");
	}
	public void nonStatic() {
		System.out.println("Non static method");
		method1(); //calling static method from non static method
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StaticMethod methods = new StaticMethod();
		//methods.method1();
		method1(); //its static so we can access it without creating an object
		
		//nonStatic(); //Cannot make a static reference to the non-static method nonStatic() from the type StaticMethod
		StaticMethod nonStaticvariable = new StaticMethod();
		nonStaticvariable.nonStatic();
	}

}
