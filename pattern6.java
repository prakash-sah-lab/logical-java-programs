package com.logic_session;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) 
	{
		int arr[]=new int[6];
		Scanner sc =new Scanner(System.in);
		System.out.print("enter aaray element:");
		for(int i=0;i<arr.length;i++)
	     {
	    	 arr[i]=sc.nextInt();
	     }
		System.out.print("enter target:");
		int target=sc.nextInt();
		sum(arr,target);

	}
	public static void sum(int arr[],int num)
	{
		int c=0;
		for(int i=0;i<arr.length;i++)
	     {
			for(int j=i+1;j<arr.length;j++)
		     {
		    	if(arr[i]+arr[j]==num)
		    	{
		    		System.out.println(arr[i]+" + "+arr[j]+" = "+num+" : index are: "+i+"  ,"+j +" ");
		    		
		    		c++;
		    	}
		     }
	     }
		if(c==0)
		{
			System.out.println("not find sum");
		}
	}

}
