package com.logic_session;

import java.util.Scanner;

class CharacterNotFound extends RuntimeException
{
	
	public CharacterNotFound(String str)
	{
		super(str);
	}
}
public class ReplaceAllCharacterOfString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		System.out.println("Enter the character to replace :");
		char charToReplace = sc.nextLine().charAt(0);
		System.out.println("Enter the character to be replaced :");
		char ch = sc.nextLine().charAt(0);
		char ch1[] = str.toCharArray();
		System.out.println(str.replace(charToReplace, ch));
		System.out.println("--------------------------------------------------------------------------");
		boolean flag = false;
		for(int i=0;i<str.length();i++)
		{
			if(ch1[i]==charToReplace)
			{
				flag = true;
			}
		}
		
		try(sc)
		{
			if(flag==true)
			{
				System.out.println(str.replace(charToReplace, ch));
			}
			else
			{
				throw new CharacterNotFound("Character not found.");	
			}	
		}
		catch(CharacterNotFound e)
		{
			System.err.println(e.getMessage());
		}
	}

}