package com.logic_session;
/* count the number of word present in string*/

public class AStringChar {

	public static void main(String[] args) {
		String str="Prakash            kumar             jaiswal";
		String word[]=str.split(" ");
		for(String w:word)
		{
			int c=0;
			if(w.equals(""))continue;
			else
			{
				int l=w.length();
				for(int i=0;i<l;i++)
				{
					c++;
				}
			System.out.println("number of letter in "+w+ " is "+c);
			}
		}

	}

}
