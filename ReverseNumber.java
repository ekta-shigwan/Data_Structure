package com.learning;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a=scanner.nextInt();
		for (int i = a; i>= 1; i--) 
		{
			System.out.println(i);
		}
	}

}
