package map;
import java.util.TreeMap;
public class Tree_map {

	public static void main(String[] args) {
		// to display sorted key
		var map=new TreeMap<Integer,String>();
		map.put(100, "am");
		map.put(50, "I");
		map.put(150, "learning");
		map.put(200, "java");
		System.out.println(map);
		System.out.println(map.firstEntry());
		System.out.println(map.lastKey());
		
		//to check and then remove
		System.out.println(map.pollFirstEntry());
		System.out.println(map);

	}

}

