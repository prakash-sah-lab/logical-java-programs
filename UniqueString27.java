package com.logic_session;

import java.util.Scanner;

public class UniqueString27 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		String str1=str.toLowerCase();
		char[] ch=str1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.err.println("Not a unique string.");
				return;
			}
		}
		System.out.println("Unique string.");
	}

}
