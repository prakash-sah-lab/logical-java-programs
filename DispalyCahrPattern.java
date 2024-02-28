package com.logic_session;

import java.util.Scanner;

public class DispalyCahrPattern {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}

	}

}
