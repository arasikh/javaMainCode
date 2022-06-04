package com.bro.java;
import java.util.Scanner;
public class broCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("what is your name?");
		String name = scanner.next();
		int age = scanner.nextInt();
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old.");
	}

}
