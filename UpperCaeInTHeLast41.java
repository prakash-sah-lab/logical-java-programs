package com.logic_session;

import java.util.Scanner;

public class UpperCaeInTHeLast41 
{
	public static String removeUpper(String str)// Prakash Kumar 
	{
		String strupp="";
		String strlow="";
		String strNum="";
		
		String[] strArr=str.split(" ");
		
		for(int i=0;i<strArr.length;i++)
		{
			char[] ch=strArr[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]>='A' && ch[j]<='Z') 
				{
					strupp+=ch[j];
				}
				else if(ch[j]>='a' && ch[j]<='z')
				{
					strlow+=ch[j];
				}
				else
					strNum+=ch[j];
			}
		}
		String res=strlow.concat(strupp);
		String result=res.concat(strNum);
		return result;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		String res= removeUpper(str);
		System.out.println(res);

	}

}
