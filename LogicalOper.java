package Operaters;

import java.util.Scanner;

public class LogicalOper {

	public static void main(String[] args) {
		// create scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no.");
		int num1=sc.nextInt();
		System.out.println("Enter second No.");
		int num2=sc.nextInt();
		//both numbers are even
		if(num1 % 2 == 0&& num2 % 2 == 0)
		{
			System.out.println("Both numbers are even");
		}
		else
		{
			System.out.println("Atleast one number is odd");
		}
		//Check if either number is negative
		if(num1 < 0|| num2 <0)
		{
			System.out.println("Atleast one number is negative");
		}
		else
		{
			System.out.println("Both numbers are non-negative");
		}
		//Check the numbers are equal or nit
		if(num1 == num2)
		{
			System.out.println("Both numbers are equal");
		}
		else
		{
			System.out.println("Numbers are not equal");
		}
        sc.close();
	}

}
