package com.logic_session;

import java.util.Scanner;

public class ContiniousSumArray {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
		boolean flag=false;
        int arr[]=new int[10];
        System.out.println("enter array element:");
        for(int i=0;i<10;i++)
        {
	      arr[i]=sc.nextInt();
        }
        System.out.print("enter key:");
        int key=sc.nextInt();
        
        for(int i=0;i<10;i++)
        {
        	int sum=0;
        	for(int j=i;j<10;j++)
        	{
        		sum+=arr[j];
        		if(sum==key)
        		{
        			flag=true;
        			System.out.println("sum of ");
        			for(int k=i;k<=j;k++)
        			{
        				System.out.print(arr[k]+" ");
        			}
        			System.out.print(" is :"+key);
        		}
        	}
        }
        if(flag==false)System.out.println("not found sum");

	}

}
