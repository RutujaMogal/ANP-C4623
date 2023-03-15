package Operaters;

import java.util.Scanner;

public class ComparisionOper {

	public static void main(String[] args) {
		// create an object of scanner class to take inputs from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num1:");
		int num1;
		num1=sc.nextInt();
		System.out.println("Enter a num2:");
		int num2;
		num2=sc.nextInt();
		System.out.println("num1>num2 : "+(num1>num2));
		System.out.println("num1<num2 : "+(num1<num2));
		System.out.println("num1>=num2 : "+(num1>=num2));
		System.out.println("num1<=num2 : "+(num1<=num2));
		System.out.println("num1==num2 : "+(num1==num2));
		System.out.println("num1!=num2 : "+(num1!=num2));
        sc.close();
	}

}
