package com.logic_session;

import java.util.Scanner;

public class ToUpper {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		char[]ch=str.toCharArray();
		System.out.println("After upper case");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z') {
			 char ch1=(char) (ch[i]-32);
			System.out.print(ch1);
		}
			else 
			{
				System.out.print(ch[i]);
			}
				

	}
		
	}

}
