package com.logic_session;

import java.util.Scanner;

public class Flipkart 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter old phone name:");
		String name=sc.nextLine();
		System.out.print("Enter old phone Brand:");
		String brand=sc.nextLine();
		System.out.print("Enter old phone current Price:");
		double price=sc.nextDouble();
		System.out.print("Enter old phone number of year use:");
		double numberOfYearUse=sc.nextDouble();
		double disAmount=OldPhone.discount(price,numberOfYearUse);
		double depretiationAmount=price-disAmount;
	/*-------------------------------------------------------------------*/
		System.out.print("Enter New phone name:");
		String newName=sc.nextLine();
		newName=sc.nextLine();
		System.out.print("Enter new phone Brand:");
		String newbrand=sc.nextLine();
		System.out.print("Enter new phone current Price:");
		double newprice=sc.nextDouble();
		double disNewPrice=newprice-depretiationAmount;
		System.out.println("\n\n -------------------old Phone Detail-----------------");
		OldPhone.oldPhoneDetail(name,brand,price,numberOfYearUse,depretiationAmount);
		System.out.println("\n\n -------------------New Phone Detail-----------------");
		NewPhone.oldPhoneDetail(newName,newbrand,newprice,disNewPrice);
		
		sc.close();
	}
}
