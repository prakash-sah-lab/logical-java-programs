package com.logic_session;

import java.util.Scanner;

public class ArrayOccurance {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
        Integer arr[]=new Integer[10];
        System.out.println("enter array element:");
        for(int i=0;i<10;i++)
        {
	      arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
        	int count=1;
         for(int j=i+1;j<10;j++)
         {
	       if(arr[i]==arr[j] && arr[j]!=null )
	       {
	    	  
	    	   count++;
	    	   arr[j]=null;
	       }
        	 
         }
         if(arr[i]!=null)
         {
         System.out.println(arr[i]+" present "+count+" times.");
         }
        }
        
	}

}
