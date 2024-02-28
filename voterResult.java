package com.logic_session;

public class voterResult 
{
	public static long actualVoter(long tvoter)
	{
		long actVoter=tvoter*80/100;
		return actVoter;
	}
	public static long cand1Voter(long actvoter)
	{
		long cand1Voter=actvoter*60/100;
		return cand1Voter;
	}
	public static void winner(long cand1Voter,long cand2Voter,String candidate1,String candidate2)
	{
		if(cand1Voter>cand2Voter)
		{
			System.out.println("winner is:"+candidate1);
		}
		else
		{
			System.out.println("winner is:"+candidate2);
		}
	}
}
