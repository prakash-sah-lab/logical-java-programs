package com.logic_session;

import java.util.Scanner;

public class ComparingTwoStringWithCaseSensitive {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String :");
		String str = sc.nextLine();
		System.out.println("Enter the second String :");
		String str1 = sc.nextLine();
		boolean b = str.equals(str1);
		System.out.println("String "+str+" and "+str1+" Both are equal : "+b);
		sc.close();
	}
}
