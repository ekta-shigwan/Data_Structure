package com.learning;

import java.util.Scanner;

public class StudentDetail 
{
	String name;
	int sub;
	float percent;
	Scanner scanner=new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter Student Name : ");
		name=scanner.next();
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter marks : ");
			sub=scanner.nextInt();			
		}
	}
	void calculate()
	{
		percent=sub+sub+sub/3;
	}
	void display()
	{
		if(percent>=50)
		System.out.println("Pass");
		else
		System.out.println("Fail");
	}
	
	public static void main(String[] args) 
	{
		StudentDetail studentDetail=new StudentDetail();
		studentDetail.accept();
		studentDetail.calculate();
		studentDetail.display();
	}

}
