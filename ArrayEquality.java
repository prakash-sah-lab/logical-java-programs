package com.logic_session;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquality {

	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
		
        Integer arr1[]=new Integer[10];
        Integer arr2[]=new Integer[10];
        System.out.println("enter array1 and array2 element:");
        for(int i=0;i<10;i++)
        {
        System.out.println(" array1 index "+i+":");
	      arr1[i]=sc.nextInt();
	      System.out.println(" array2 index "+i+":");
	      arr2[i]=sc.nextInt();
        }
        System.out.println("array1:");
        for(int i=0;i<10;i++)
        {
        System.out.print(arr1[i]);
	     
        }
        System.out.println("Array2:");
        for(int i=0;i<10;i++)
        {
        System.out.print(arr2[i]); 
        }
        if(Arrays.equals(arr1, arr2))
        {
        	System.out.println("Both array are equal");
        }
        else
        {
        	System.out.println("not equal");
        }
        sc.close();
        
	}

}
