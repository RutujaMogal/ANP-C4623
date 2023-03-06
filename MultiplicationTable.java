package corejava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// creating a scanner class to take input from user
				Scanner sc=new Scanner(System.in);
				System.out.println("enter a number for which you wants to print multiplication table");
				//creating a variable using scanner class object
				int num=sc.nextInt();
				for(int i=1;i<=10;i++)
				{
					System.out.println(num+" "+"X"+" "+i+" "+"="+" "+num*i);
				}
				sc.close();


	}

}
