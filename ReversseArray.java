package com.logic_session;

import java.util.Scanner;

public class ReversseArray {

	public static void main(String[] args) {
    int num[]=new int[6];
    int num1[]=new int[6];
   Scanner sc =new Scanner(System.in);
    System.out.println("enter an array elements:");
    
    for(int i=0;i<num.length;i++)
    {
    	num[i]=sc.nextInt();
    }
    
    for(int j=0,i=num.length-1;i>=0;j++)
    {
    	num1[j]=num[i];
    	i--,
    }
    System.out.println("Display array:");
    for(int i=0;i<num.length;i++)
    {
    System.out.print(num[i]+" ");    
     }
      System.out.println("\n Display reverse.");
	for(int i=0;i<num1.length;i++)
    {
      System.out.print(num1[i] +" ");    
      }

	}

}
