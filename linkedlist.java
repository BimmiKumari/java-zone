package linked_list;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Linked_listt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  var list = new LinkedList<>();
  Scanner l_element = new Scanner(System.in);
  int n=l_element.nextInt();
  for(int i=0;i<n;i++)
  {
	  list.add(((Iterator<String>) l_element).next());
  }
  for(int i=0;i<n;i++)
  {
	  list.set(0,"bimmi");
	 // list.remove(1);
	  System.out.println(list.get(i));
	  System.out.println(list.subList(0,2));
  }
  System.out.println(list.peekFirst());
  System.out.println(list.peekLast());
  System.out.println(list.pollFirst());
  System.out.println(list.pollLast());
}
}
  

	   
	
