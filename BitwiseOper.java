package Operaters;

import java.util.Scanner;

public class BitwiseOper {

	public static void main(String[] args) {
		// create scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		// and operation
		int and = num1 & num2;
		System.out.println(num1+" & "+num2+"="+and);
		// or operation
		int or = num1 | num2;
		System.out.println(num1+"|"+num2+"="+or);
		// and operation
		int xor = num1 ^ num2;
		System.out.println(num1+"&"+num2+"="+xor);
		//negation operater
		int negation = ~num1;
		System.out.println("~"+num1+"="+negation);
        sc.close();
	}

}
