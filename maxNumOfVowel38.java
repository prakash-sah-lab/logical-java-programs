package com.logic_session;
/* wap a program to store a statement an display the elemeent which can contain max number of vowel*/
import java.util.Scanner;

public class maxNumOfVowel38 {
	public static int  maxVowel(String str)
	{
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
			}
				
		}
		return count;	
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		String maxVolWord="";
		int maxVowel=0;
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
		int noOfVowel=maxVowel(str1[i].toLowerCase());
		if(noOfVowel>maxVowel)
		{
			maxVowel=noOfVowel;
			maxVolWord=str1[i];
		}
		
		}
		
		System.out.println("max Vowel word in string  :"+maxVolWord);

	}

}
