package com.sheik.javaLearning;

public class ParameterizedConstructor_Animal {

	String animal_name;
	String animal_type;
	
	ParameterizedConstructor_Animal(String name,String type) { // this is the parameterized constructor
		animal_name=name;
		animal_type=type;
		
	}
	
	public void sayAboutAnimal() {
		System.out.println("Animal is "+animal_name+"\nType is "+animal_type);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParameterizedConstructor_Animal animal = new ParameterizedConstructor_Animal("Duck", "Omnivores");
		animal.sayAboutAnimal();
		
		ParameterizedConstructor_Animal animal2 = new ParameterizedConstructor_Animal("Bear", "Omnivores");
		animal2.sayAboutAnimal();
	}

}
