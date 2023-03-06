package corejava;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		// creating a scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		//creating a variable using scanner class object
		int number=sc.nextInt();
		//checking condition
		if(number>0)
		{
			System.out.println("the number is positive");
		}
		else if(number<0)
		{
			System.out.println("the number is negative");
		}
		else
		{
			System.out.println("the number is zero");
		}
		sc.close();
	}

}
