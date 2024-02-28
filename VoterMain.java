package com.logic_session;

import java.util.Scanner;

public class VoterMain 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Total voter:");
		long totalVoter=sc.nextLong();
		System.out.print("Enter candidate1 name:");
		String candidate1=sc.nextLine();
		candidate1=sc.nextLine();
		System.out.print("Enter candidate2 name:");
		String candidate2=sc.nextLine();
		long actualVoter=voterResult.actualVoter(totalVoter);
		System.out.println("Voter attend:"+actualVoter);
		long cand1Voter=voterResult.cand1Voter(actualVoter);
		System.out.println("RR Voter :"+cand1Voter);
		long cand2Voter=actualVoter-cand1Voter;
		System.out.println("KCR Voter :"+cand2Voter);
		voterResult.winner(cand1Voter, cand2Voter,candidate1,candidate2);
		
		sc.close();
	}
}
