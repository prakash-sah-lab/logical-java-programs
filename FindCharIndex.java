package com.logic_session;
//wap to find character at index
import java.util.Scanner;

public class FindCharIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
	  String str= sc.nextLine();
	  System.out.println("enter index number:");
	  int num=sc.nextInt();
	  if(str.length()>num)
	  System.out.println(str.charAt(num));
	  else 
		  System.out.println("out of index");

	}

}
