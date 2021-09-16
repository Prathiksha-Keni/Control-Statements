package com.xworkz.controlStatements;

public class evenArrayIndex 
{
	public static void main(String[] args) 
	{
		int price[]= {100,150,200,250,300,350,400,450,500,550};
		int sum=0;
		for(int i=0;i<price.length;i++)
		{
			if(i%2==0)
			{
				sum=sum+price[i];
			}
		}
		System.out.println("The sum of even index of array elements are "+sum);
	}
}
