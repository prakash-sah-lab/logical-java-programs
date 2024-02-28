package com.logic_session;

import java.util.Scanner;

public class ArraySumTriplet {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
			boolean flag=false;
	        int arr[]=new int[7];
	        System.out.println("enter array element:");
	        for(int i=0;i<7;i++)
	        {
		      arr[i]=sc.nextInt();
	        }
	        System.out.print("enter key:");
	        int key=sc.nextInt();
	        System.out.println("sum of "+key+ " are:");
	        for(int i=0;i<7;i++)
	        {
	        	
	        	for(int j=i+1;j<7;j++)
	        	{
	        		
	        		for(int k=j+1;k<7;k++)
	        		{
	        		
	        		if(arr[i]+arr[j]+arr[k]==key)
	        		{
	        			flag=true;
	                   System.out.println("[ "+arr[i]+" , "+arr[j]+" , "+arr[k]+" ]");
	        		}
	        	}
	        }
	        

}
	        if(flag==false)System.out.println("not found ");
	}
}
