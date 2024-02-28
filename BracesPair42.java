package com.logic_session;
/* wap to show the braces are pair or not
 * input:- {[()]}*/
// 

import java.util.Scanner;

public class BracesPair42 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a pair of braces");
		String str=sc.nextLine();
		int midO=0,midC=0,bigO=0,bigC=0,smO=0,smC=0;
		boolean pair=false;
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='{')
				midO++;
			if(ch[i]=='}')
			  midC++;
			 if(ch[i]=='[')
			  bigO++;
			 if(ch[i]==']')
			  bigC++;
		     if(ch[i]=='(')
			  smO++;
			 if(ch[i]==')')
			  smC++;
		} 
		/*if(midO==1 && midC==1 && bigO==1 && bigC==1 && smO==1 && smC==1  )
		{
			System.out.println("pair of braces are thre");
		}
		else
			System.out.println("not pair");*/
		if(midC==midO &&bigC==bigO &&smC==smO )pair=true;
		
		if(pair)
			System.out.println("all braces are in pair");
		else System.out.println("not in pair");
		

	}

}
