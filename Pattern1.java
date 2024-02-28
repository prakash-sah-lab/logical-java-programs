package com.logic_session;

import java.util.Scanner;

/*
 * a a a a
 * a a a a
 * a a a a
 * a a a a
 */

public class Pattern1 {

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
			System.out.print("a ");
		}
		System.out.println();
	}
	}

}
