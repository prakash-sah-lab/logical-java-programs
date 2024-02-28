package com.logic_session;

import java.util.Scanner;

public class NumtoWord {

	public static void main(String[] args) {
		Scanner  sc =new Scanner(System.in);
		System.out.println(".................Welcome to paytm...........");
		System.out.print("enter billing amount:");
		int bill=sc.nextInt();
		int bill1=bill;
		int count=0;
		if(bill<=0)
		{
			System.out.println("bill not correct");
			return;
		}
		while(bill!=0)
		{
			count++;
			bill/=10;
		}
		numtoWord(bill1,count);

	}
	public static void numtoWord(int num,int count)
	{
		if(count==0)
		{
			System.out.println("Bill amount is unsatisfied.");
			return;
		}
		if(count>4)
		{
			System.out.println("more then 4 word");
			return;
		}
		String[] onedigit = new String[] {"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
		String[] twodigits = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
		String[] multipleoftens = new String[] {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
		//String[] poweroftens = new String[] {"hundred","thouisand"};  
		
		if(count==1)
		{
			System.out.println(num+":"+onedigit[num]);
			return;
		}
		if(count<=4)
		{
			System.out.println(num+":");
			int x = 1;
			for(int i=1;i<count;i++) {
				x*=10;
			}
			//System.out.println(x);
			while(x!=0)
			{
				int rem=num/x;
				if(x==1000)
				{
					System.out.print(onedigit[rem]+" "+"Thousand ");
					x/=10;
				}
				else if(x==100)
				{
					if(rem%10==0)x/=10;
					else {
					System.out.print(onedigit[rem%10]+" "+"Hundred ");	
					x/=10;
					}
				}
				else if(x==10)
				{
					if(rem%10>=10&&rem%10<20)
					{
						System.out.print(twodigits[rem%10]+" ");
						x/=10;
					}
					else if(rem%10==0)x/=10;
					else{
						System.out.print(multipleoftens[rem%10-2]+" ");	
						x/=10;
					}
					
				}
				else
				{
					if(num%10==0)
					{
						x/=10;
					}
					else {
					System.out.print(onedigit[num%10]+" ");	
					x/=10;
					}
				}
			}
		}
	}

}
