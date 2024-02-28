package com.logic_session;

import java.util.Scanner;

public class FrequencyOfLetterInString39 
{
	public static int noofLetter(String Str)
	{
		int count=0;
		count=Str.length()+1;
		return count;
		
	}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		int maxNoLetter=0;
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
		 maxNoLetter=noofLetter(str1[i].toLowerCase());
		System.out.println("Number of letter in "+str1[i]+" is : "+maxNoLetter);
		
		}
		
		
	}

}
