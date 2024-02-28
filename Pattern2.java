package com.logic_session;
/*
 * a b c d
   a b c d
   a b c d
   a b c d
 */

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int row=sc.nextInt();
		System.out.print("Enter number of rows:");
		int col=sc.nextInt();
	for(int i=1;i<=row;i++)
	{
		for(int j=1,c='a';j<=col;j++)
		{  
			
			System.out.print((char)c++ +" ");
		}
		System.out.println();
	}
	}

}
