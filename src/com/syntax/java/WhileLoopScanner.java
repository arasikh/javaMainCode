package com.syntax.java;

import java.util.Scanner;

public class WhileLoopScanner {

	public static void main(String[] args) {
		// take the input from the user using scanner
		// increment by 2 print it
		//if value is 10 terminate the program
		
		
		int x=0;
		Scanner scanner = new Scanner(System.in);
		while(x!=10) {
			System.out.println("Please enter the number");
			x=scanner.nextInt();
			System.out.println(x+2);
		}scanner.close();
	}

}
