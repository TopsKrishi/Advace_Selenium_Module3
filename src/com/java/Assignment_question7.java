/*
 Assignment_question7
 W.A.J.P to Print pattern Given Below.
1)
1
12
123
1234
12345
 */
package com.java;

public class Assignment_question7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
	
	}

}
