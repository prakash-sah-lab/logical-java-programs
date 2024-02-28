package com.logic_session;
/*write the program for the below requirement
    
    enter two integers inform of string 
    calclate and dsiplay the sum of numbers*/
import java.util.Scanner;

public class StringToWord {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string1:");
	String s1=sc.nextLine();
	System.out.println("Enter string1:");
	String s2=sc.nextLine();
	int n1=Integer.parseInt(s1);
	int n2=Integer.parseInt(s2);
	int sum=n1+n2;
	System.out.println("Sum of "+s1+" + "+s2+" = "+sum);
	

	}

}
