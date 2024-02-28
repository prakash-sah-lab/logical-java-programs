package com.logic_session;

import java.util.Scanner;

public class LeftShift {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num[]= {11,22,33,44,55};
		System.out.println("enter key:");
		int key=sc.nextInt();
		int x=0;
		for(int i=key;i<=num.length+1;i++)
		{
			
			if(i>num.length-1)
			{
				System.out.println(num[x++]);
			}
			else
			{
				System.out.println(num[i]);
			}
		}

	}

}
/*
 for(int j=0;j<key;j++)
 {
 int temp=a[0];
 for(int i=1;i<a.length;i++)
 {
 a[i-1]=a[i];
 }
 a[a.lenth-1]=temp;
 }
 
 display the array
 */
