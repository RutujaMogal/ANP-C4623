package Operaters;
import java.util.Scanner;
public class LogicOperator {

	public static void main(String[] args) {
	// Create scanner class to take input from user
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number between 1 to 100:");
	int num=sc.nextInt();	
	// if statement to check whether the number is between 1 to 100
    if(num >= 1 && num<=100 )
    {
    	//if statement to check if the number is divisible by both 2 and 3
    	if(num % 2 == 0 && num % 3 == 0) 
    	{
    		System.out.println("The number is divisible by both 2 and three.");
    	}
    	else if(num % 2 ==0 || num % 3 == 0) 
    	{
    		System.out.println(" The number is divisible by either 2 or 3");
    	}
    	else
    	{
    		System.out.println("The number is not divisible by 2 or 3.");
    	}
    }
    else
    {
    	System.out.println("Please enter a number between 1 to 100");
    }
    sc.close();
	}

}
