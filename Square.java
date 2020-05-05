package com.learning;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a=scanner.nextInt();
		for (int i = 1; i<=a; i++) 
		{
			System.out.println(+i+" Square = "+i*i);
		}
	}

}
