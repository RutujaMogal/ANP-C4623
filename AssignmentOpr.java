package Operaters;


public class AssignmentOpr {

	public static void main(String[] args) {
		//declaring variables
		int num;
		int num2;
		int num1;
		String name;
        // asigning values
		num=27;
		name="rutuja";
		num2=3;
		num1=2;
		
		// displaying the assignment
		System.out.println("num:"+num);
		System.out.println("name:"+name);
		
		 num1 += num2;
		System.out.println("num1: "+num1);
		num1 -= num2;
		System.out.println("num1: "+num1);
		num1 %=num2;
		System.out.println("num1: "+num1);
		
		
			
	}

}
