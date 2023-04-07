package Collection;
import java.util.*;
public class QueueExp {

	public static void main(String[] args) {
		Queue<Integer>que=new LinkedList<Integer>();
        
		for(int i=0;i<5;i++)
		{
			que.add(i);
		}
        // display the elements of the queue
		System.out.println("Elements of queue :"+que);
		// to remove the head element of queue
		int r=que.remove();
		System.out.println("Remove element is :"+r);
		System.out.println(" Element of queue after remove :"+que);
		
		// to view the head element of queue
		int h=que.peek();
		System.out.println(" Head element of queue:"+h);
		
		// size of queue
		int s=que.size();
		System.out.println("Size of queue:"+s);
	}

}
