package com.logic_session;

public class StringToPrimitive17 {

	public static void main(String[] args) {
		String str="121";
		String str2="121.0";
		//string to byte
		byte b1=Byte.parseByte(str);
		System.out.println(b1);
		//string to short
		Short s1=Short.parseShort(str);
		System.out.println(s1);
		//string to int
		int i1=Integer.parseInt(str);
		System.out.println(i1);
		// string to long
		long l1=Long.parseLong(str);
		System.out.println(l1);
		//string to float
		Float f1=Float.parseFloat(str);
		System.out.println(f1);
		// string to double
		double d1=Double.parseDouble(str);
		System.out.println(d1);
		
		//string to byte
				//byte b2=Byte.parseByte(str2);
				//System.out.println(b2);
				//string to short
				//Short s2=Short.parseShort(str2);
				//System.out.println(s2);
				//string to int
				//int i2=Integer.parseInt(str2);
				//System.out.println(i2);
				// string to long
				//long l2=Long.parseLong(str2);
				//System.out.println(l2);
				//string to float
				Float f2=Float.parseFloat(str2);
				System.out.println(f2);
				// string to double
				double d2=Double.parseDouble(str2);
				System.out.println(d2);
		
	}

}
