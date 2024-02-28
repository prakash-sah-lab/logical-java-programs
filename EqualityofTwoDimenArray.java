package com.logic_session;

import java.util.Arrays;
import java.util.Scanner;
class finequi
{
	public static boolean equi(int arr1[][],int arr2[][]) 
	{
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<2;j++) 
			{
				
			   boolean flag=false;
		
		       for(int k=0;k<2;k++)
		        {
			      for(int l=0;l<2;l++)
			       {
				    if(arr1[i][j]==arr2[k][l])
				    {
					flag=true;
				    }
			       }
		         }
		        if(flag==false)
		        {
		     	System.out.println("not equal");
			    return false;
		        }
	          }
           }
		return true;
	}
}

public class EqualityofTwoDimenArray {

	public static void main(String[] args) 
	{
		int arr1[][]=new int[2][2];
		int arr2[][]=new int[2][2];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array1 element:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter array2 element:");

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display array1 element");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Display array2 element");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		if(finequi.equi(arr1,arr2))
			System.out.println("both array are equal");
		
	}

}

	

