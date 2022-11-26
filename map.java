package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Hash_map {

	public static void main(String[] args) {
		// TO represent in form of key and pair we use map
       var map=new HashMap<Integer,String>();
      map.put(1, "hello");
      map.put(2, "hiiii");
      map.put(3,"heyyyy");
      System.out.println(map);
      System.out.println(map.get(3));
      System.out.println(map.containsKey(4));
      map.put(3, "bimmi");
      System.out.println(map);
      map.remove(2);
      System.out.println(map);
      //to convert into set
      var set=map.keySet();
      System.out.println(set);
      var set1 =map.values();
      var set3=map.entrySet();
      System.out.println(set1);
      System.out.println(set3);
      Scanner l_element = new Scanner(System.in);
      int n=l_element.nextInt();
      //
      var map2=new HashMap<Integer,String>();
      for(int i=0;i<n;i++)
      {
    	  map2.put(i, l_element.next());
	}
      System.out.println(map2);
}
}

