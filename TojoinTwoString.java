package com.logic_session;

import java.util.Scanner;

public class TojoinTwoString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String :");
		String str = sc.nextLine();
		System.out.println("Enter the Second String :");
		String str1 = sc.nextLine();
		System.out.println(str.concat(str1));
		sc.close();
	}

}