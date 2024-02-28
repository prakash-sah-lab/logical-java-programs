package com.logic_session;

import java.util.Scanner;

public class StudentAndMobileNum31 {

	public static void main(String[] args) 
	{
		String[] student= {"Prakash","rohit","avi","Shim","chotu"};
		String[] mobile= {"8709506050","9128493704","7483725","4536282","354729"};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter name to search:");
		String str=sc.nextLine();
		
		for(int j=0;j<student.length;j++)
		{
			
			if(student[j].equalsIgnoreCase(str))
			{
				System.out.println(student[j]+" : "+mobile[j]);
				return;
			}
		}
        System.out.println("not found");
	}

}
