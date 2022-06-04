package com.syntax.java;

public class Clock {

	public static void main(String[] args) {
		// clock
		
		int hrs = 0;
		int min = 0;
		
		for(hrs=0; hrs <24; hrs++) {
			for(int min=0; min<60; min++) {
				System.out.println(hrs+":"+min);
			}
		}

	}

}
