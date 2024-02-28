package com.logic_session;

import java.util.Scanner;

public class SetOfChracterFromStartIndexToEndIndexfromString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		System.out.println("Enter the starting index :");
		int start = sc.nextInt();
		System.out.println("Enter the Ending index :");
		int end = sc.nextInt();
		try(sc)
		{
			if(start<=str.length() && end<=str.length())
			{
				System.out.println(str.substring(start, end));
			}
			else
			{
				throw new StringIndexOutOfBoundsException();
			}	
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.err.println("provide the Starting and Ending index within the String lenght .");
		}
		
	}

}

