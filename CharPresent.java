package com.logic_session;

import java.util.Scanner;

public class CharPresent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
	  String str= sc.nextLine();
	  System.out.println("enter a string to find:");
	  String str1= sc.nextLine();
	  System.out.println("enter starting index:");
	  int index=sc.nextInt();
	  
	  System.out.println(str1+" is present:"+str.indexOf(str1,index));

	}

}
