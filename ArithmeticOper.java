package Operaters;

import java.util.Scanner;

public class ArithmeticOper {

	public static void main(String[] args) {
		// create an objects of scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum:"+ sum);
		int sub=num1-num2;
		System.out.println("Subtraction:"+ sub);
		int mul=num1*num2;
		System.out.println("Multiplication:"+ mul);
		int div=num1/num2;
		System.out.println("Division:"+ div);
		int mod=num1%num2;
		System.out.println("Mod:"+ mod);
		sc.close();

	}

}
