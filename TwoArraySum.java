package com.logic_session;

import java.util.Scanner;

public class TwoArraySum {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int arr1[][]=new int[4][3];
		int arr2[][]=new int[4][3];
		int arr3[][]=new int[4][3];

		System.out.println("enter array1 element:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter array2 element:");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display array1 element");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Display array2 element");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Display sum:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr3[i][j]=arr2[i][j] + arr1[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
