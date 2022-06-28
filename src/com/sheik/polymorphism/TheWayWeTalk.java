package com.sheik.polymorphism;

public class TheWayWeTalk {

	
	// Eg for Overloading
	
	public void talk(Parents styleOfTalking) {
		System.out.println("Polite, Respectful");
	}
	
	public void talk(Partner styleOfTalking) {
		System.out.println("Love, Romantic, Mixed");
	}
	
	public void talk(Boss styleOfTalking) {
		System.out.println("Nothing personal");
	}
	
	public void talk(Son styleOfTalking) {
		System.out.println("Polite, Respectful");
	}
	
	public static void main(String[] args) {
		
		TheWayWeTalk talkObj = new TheWayWeTalk();
		
		Parents pa = new Parents();
		talkObj.talk(pa);   // this is early binding as we already know which it'll call while in compile time itself
		
		Boss boss = new Boss();
		talkObj.talk(boss);
		
		Partner partner = new Partner();
		talkObj.talk(partner);
		
		Son son = new Son();
		talkObj.talk(son);
		
		
		
		
	}

}
