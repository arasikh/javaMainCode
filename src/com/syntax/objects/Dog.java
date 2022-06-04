package com.syntax.objects;

import java.util.Scanner;

public class Dog {

	String name;
	int age;
	double weight;
	String colour;
	double height;
	String breed;

	// how that object behave
	void bark() {
		System.out.println("Dog barks");
	}

	void walks() {
		System.out.println("Dog walks");
	}

	void eat() {
		System.out.println("Dogs eat bones");

	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	scanner.next();
	Dog jimmy = new Dog();//new Dog() how we create an object
	jimmy.name="jimmy";
	jimmy.age=6;
	jimmy.weight=16;
	jimmy.color="pink";
	jimmy.height=2.6;
	jimmy.breed="German";
	
}
}