package Hash__set;
import java.util.*;
public class Iterator_of_hash {
public static void main(String [] args)
{
	HashSet <String> set1=new HashSet<String>();
	set1.add("worshiping");
	set1.add("is");
	set1.add("peace");                           //insertion order not maintained because hashset
	for(String x:set1)
	{
		System.out.println(x);
	}
	System.out.println("________________________________________________");
	
	Set set2=new TreeSet<Integer>();
	set2.add(22);
	set2.add(33);
	set2.add(44);
	set2.add(55);                                 //in ascending order by default
	set2.add(77);
	Iterator itr =set2.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
