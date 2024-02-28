package com.logic_session;

import java.util.Scanner;

public class StringInAlphabeticalOrder30 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		String str1=str.toUpperCase();
		char[] ch=str1.toCharArray();
		String res="";
		int i;
		for( i=0;i<ch.length-1;i++)
		{
		for(int j=i+1;j<ch.length;j++) 
		{
		 if(ch[i]>ch[j])
		 {
			 char temp=ch[i];
			 ch[i]=ch[j];
			 ch[j]=temp;
		 }
		}
		res+=ch[i];
		}
		res+=ch[i];
		System.out.println(res.charAt(0)+res.substring(1).toLowerCase());

	}

}
