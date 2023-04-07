package Collection;
import java.util.*;//import java utility class
public class ArrayListExp {

	public static void main(String[] args) {
		
		ArrayList<String>arraylist=new ArrayList<String>();
        //adding object in ArrayList
		arraylist.add(" mango");
		arraylist.add(" orange");
		arraylist.add(" apple");
		arraylist.add(" orange");
		arraylist.add(" mango");
		//traversing list to iterator
		Iterator iter=arraylist.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}
