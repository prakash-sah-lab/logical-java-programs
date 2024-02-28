package com.logic_session;

/*WAP to covert a given string into lowerCase?*/


import java.util.Scanner;

public class CovertStringToLowercase {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		System.out.println(str.toLowerCase());
		sc.close();
	}

}
