package com.xworkz.controlStatements;

public class EvenNaturalNumbers 
{
	public static void main(String[] args)
	{
		int n=200;
		System.out.println("The n(ie 200) natural even numbers are");
		for(int i=0;i<=n;i++)
		{	
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
