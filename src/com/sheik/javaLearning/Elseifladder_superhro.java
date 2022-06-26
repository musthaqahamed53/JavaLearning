package com.sheik.javaLearning;

public class Elseifladder_superhro {

	//String myHeroName="Captain America";
	String myHeroName="Super man";
	
	public void superHeroGuesser() {
		
		if(myHeroName.equals("Iron Man")) {
			System.out.println("You thought about Iron Man");
		}
		else if(myHeroName.equals("Super man")) {
			System.out.println("You thought about Superman");
		}
		else if(myHeroName.equals("Thor")) {
			System.out.println("You thought about Thor");
		}
	
		else {
			System.out.println("Sorry I cant guess");
		}
	}
	
	public static void main(String[] args) {
		
	Elseifladder_superhro elseifladder_superhro = new Elseifladder_superhro();
	
	elseifladder_superhro.superHeroGuesser();
		
		
		
		
		
		
		
		
		
	}

}
