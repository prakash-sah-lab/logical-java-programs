package com.logic_session;

public class OldPhone 
{
	public static double discount(double price,double numberOfYearUse)
	{
		double disPrice;
		if(numberOfYearUse<=1)
		{
			disPrice=20/100.0*price;
		}
		else if(numberOfYearUse>1 && numberOfYearUse<=2)
		{
			disPrice=35/100.0*price;
		}
		else if(numberOfYearUse>2 && numberOfYearUse<=3)
		{
			disPrice=50/100.0*price;
		}
		else 
		{
			disPrice=60/100.0*price;
		}
		return disPrice;
		
	}
	
	public static void oldPhoneDetail(String name, String brand, double price, double numberOfYearUse, double depretiationAmount)
	{
		System.out.println("Old Phone name:"+name+" \n Brand:"+brand+"\n year of use:"+numberOfYearUse+"\n current Price:"+price+"\n Depretiation Amount:"+depretiationAmount);
		
	}
}
