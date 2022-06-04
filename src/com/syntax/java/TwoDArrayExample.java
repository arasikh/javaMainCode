package com.syntax.java;

public class TwoDArrayExample {

	public static void main(String[] args) {
		// created 2d array of states
		// 1 array ->NY ->all cities of NY state
		//2 array ->CA-> all cities of FL state
		//3 array->FL-> all cities of FL state
		//4 array ->VA-> all cities of VA state
		
		String[][] usa= {
				
				{"New York","Albany","Buffalo"},
				{"Los Angeles","San Francisco", "San Jose","San Diego","Redding"},
				{"Miami","Orlando","Niceville","Tampa"},
				{"Mclean","Richmond","Lessburg"}

};
System.out.println(usa[1][2]);
System.out.println("I want to go to "+usa[2][0]);
System.out.println("total number of 1d arrays in array usa = "+usa.length);

//i want to see how many elements inside my first array
int elem1array=usa[0].length;
System.out.println("3 of elements in 1 array = "+elem1array);
}
	
}