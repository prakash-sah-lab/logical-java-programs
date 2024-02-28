package com.logic_session;
/* wap to stroe all the elements and display only the words which are pallindrome*/

import java.util.Scanner;

public class PallindromeWordInString37
{
	public static String reverse1(String s1)
	  {
		  
	      
	      	String s2="";
	      	for(int j=s1.length()-1;j>=0;j--)
	      	{
	      		char ch=s1.charAt(j);
	      		s2+=ch;
	      	}
	      	
		return s2;
		  
	  }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		String pallWord="";
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
		String reverse=reverse1(str1[i]);
		if(str1[i].equalsIgnoreCase(reverse))
		{
			pallWord+=str1[i]+" ";
		}
		}
		
		System.out.println("pallindrome word in string :"+pallWord);
		
	}

}
