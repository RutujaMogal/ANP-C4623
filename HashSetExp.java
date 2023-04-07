package Collection;


import java.util.HashSet;
import java.util.Set;

public class HashSetExp {

	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		//adding element into set
		s.add("cat");
		s.add("ant");
		s.add("apple");
		s.add("dog");
		
		String c="dog";
		
		System.out.println("The elemnt is:"+s);
		//chech whether d is present in set or not
		System.out.println("The elemnt is:"+c+" :"+s.contains(c));
	}

}
