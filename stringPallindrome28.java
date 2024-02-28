package com.logic_session;

import java.util.Scanner;

public class stringPallindrome28 
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
		
		String reverse=reverse1(str);
		System.out.println(reverse);
		if(str.equalsIgnoreCase(reverse))
		{
			System.out.println(str +" is pallindrome of "+reverse);
		}
		else
			System.out.println("not pallindrome");
	}

}
