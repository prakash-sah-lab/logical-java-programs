package com.logic_session;

import java.util.Scanner;

//wrtie a prog to reverse a index.
public class ArrayIndexRev {

	public static void main(String[] args) {
		int num[]=new int[6];
	   Scanner sc =new Scanner(System.in);
	    System.out.println("enter an array elements:");
	    
	    for(int i=0;i<num.length;i++)
	    {
	    	num[i]=sc.nextInt();
	    }
	    System.out.println("print array:");
	    for(int i=0;i<num.length;i++)
	    {
	    	System.out.print(num[i]+" ");
	    }
	    for(int i=0;i<num.length;i++)
	    {
	    	int rev=0;
	    	int n=num[i];
	    	while(n!=0)
	    	{
	    		rev=(rev*10)+n%10;
	    		n/=10;
	    	}
	    	num[i]=rev;
	    }
	    System.out.println("reverse");
	    for(int i=0;i<num.length;i++)
	    {
	    	System.out.print(num[i]+" ");
	    }
	}

}
