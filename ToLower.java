package com.logic_session;

import java.util.Scanner;

public class ToLower {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		char[]ch=str.toCharArray();
		System.out.println("after lower case");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z') {
			 char ch1=(char) (ch[i]+32);
			System.out.print(ch1);
		}
			else 
			{
				System.out.print(ch[i]);
			}
				

	}
	}
}
