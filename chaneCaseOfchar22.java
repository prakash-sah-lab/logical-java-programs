package com.logic_session;

import java.util.Scanner;

public class chaneCaseOfchar22 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
        	char ch=s.charAt(i);
        	if(ch>=97 && ch<=122)
        	{
        		s1+=(char)(ch-32);
        	}
        	else
        	{
        		s1+=(char)(ch+32);	
        	}
        }
        System.out.println("String before conversion of case : "+s);

        System.out.println("String after conversion of case : "+s1);
	}

}
