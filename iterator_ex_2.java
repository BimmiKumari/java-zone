package list_iterator;
import java.util.ArrayList;
import java.util.ListIterator;
public class Example_3 {
	            /*
	             * to convert all odd into even
	             */
     public static void main(String [] args) {
			ArrayList list=new ArrayList<String>();
			list.add(100);
			list.add(101);
			list.add(200);
			list.add(123);
			list.add(300);
			list.add(1234);
			list.add(400);
			list.add(765);
			System.out.println(list);
		  ListIterator itr=list.listIterator();
		  while(itr.hasNext()) {
			  int i=(int) itr.next();
			  if(i%2==1)
			  {
				  i++;
				  itr.set(i);
				  
			  }
			  
		  }
		  System.out.println(list);
	}
	}


