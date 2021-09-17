package com.xworkz.controlStatements;

public class divisibleByThreeInArray 
{
	public static void main(String[] args)
	{
		int number[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The array elements that are divisible by 3 are");
		for(int i=0;i<number.length;i++)
		{
			if (number[i]%3==0) //checking for array elements if the value is divisible by 3 and prints the array elements
			{
				System.out.println(number[i]);
			}
			/*if(i%3==0)//checking for index value using i ie 0,1,2,3,4,5,6,7,8,9 are the index of the array it checks with the index if it is divisible by 3 and prints the value that is present inside the index
			{
				System.out.println(i);
			}*/
		}
	}
}
