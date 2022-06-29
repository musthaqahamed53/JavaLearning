package com.sheik.strings;

public class StringBufferEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = new String("Sheik");
		System.out.println("Appended string: "+string.concat(" Musthaq"));
		System.out.println("Original: "+string);
		
		StringBuffer buffer = new StringBuffer("Maddy");
		System.out.println("Appended stringBuffer: "+buffer.append(" Returns"));
		System.out.println("Original Buffer: "+buffer);
		
		
		/*
		 * Output Appended string: Sheik Musthaq 
		 * Original: Sheik 
		 * Appended stringBuffer: Maddy Returns 
		 * Original Buffer: Maddy Returns
		 */
		//so string buffer is MUTABLE and String is IMMUTABLE
		
		
		
	}

}
