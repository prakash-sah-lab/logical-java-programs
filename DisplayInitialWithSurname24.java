package com.logic_session;

import java.util.Scanner;

public class DisplayInitialWithSurname24 
{
	public static void main(String[] args) 
	{
			Scanner sc =new Scanner(System.in);
			System.out.println("enter string:");
			String str=sc.nextLine();
			String[] str1=str.split(" ");
			System.out.println();
			int len=str1.length;
			for(int i=0;i<len;i++)
			{
				if(i==len-1)
				{
					System.out.println(str1[i]);
				}
				else
				{
					char ch=str1[i].charAt(0);
					if(ch>=97 && ch<=122)ch=(char)(ch-32);
					System.out.print(ch+" ");
				}
				
			}

		}


	}


