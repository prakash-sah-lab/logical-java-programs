package com.logic_session;

import java.util.Scanner;

public class DuplicateCharRemove29 
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
			 
			 char ch1=ch[i];
			 for(int k=0;k<l;k++)
			 {
				 if(ch[k]==ch1)
				 {
					 for(int m=k;m<l-1;m++) 
					 {
					 ch[m]=ch[m+1];
					 
					 }
			          l--;
			         --k;
				 }
			 }
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
