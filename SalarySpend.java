package com.logic_session;

public class SalarySpend 
{
	public static double  food(double salary)
	{
		double foodSpend=salary*50/100.0;
		return foodSpend;
	}
	public static double  pg(double salary)
	{
		double pgSpend=salary/15.0;
		return pgSpend;
	}
	public static double  activities(double salary)
	{
		double activitiesSpend=salary/10.0;
		return activitiesSpend;
	}
	public static double  remaingSslary(double salary,double spend)
	{
		double remainingSslary=salary-spend;
		return remainingSslary;
	}
}
