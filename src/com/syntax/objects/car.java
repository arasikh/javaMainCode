package com.syntax.objects;

public class car {
	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int HP;
	
	void MoveForward() {
		System.out.println("car is moving forward");
	}
	
	void reverse() {
		System.out.println("Moving backwards");
	}
	
	public static void main(String[] args) {
		car bmw = new car();
		bmw.model="x6";
		bmw.make="bmw";
		bmw.color="black";
		bmw.year=2022;
		bmw.typeOfEngine="v8";
		bmw.HP=500;
		System.out.println(bmw.model);
		bmw.MoveForward();
		bmw.reverse();
		
		car lexus = new car();
		lexus.make="lexus";
		lexus.model="LFA";
		lexus.color="white";
		lexus.MoveForward();
		
	}
}