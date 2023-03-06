package corejava;

import java.util.Scanner;

public class EligibleCandidates {

	public static void main(String[] args) {
		// creating a scanner class to take input from user
				Scanner sc=new Scanner(System.in);
				System.out.println("Please enter your age:");
				//creating a variable using scanner class object
				int number=sc.nextInt();
				//checking condition
				if(number>18)
				{
					System.out.println("'Congratulations...' you are eligible for voting.");
				}
				else if(number<=0)
				{
					System.out.println("You have put wrong number.");
				}
				else
				{
					System.out.println("Sorry... you are not eligible for voting.");
				}
				sc.close();

	}

}
