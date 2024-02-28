package com.logic_session;
// wap to find length of string
import java.util.Scanner;

public class FindLength {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string:");
  String str= sc.nextLine();
   int len=str.length();
   System.out.println("length of string:"+len);
	}

}
