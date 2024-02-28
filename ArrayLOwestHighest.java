package com.logic_session;

import java.util.Scanner;

public class ArrayLOwestHighest {

	public static void main(String[] args) 
	{
     int num[]=new int[6];
     int num1;
     System.out.println("enter element:");
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<num.length;i++)
     {
    	 num[i]=sc.nextInt();
     }
     int maxNum=num[0],minNum=num[0];
     for(int i=0;i<num.length;i++)
     {
    	 if(maxNum<num[i])
    	 {
    		 maxNum=num[i];
    	 }
    	 else if(minNum>num[i])
    	 {
    		 minNum=num[i];
    	 }
     }
     System.out.println("highest number is:"+maxNum);
     
     System.out.println("Lowest number is:"+minNum);
	}

}
