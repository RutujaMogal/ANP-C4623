package Array;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int a =sc.nextInt();
        int[] arr=new int[a];
        System.out.println("Enter the array Element:");
        for(int i=0;i<a;i++)
        {
        	arr[i]=sc.nextInt();
        	
        }
       Arrays.sort(arr); 
       System.out.println("Sorted array:");
       for(int i:arr)
       {
    	   System.out.print(i+"  ");
       }
   sc.close();
	}

}
