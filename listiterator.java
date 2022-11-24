package list_iterator;
import java.util.ArrayList;
import java.util.ListIterator;
public class List_iterator {
	public static void main(String [] args) {
		ArrayList <String> list=new ArrayList<String>();
		list.add("we");
		list.add("have");
		list.add("courage");
		list.add("to");
	  ListIterator<String> itr=list.listIterator();
	  while(itr.hasNext()) {      //it checks wheather next element exits if yes then it return true and while loop work
		  System.out.println(itr.next());     //it prints the next available element
	  }
	  System.out.println("\n_____________________________________________________________\nin reverse order\n_________________________________________________________________________________");
	  //in reverse order
	  while(itr.hasPrevious()) {      //cursor will go the last element and will check previous elemnt is available if yes then return true
		  
		  System.out.println(itr.previous());   //
	  }
	}
}

