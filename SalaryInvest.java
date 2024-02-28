package com.logic_session;

import java.util.Scanner;

public class SalaryInvest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your name:");
		String name=sc.nextLine();
		System.out.print("Enter your Salary:");
		double salary=sc.nextDouble();
		System.out.println("Name:"+name);
		System.out.println("salary:"+salary);
		double spendInFood= SalarySpend.food(salary);
		System.out.println("spend in food:"+spendInFood);
		double spendInPg= SalarySpend.pg(salary);
		System.out.println("spend in pg:"+spendInPg);
		double spendInAct= SalarySpend.activities(salary);
		System.out.println("spend in activities:"+spendInAct);
		double totalSpend=salary-(spendInFood+spendInPg+spendInAct);
		System.out.println("Total Spend:"+totalSpend);
		double reaminingSalary=SalarySpend.remaingSslary(salary,totalSpend);
		System.out.println("Remaining Salary:"+reaminingSalary);
sc.close();
	}
}
