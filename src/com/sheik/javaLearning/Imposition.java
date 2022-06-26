package com.sheik.javaLearning;

public class Imposition {
	// print "I can program! I can learn!" 25 times
	
	/*
	 * while (condition) { 
	 * // code block to be executed 
	 * }
	 * 
	 *  eg.
	 *  int i = 0;
		while (i < 5) {
  		System.out.println(i);
  		i++;
		}
	 */
	/*
	 * do { 
	 * // code block to be executed 
	 * } while (condition);
	 */
	
	
	/* for( initialization; condition;increment/decrement)
	 * for (int i = 0; i < 5; i++) { 
	 * System.out.println(i); 
	 * }
	 */
	
	/*foe each loop
	 * for (type variableName : arrayName) {
	 *  // code block to be executed 
	 *  }
	 */
	/*
	 * String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; 
	 * for (String i : cars) {
	 * System.out.println(i); 
	 * }
	 */
	
	String line = "I can program! I can learn!";
	String[] cars = {"volvo","bmw","benz","honda","skoda"};
	
	
	public static void main(String[] args) {
		
		Imposition imposition = new Imposition();
		
		System.out.println("While loop");
		int i=0;
		int count=0;
		while(i<25) {
			count++;
			System.out.println(count+". " + imposition.line);
			i++;
		}
		
		
		System.out.println("\ndo While loop");
		int j=0;
		int countdo=0;
		do {
			countdo++;
			System.out.println(countdo+". " + imposition.line);
			j++;
		}while (j<25);
		
		System.out.println("\nFor loop");
		int countfor=0;
		for(int k=0;k<25;k++) {
			countfor++;
			System.out.println(countfor+". " + imposition.line);
		}
		
		
		System.out.println("\nFor each loop");
		int countforeach=0;
		for (String carname : imposition.cars) {
			countforeach++;
			System.out.println(carname +countforeach+". " + imposition.line);
			
		}
		
		
		
		
	}

}
