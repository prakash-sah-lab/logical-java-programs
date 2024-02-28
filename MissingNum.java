package com.logic_session;

public class MissingNum {

	public static void main(String[] args) 
	{
		int num[]= {-1,-3,6,7,9,3};
		int num1;
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
				num1=num[i];
				num[i]=num[j];
				num[j]=num1;
				}
			}
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println("\n Missing element are:");
		for(int i=0;i<num.length-1;i++)
		{
			if(num[i+1]-num[i]>1)
			{
				int x=num[i];
				for(int j=++x;j<num[i+1];j++)
				{
					System.out.print(j + " ");
				}
			}
		}
		

	}

}
