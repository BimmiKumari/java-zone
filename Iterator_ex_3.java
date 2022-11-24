package list_iterator;
import java.util.ArrayList;
import java.util.ListIterator;
public class Example_2 {
	            /*
	             * to replace all the null values by word bimmi
	             */
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
				  itr.set("bimmi");
				  
			  }
			  
		  }
		  System.out.println(list);
	}
	}


