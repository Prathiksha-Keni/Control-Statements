package com.xworkz.controlStatements;

public class divisibleByThreeInArray 
{
	public static void main(String[] args)
	{
		int number[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The array elements that are divisible by 3 are");
		for(int i=1;i<=number.length;i++)
		{	
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
	}
}
