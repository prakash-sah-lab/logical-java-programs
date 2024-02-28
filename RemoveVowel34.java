package com.logic_session;

import java.util.Scanner;

public class RemoveVowel34 {

	

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		
		char[] ch=str.toCharArray();
		String str1="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				continue;
			}
			else
				
			{
				str1+=ch[i];
			}
			
		}
		System.out.println("after emoving of vowel: "+str1);
	}

}
