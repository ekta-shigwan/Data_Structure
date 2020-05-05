package com.learning;

import java.util.Scanner;

public class Convert 
{
	float m,k;
	Scanner scanner=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter distance in meters : ");
		m=scanner.nextInt();
	}
	void calculate()
	{
		k=m/1000;
	}
	void display()
	{
		System.out.println("Kilometers is :"+k);
	}
	public static void main(String[] args) 
	{
		Convert convert=new Convert();
		convert.accept();
		convert.calculate();
		convert.display();
	}
}
