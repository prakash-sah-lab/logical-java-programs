package com.logic_session;
/*
 * a a a a
   b b b b
   c c c c
   d d d d
 */

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int row=sc.nextInt();
		System.out.print("Enter number of rows:");
		int col=sc.nextInt();
	for(int i=1,c='a';i<=row;i++)
	{ 
		for(int j=1;j<=col;j++)
		{  
			System.out.print((char)c+" ");
		}
		System.out.println();
		c++;
	}
	}

}
