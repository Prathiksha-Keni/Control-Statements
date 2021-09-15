package com.xworkz.controlStatements;

public class DivisibleByThree
{
	public static void main(String[] args)
	{
		int n=100;
		System.out.println("The n(ie 100) natural numbers that are divisible by 3 are");
		for(int i=1;i<=n;i++)
		{	
			if(i%3==0)
			{
				System.out.println(i);
			}
		}

	}

}
