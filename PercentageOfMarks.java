package Array;

import java.util.Scanner;

public class PercentageOfMarks {

	public static void main(String[] args) {
		int total=0,percentage;

		Scanner sc=new Scanner(System.in); //take user input using scanner

		int[] marks=new int[5]; // declaring an integer array

		System.out.println("Enter 5 subject marks");

		for(int i=0;i<marks.length;i++) //for loop

		{

		marks[i]=sc.nextInt();

		total=total+marks[i]; //logic to count total

		}

		percentage=total/5; //logic to count percentage

		System.out.println("total:"+total); //printing total

		System.out.println("Percentage:"+percentage); //printing percentage

		
	        sc.close();

	}
   
}
