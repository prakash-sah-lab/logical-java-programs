package com.logic_session;

import java.util.Scanner;

public class DisplayInitial35 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		
		String[] str1=str.split(" ");
		
		System.out.println();
		for(int i=0;i<str1.length;i++)
		{
			char ch=str1[i].charAt(0);
			if(ch>=97 && ch<=122)ch=(char)(ch-32);
			System.out.print(ch+" ");
		}

	}

}
