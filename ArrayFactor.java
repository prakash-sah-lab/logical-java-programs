package com.logic_session;

import java.util.Scanner;

public class ArrayFactor {

	public static void main(String[] args) 
	{
		int num[]=new int[6];
	     System.out.println("enter element:");
	     Scanner sc=new Scanner(System.in);
	     for(int i=0;i<num.length;i++)
	     {
	    	 num[i]=sc.nextInt();
	     }
   	  System.out.print("Factors of hundred");

	     for(int i=0;i<num.length;i++)
	     {
          if(100%num[i]==0)
          {
        	  System.out.print(num[i]+" ");
          }
         }
	}

}

