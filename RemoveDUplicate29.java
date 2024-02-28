package com.logic_session;

import java.util.Scanner;

public class RemoveDUplicate29 
{

	public static String removeDuplicate(String str)
	{
		char[] ch=str.toCharArray();
		String res="";
		int l=ch.length;
		for( int i=0;i<l;i++)
		{
		for(int j=i+1;j<l;j++) 
		{
		 if(ch[i]==ch[j])
		 {
			 
			 for(int k=i;k<l-1;k++) 
			 {
			 ch[k]=ch[k+1];
			 
			 }
	          l--;
	          --i;
		 }
		}
		
		}
		for(int i=0;i<l;i++)
		{
			res+=ch[i];
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		System.out.println(removeDuplicate(str));
	}

}
