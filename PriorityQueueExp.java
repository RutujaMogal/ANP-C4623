package Collection;

import java.util.PriorityQueue;

public class PriorityQueueExp {

	public static void main(String[] args) {
		
	PriorityQueue<Integer> pq=new PriorityQueue<Integer>(); 
	// adding element
	pq.add(5);
	pq.add(7);
	pq.add(2);
	pq.add(3);
	
	System.out.println("Total elements are:"+pq);
	
	//printing the top element
	System.out.println("Top element is :"+pq.peek());
	
	//removing the top element
	System.out.println(" Removed top element is:"+pq.poll());
	
	System.out.println("Total elements are:"+pq);
	}

}
