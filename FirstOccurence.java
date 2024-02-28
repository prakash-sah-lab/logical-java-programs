package com.logic_session;
//wap to find the first occurence of 
import java.util.Scanner;

public class FirstOccurence {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
	  String str= sc.nextLine();
	  System.out.println( "v present at"+str.indexOf("v"));

	}

}
