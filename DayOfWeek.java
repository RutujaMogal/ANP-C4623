package corejava;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) 
		 { // creating a scanner to take input from user
			 Scanner sc=new Scanner(System.in);
			 int num;
			 
			 do
			 {
				 System.out.println("Enter a Number between 1 to 7:");
				 			 num=sc.nextInt();
			 switch(num)
			 {
			 case 1:
				 System.out.println("Monday");
				 break;
				 
			 case 2:
				 System.out.println("Tuesday");
				 break;	 
			 case 3:
				 System.out.println("Wednesday");
				 break;	 
			 case 4:
				 System.out.println("Thursday");
				 break;	 
			 case 5:
				 System.out.println("Friday");
				 break;
			 case 6:
				 System.out.println("Saturday");
				 break;
			 case 7:
				 System.out.println("Sunday");
				 break;
 
			default:
				System.out.println("Invalid choice,please try again");
			 }
			 
		 }
		    while(num<8);


	}

}
