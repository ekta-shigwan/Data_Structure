package com.learning;

import java.util.Scanner;

public class Temperature 
{
	float f,temp;
	Scanner scanner=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter temperature in celsius : ");
		temp=scanner.nextInt();
	}
	void calculate()
	{
		f=temp*9/5+32;
	}
	void display()
	{
		System.out.println("Fahrenheit is :"+f);
	}
	public static void main(String[] args) 
	{
		Temperature temperature=new Temperature();
		temperature.accept();
		temperature.calculate();
		temperature.display();
	}

}
