/*
 Assignment_question3
 W.A.J.P to find factorial for Given Number.
 */
package com.java;

import java.util.Scanner;

public class Assignment_question3 {
	public static void main(String[] args) {
		int fact = 1;
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculate the Factorial Number of :");
		n = sc.nextInt();
		
		for (int i = 1; i <=n ; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial number of "+n+ " is "+fact);
	}

}
