package com.logic_session;

import java.util.Scanner;

public class SetOfChracterFromString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		System.out.println("Enter the index to start :");
		int index = sc.nextInt();
		try(sc)
		{
			if(index<=str.length())
			{
				System.out.println(str.substring(index));
			}
			else
			{
				throw new StringIndexOutOfBoundsException();
			}	
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.err.println("Give the index number within the length.");
		}
		
		
	}

}

