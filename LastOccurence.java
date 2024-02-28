package com.logic_session;

import java.util.Scanner;

public class LastOccurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
	  String str= sc.nextLine();
	  System.out.println("enter a char to find his last occurence:");
	  char ch=sc.next().charAt(0);
	  int pos=str.lastIndexOf(ch);
	  if(pos>=0)
	  System.out.println( ch+" present at "+(pos+1));
	  else
		  System.out.println("element not found");

	}

}
