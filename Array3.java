package com.logic_session;
/*
 * 
 */

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) 
	{
		String str[]=new String[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter name");
		for(int i=0;i<5;i++)
		{
			str[i]=sc.nextLine();
		}
		
		System.out.print("enter name to search:");
		String name=sc.nextLine();
		boolean flag = false;
		for(int i=0;i<5;i++)
		{
			if(str[i].equalsIgnoreCase(name))
			{
				System.out.println("found at index"+i);
				flag = true;
				return;
			}
		}
		if(flag==false)
		{
			System.out.println("not found");
		}
	}

}
