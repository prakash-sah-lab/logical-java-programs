package com.logic_session;

import java.util.Scanner;

public class TwoArrayEle {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int num[][]=new int[4][3];
		System.out.println("enter array element:");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display array element");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}

}
