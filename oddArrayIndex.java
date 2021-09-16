package com.xworkz.controlStatements;

public class oddArrayIndex 
{
	public static void main(String[] args)
	{  
		int price[]= {110,250,300,740,560,460,780,280,920,1000 };
		int sum=0;
		for(int i=0;i<price.length;i++)
		{
			if(i%2!=0)
			{
				sum=sum+price[i];
			}
		}
		System.out.println("The sum of odd index of array elements are "+sum);
	}
}
