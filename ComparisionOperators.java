package Operaters;
import java.util.Scanner;
public class ComparisionOperators {

	public static void main(String[] args) {
		// Create scanner class to take input from user
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter first string.");
		String string1=sc.next();
		System.out.println("Enter second string.");
		String string2=sc.next();
		int result=string1.compareTo(string2);
		//char charArray[]=str.toCharArray();
       // check whether the strings are equal or not
		if(string1.equals(string2))
		{
			System.out.println("Bothe strings are equal");
		}
		else
		{
		   if(result<0)
		   {
			System.out.println("Both strings are not equal."+"\n"+"The sorted strings are");   
			System.out.println(string1 + "," + string2);   
		   }	
		   else
		   {
			   System.out.println("Both strings are not equal."+"\n"+"The sorted strings are");
			   System.out.println(string2 + ","+ string1);
		   }
		}
		sc.close();

	}

}
