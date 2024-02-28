package com.logic_session;
/*
 * a b a b
   a b a b
   a b a b
   a b a b
 */

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int row=sc.nextInt();
		System.out.print("Enter number of rows:");
		int col=sc.nextInt();
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=col;j++)
		{  
			if(j%2==0)System.out.print("b ");
			else System.out.print("a ");
		}
		System.out.println();
	}
	}

}
