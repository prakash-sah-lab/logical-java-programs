package com.logic_session;

import java.util.Scanner;

public class LoinearSearchMain1 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int []num=new int[10];
		System.out.println("Enter 10 number:");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("enter a number to search:");
		int numSearch=sc.nextInt();
		boolean flag=false;
		String str="";
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==numSearch)
			{
				flag=true;
				str+=(i+1)+" ";
			}
		}
		
		if(flag==true)
		{
			System.out.println("number is found at:"+str);
		}
		else 
		{
			System.out.println("element not found.");
		}

	}

}
