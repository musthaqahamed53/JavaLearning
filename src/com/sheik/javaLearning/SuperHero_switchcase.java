package com.sheik.javaLearning;

public class SuperHero_switchcase {

	
	//String hero="Captain America";
	String hero="Super man";
	
	public void heroOrNot() {
		
		switch (hero) {
		case "Iron Man":
			System.out.println("Iron man is SH");
			break;
		case "Super man":
			System.out.println("Super man is SH");
			break;
		case "Bat Man":
			System.out.println("Bat man is SH");
			break;
		case "Thor":
			System.out.println("Thor is SH");
			break;
		default:
			System.out.println(hero+" is not recognized");
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperHero_switchcase hero_switchcase = new SuperHero_switchcase();
		hero_switchcase.heroOrNot();
		
		
		
	}

}
