package com.logic_session;

import java.util.Scanner;

public class ReversingLetterOfString25 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        
        String newString="";
        for(int i=0;i<s1.length;i++)
        {
        	//System.out.println(s1[i]);
        	String s2="";
        	for(int j=s1[i].length()-1;j>=0;j--)
        	{
        		char ch=s1[i].charAt(j);
        		s2+=ch;
        	}
        	newString+=s2+" ";
        }
  System.out.println(newString);
	}

}
