package MapInterface;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Diff_waysto_hashmap {

	public static Map<String, Integer> marksMap;
	
	static {
		marksMap= new HashMap<>();
		marksMap.put("Ravi", 95);
		marksMap.put("raju", 98);
	}
	public static void main(String[] args) {

	
		//1.using hashmap class
		
		HashMap<String, String> map1=new HashMap<>();
		Map<String, String> map2= new HashMap<>();
		
		// static way : static hashmap :
		System.out.println(Diff_waysto_hashmap.marksMap.get("raju"));
		
		//3.inmutableMap with only one single entry:
		Map<String, Integer> map3= Collections.singletonMap("Test", 97);
		System.out.println(map3.get("Test"));
		
		//4.jdk 8:
		Map<String, String> map4 =Stream.of(new String [] [] {
			{"Ravi","A grade"},
			{"raju","A++ grade"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(map4.get("raju"));
		map4.put("Lena", "B++");
		System.out.println(map4.get("Lena"));
		
		//5.using simpleentry: mutable map
		Map<String, String> map5= Stream.of(
		new AbstractMap.SimpleEntry<>("ravi","java"),
		new AbstractMap.SimpleEntry<>("Raju","python")
		).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
 
		System.out.println(map5.get("ravi"));
		map5.put("Dani", "c++");
		System.out.println(map5.get("Dani"));
		
		//6.using simpleentry: immutable map
		
		        Map<String, String> map6= Stream.of(
				new AbstractMap.SimpleImmutableEntry<>("ravi","java"),
				new AbstractMap.SimpleImmutableEntry<>("Raju","python")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		 
				System.out.println(map6.get("ravi"));
				map6.put("Dani", "c++");
				System.out.println(map6.get("Dani"));
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
