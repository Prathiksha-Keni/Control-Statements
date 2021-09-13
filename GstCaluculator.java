package com.xworkz.controlStatements;

public class GstCaluculator 
{

	public static void main(String[] args) 
	{
		int price=6000;
		double TaxAmount;
		if(price==2000)
		{
			TaxAmount=price*0.2/100;
			System.out.println(TaxAmount);
		}
		else if(price==3000)
		{
			TaxAmount=price*0.3/100;
			System.out.println(TaxAmount);
		}
		else if(price==4000)
		{
			TaxAmount=price*0.4/100;
			System.out.println(TaxAmount);
		}
		else if(price==5000)
		{
			TaxAmount=price*0.5/100;
			System.out.println(TaxAmount);
		}
		else if(price==6000)
		{
			TaxAmount=price*0.6/100;
			System.out.println(TaxAmount);
		}

	}

}
