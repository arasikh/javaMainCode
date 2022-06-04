package com.syntax.java;

import java.util.Scanner;

public class forLoopExamples {

	public static void main(String[] args) {
		// I need to print numbers from 1 to 90
		
		for(int i=1; i<=90; i++) {
			System.out.println(i+" ");
		/*starting point
		 * ending point
		 * increment/decrement
		 */
		// I need numbers from 60 to 10
			
			for(int a=60; a>=10; a--) {
				System.out.println(a+" ");
			}
			
			//Task
			for(int b=1; b<=100; b++) {
				System.out.println(b+" ");
			}
			for(int c=1; c>=100; c++) {
				System.out.println(c);
			}
			for(int d=20; d>=1; d-=2) {
				System.out.println(d);
			}
			
			for(int e=20; e>=1; e--) {
				System.out.println(e);
				if (e % 2 ==0) {
					System.out.println(e+" ");
				}
			}
			/*int sumEven=0;
			int sumOdd=0;
			
			for(int i = 1; i<=70; i++) {
				if(i%2==0){
					sumEven+=i;
				}else {
					sumOdd=i;
				}
			}*/
		}

	}

}
