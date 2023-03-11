package corejava;

import java.util.Scanner;

public class WhileLoopExm {
  public static void main(String[] args) {
	  // creating a scanner object to take input from user
	  Scanner sc=new Scanner(System.in);
	  int a;
	  System.out.println("Enter a number between 1 to 10");
	  a=sc.nextInt();
	  while(a<1 || a>10) {
		  System.out.println("Invalid input please enter a number between 1 to 10");
		  System.out.println("Enter a number between 1 to 10");
		  a=sc.nextInt();
	  }
	  System.out.println("You enter a number:"+a);
  }
}
