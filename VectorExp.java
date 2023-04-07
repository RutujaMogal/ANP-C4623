package Collection;

import java.util.*;
import java.util.Iterator;

public class VectorExp {

	public static void main(String[] args) {
		Vector<String>list=new Vector<String>();
        //adding object in ArrayList
		list.add(" mango");
		list.add(" orange");
		list.add(" apple");
		list.add(" orange");
		list.add(" mango");
		//traversing list to iterator
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
