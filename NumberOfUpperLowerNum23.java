package com.logic_session;

import java.util.Scanner;

public class NumberOfUpperLowerNum23 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int ucount=0,lcount=0,ncount=0,scount=0;
        for(int i=0;i<s.length();i++)
        {
        	char ch=s.charAt(i);
        	if(ch>=97 && ch<=122)
        	{
        		lcount++;
        	}
        	else if(ch>=65 && ch<=91)
        	{
        	ucount++;	
        	}
        	else if(ch>=48 && ch<=57)
        	{
        	ncount++;	
        	}
        	else 
        	{
        	scount++;	
        	}
        }
        System.out.println("lower:"+lcount);
        System.out.println("upper:"+ucount);
        System.out.println("number:"+ncount);
        System.out.println("special char:"+scount);
	}

}
