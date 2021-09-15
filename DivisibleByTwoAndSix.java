package com.xworkz.controlStatements;

public class DivisibleByTwoAndSix 
{
	public static void main(String[] args) 
	{
		int n=100;
		System.out.println("The n(ie 100) natural numbers that are divisible by 2 and 6 are");
		for(int i=1;i<=n;i++)
		{	
			if(i%2==0&&i%6==0)
			{
				System.out.println(i);
			}
		}
	}
}
