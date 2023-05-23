/*
 1. W.A.J.P to Take three numbers from the user and print the greatest
number
 */
package com.java;

import java.util.Scanner;

public class Assignment_question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Enter the value of A :");
		a = sc.nextInt();
		
		System.out.println("Enter the value of B :");
		b = sc.nextInt();
		
		System.out.println("Enter the value of C :");
		c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A is greater number");
		}
		else if (b>a && b>c)
		{
			System.out.println("B is greater number");
		}
		else
		{
			System.out.println("C is greater number");
		}
	}

}
