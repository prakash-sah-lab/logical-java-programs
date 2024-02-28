package com.logic_session;

import java.util.Scanner;

public class StateCapital33 {

	public static void main(String[] args) {
		String[] state= {"Bihar","Up","Telangana","Delhi","Jharkhand"};
		String[] capital= {"Patna","kanpur","Hyderabad","Delhi","Ranchi"};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter name to search:");
		String str=sc.nextLine();
		
		for(int j=0;j<state.length;j++)
		{
			
			if(state[j].equalsIgnoreCase(str))
			{
				System.out.println(state[j]+" : "+capital[j]);
				return;
			}
		}
        System.out.println("not found");

	}

}
