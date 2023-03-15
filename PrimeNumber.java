package corejava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// create object of scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		int num;
		do {
			System.out.println("Enter a number:");
			num=sc.nextInt();
		}
		while(num<2);
		boolean isPrime=true;
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}


	}

}
