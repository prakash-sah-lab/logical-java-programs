package com.logic_session;

import java.util.Scanner;

public class ArrayFacnocci {

	public static void main(String[] args)
	{
		int num[]=new int[20];
	     Scanner sc=new Scanner(System.in);
	     int n=0,n1=1,n2;
	     for(int i=0;i<num.length;i++)
	     {
	    	 num[i]=n;
	    	 n2=n;
	    	 n=n1+n2;
	    	 n1=n2;
	    	 System.out.print(num[i]+" ");
	     }
	}

}
