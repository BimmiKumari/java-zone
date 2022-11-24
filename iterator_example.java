package list_iterator;

import java.util.ArrayList;
import java.util.ListIterator;
               //to remove all the null values
public class EXAMPLE_1 {
	public static void main(String [] args) {
		ArrayList list=new ArrayList<String>();
		list.add(100);
		list.add(null);
		list.add(200);
		list.add(null);
		list.add(300);
		list.add(null);
		list.add(400);
		list.add(null);
		System.out.println(list);
	  ListIterator itr=list.listIterator();
	  while(itr.hasNext()) {
		  if(itr.next()==null)
		  {
			  itr.remove();
			  
		  }
		  
	  }
	  System.out.println(list);
}
}

