package Collection;
import java.util.*;
public class DequeExp {

	public static void main(String[] args) {
		
		Deque<String> dq=new ArrayDeque<String>();
		//adding element into deque
		dq.add("cat");
		dq.addFirst("ant");
		dq.add("apple");
		dq.addLast("dog");
		
		//printing element
		System.out.println("Elements are:"+dq);
		
		//removing and return the head element of the deque
		System.out.println("Removed element is:"+dq.pop());
		
		//removing and return the first element of the deque
		System.out.println("Removed element is:"+dq.pollFirst());
		
		//removing and return the last element of the deque
		System.out.println("Removed element is:"+dq.pollLast());
				
	}

}
