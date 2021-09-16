package com.xworkz.controlStatements;

public class sumOfArrayElements 
{
	public static void main(String[] args)
	{
		int price[]= {10,20,30,40,50,60,70,80,90,100};
		int sum=0;
		for(int i=0;i<price.length;i++)
		{
			sum=sum+price[i];
		}
		System.out.println("The sum of array elements are "+sum);
	}
}
