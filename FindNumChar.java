package com.logic_session;
/* wap to find the number of character in string ,if the count is more than 5 then display the complete sring in uppercae else display the complete string in lower case
 * */

import java.util.Scanner;

public class FindNumChar {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter string:");
	String str=sc.nextLine();
	
	System.out.println("Number of character is: "+str.length());
	if(str.length()>5)
	{
		System.out.println(str.toUpperCase());
	}
	else
		System.out.println(str.toLowerCase());

	}

}
