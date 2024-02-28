package com.logic_session;
/* wap to store a sentence and dispaly the element which is largest in the string*/
import java.util.Scanner;

public class LargestWordInString36 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.nextLine();
		
		String[] str1=str.split(" ");
		int maxLength=0;
		String maxWord="";
		for(int i=0;i<str1.length;i++)
		{
			int lenOfWord=str1[i].length();
			if(maxLength<lenOfWord)
			{
				maxLength=lenOfWord;
				maxWord=str1[i];
			}
		}
		
		System.out.println("Max word in String: "+maxWord+" of length : "+maxLength);

	}

}
