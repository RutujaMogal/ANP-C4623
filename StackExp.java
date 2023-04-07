package Collection;
import java.util.*;
public class StackExp {

	public static void main(String[] args) {
		
		Stack<String>stack=new Stack<String>();
        //adding object in ArrayList
		stack.push(" apple");
		stack.push(" orange");
		stack.push(" apple");
		stack.push(" orange");
		stack.push("berry");
		stack.push(".");
		stack.pop();
		//traversing list to iterator
		Iterator iter=stack.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
