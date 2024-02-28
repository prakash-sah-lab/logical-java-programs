package com.logic_session;

import java.util.Scanner;

public class ArrayAscen {

	public static void main(String[] args) 
	{
     int num[]=new int[6];
     int num1[]=new int[6];
     System.out.println("enter an array:");
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<num.length;i++)
     {
    	 num[i]=sc.nextInt();
     }
     for(int i=0;i<num.length;i++)
     {
    	 for(int j=i+1;j<num.length;j++)
    	 {
    		 if(num[j]<num[i])
    		 {
    			 num1[i]=num[i];
    			 num[i]=num[j];
    			 num[j]=num1[i];
    		 }
    		 
    	 }
     }
     for(int i=0;i<num.length;i++)
     {
     System.out.print(num[i]+" ");    
      }
	}

}
