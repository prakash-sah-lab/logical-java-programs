package com.logic_session;

import java.util.Scanner;

public class NonZeroInteger {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int x=sc.nextInt();
		int y=x,count=0;
        int arr[]=new int[x];
        System.out.println("enter array element:");
        for(int i=0;i<x;i++)
        {
	      arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
	      if(arr[i]==0)
	      { 
	    	  count++;
	    	  for(int j=i;j<x-1;j++)
	          {
	  	      arr[j]=arr[j+1];
	          }
	    	  x--;
	    	  i--;
	      }
	      
        }
        System.out.println("non integer array:");
        if(count==y)System.err.println("all are zero");
        else
        {
        for(int i=0;i<x;i++)
        {
          System.out.print(arr[i]+ " ");       
          }
        }

	}

}
