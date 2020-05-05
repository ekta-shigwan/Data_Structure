package com.learning;

import java.util.Scanner;

public class EvenNumber 
{

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		for (int i = 1; i<=20; i++) 
		{
			if(i%2==0)
			System.out.println(i);
		}
	}

}
