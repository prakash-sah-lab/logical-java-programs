package com.logic_session;
/* caeser cipher question adding 13 to the character*/
import java.util.Scanner;

public class CaeserCipherString44 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.nextLine();
		String caesString="";
		String[] str=s1.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			char[] ch=str[i].toCharArray();
			String str1="";
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]>='A' && ch[j]<='Z')
				{
					if((int)(ch[j]+13)>90) 
					{
					int l=(int)ch[j]+13-90;
				str1+=(char)(96+l);
					}
					else
						str1+=(char)(ch[j]+13);
				}
				if(ch[j]>='a' && ch[j]<='z')
				{
					if((int)(ch[j]+13)>122) 
					{
					int l=(int)ch[j]+13-123;
				str1+=(char)(65+l);
					}
					else
						str1+=(char)(ch[j]+13);
				}
				
			}
			caesString+=str1+" ";
		}
		
		System.out.println(caesString);

	}

}
