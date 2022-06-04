package com.syntax.java;

public class ArrayDisneyExample {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		String[] disney= {"Shrek", "Elsa","Goofy","Mulan"};
		System.out.println(disney[1]);
		for(int i=0; i<disney.length; i++) {
			System.out.println(disney[i]);
		}
		for(String character:disney) {
			if(character.equalsIgnoreCase("Mulan")) {
				System.out.println(character+"This is my favotire character");
			}else {
				System.out.println(character+" ");
			}
			System.out.println(character+" ");
		}
}
}
