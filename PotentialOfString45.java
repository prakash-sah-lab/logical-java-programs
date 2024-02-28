package com.logic_session;

import java.util.Scanner;

/* dsiplay potential of every word in string
 * A/a-1,B/b-2,C/c-3,D/d-4,E/e-5,F/f-6,G/g-7,H/h-8,I/i-9,J/j-10,K/k-11,L/l-12,M/m-13,
 * N/n-14,O/o-15,P/p-16,Q/q-17,R/r-18,S/s-19,
 * T/t-20,U/u-21,V/v-22,W/w-23,X/x-24,Y/y-25,Z/z-26
 * input:- apple is good
 * output:- 50 28 41
 * */
public class PotentialOfString45 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str=sc.nextLine();
		str.toLowerCase();
		 String potS="";
		 
		 String[] split=str.split(" ");
		 
		 for(int i=0;i<split.length;i++)
		 {
			 int pot=0;
			 char[] ch=split[i].toCharArray();
			 for(int j=0;j<ch.length;j++)
			 {
				pot+=((int)ch[j]- 96);
			 }
			 potS+=pot+" ";
		 }
		 System.out.println(" String is : "+str);
		 System.out.println("potential of word in string is : "+potS);

	}

}
