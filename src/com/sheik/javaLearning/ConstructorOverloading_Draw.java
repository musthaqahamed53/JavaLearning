package com.sheik.javaLearning;

public class ConstructorOverloading_Draw {

	String draw;
	
	ConstructorOverloading_Draw() {
		System .out.println("Draw object created");
	}
	
	ConstructorOverloading_Draw(String toDraw) {
		draw=toDraw;
		System.out.println("Drawing "+ toDraw);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverloading_Draw constructorOverloading_Draw = new ConstructorOverloading_Draw();
		ConstructorOverloading_Draw constructorOverloading_Draw1 = new ConstructorOverloading_Draw("Circle");
		
		//there needs to be a change in passing parameter for constructor overloading
	}

}
