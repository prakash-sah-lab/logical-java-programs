package com.logic_session;
/*
 * a
   a b
   a b c
   a b c d
   a b c d e
 */
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int row=sc.nextInt();
		int col=1;
	for(int i=1;i<=row;i++)
	{ 
		int c='a';
		for(int j=1;j<=col;j++)
		{  
			System.out.print((char)c+" ");
			c++;
		}
		System.out.println();
		col++;
	}
	}

}
