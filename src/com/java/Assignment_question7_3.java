/*
 Assignment_question7_3
	1
   2 2
  3 3 3
 4 4 4 4
 */
package com.java;

import java.util.Iterator;

public class Assignment_question7_3 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++)
		{
			for (int k = i; k <= 3; k++) 
			{
				System.out.print(" ");
			}
				for (int j = 1; j < 2*i; j++)
				{
					System.out.print(i);
				}
				
				System.out.println();
			
		}
	}
	

}
