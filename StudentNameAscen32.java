package com.logic_session;

public class StudentNameAscen32 {

	public static void main(String[] args) 
	{
		String[] student= {"Prakash","rohit","avi","Shim","chotu"};
		

		for(int i=0;i<student.length-1;i++)
		{
			for(int j=i+1;j<student.length;j++)
			{
			if(student[i].compareToIgnoreCase(student[j])>0)
			{
			 String temp=	student[i];
			 student[i]=student[j];
			 student[j]=temp;
			}
		}
		}
		
System.out.println("Name in ascending order:");
		for(int j=0;j<student.length;j++)
		{
			System.out.println(student[j]);
		}
		
		
	}

}
