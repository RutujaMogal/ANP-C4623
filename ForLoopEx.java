package corejava;

import java.util.Scanner;
public class ForLoopEx {

	public static void main(String[] args) {
		// creating a scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of times you wants to print 'Happy Holi...'");
		//creating a variable using scanner class object
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Happy Holi....");
		}
		sc.close();

	}

}
