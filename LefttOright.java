package com.logic_session;

import java.util.Scanner;

public class LefttOright {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.nextLine();
		System.out.println("enter first string");
		String s2=sc.nextLine();
		String str="";
		String con=s1.concat(s2);
		int l= s1.length()+s2.length();
		
		for(int i=0;i<l;i++,l--)
		{
			str+=con.charAt(i);
			if(i==l-1)break;
			str+=con.charAt((l-1));
		}
		System.out.println(str);
	}

}
