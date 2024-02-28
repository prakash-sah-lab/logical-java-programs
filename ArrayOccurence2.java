package com.logic_session;

import java.util.Scanner;

public class ArrayOccurence2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
        int arr[]=new int[10];
        System.out.println("enter array element:");
        for(int i=0;i<10;i++)
        {
	      arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
        	int count=0;
         for(int j=0;j<10;j++)
         {
	       if(arr[i]==arr[j]&& i>j )
	       {
	    	   break;
	       }
	       if(arr[i]==arr[j] )
	       {
	    	   count++;
	    	   
	       }
        	 
         }
         if(count>0)
         {
             System.out.println(arr[i]+" present "+count+" times.");

         }
         
        }
        
	}

}
