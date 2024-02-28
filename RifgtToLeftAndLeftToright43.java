package com.logic_session;

import java.util.Scanner;

public class RifgtToLeftAndLeftToright43 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.nextLine();
		System.out.println("enter first string");
		String s2=sc.nextLine();
		String str="";
		int i,j;
		if(s1.length()-s2.length()>=0) 
		{
		for( i=0,j=s2.length()-1;i<s1.length()&&j>=0;i++,j--)
		{
			str+=(char)s1.charAt(i)+""+(char)s2.charAt(j);
		}
		
		
		System.out.println(str+""+s1.substring(i));
		}
		else
		{
			for( i=0,j=s2.length()-1;i<s1.length()&&j>=0;i++,j--)
			{
				str+=(char)s1.charAt(i)+""+(char)s2.charAt(j);
			}
			
			
			System.out.println(str+""+s2.substring(j));
		}
	}

}
