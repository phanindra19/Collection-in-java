package MapInterface;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMAp {

	public static void main(String[] args) {

		
		TreeMap<Integer, String> tmap=new TreeMap<>(/*Comparator.reverseOrder()*/);
		
		tmap.put(1000, "Airtel");
		tmap.put(1500, "Jio");
		tmap.put(800, "Idea");
		tmap.put(700, "voda");
		tmap.put(400, "Bsnl");

		System.out.println(tmap);
		
		tmap.forEach((k,v) -> System.out.println(" key = "+ k + "value = "+ v));		
		System.out.println(tmap.firstKey());
		System.out.println(tmap.lastKey());
		
		Set<Integer> keyles1k =tmap.headMap(1000).keySet();
		System.out.println(keyles1k);
		
		Set<Integer> keyget1k =tmap.tailMap(1500).keySet();
		System.out.println(keyget1k);
		
		TreeMap<String, Integer> tmap1=new TreeMap<>();
		
		tmap1.put("Airtel",1000);
		tmap1.put("Jio",1500);
		tmap1.put("Idea",800);
		tmap1.put("voda",700);
		tmap1.put("Bsnl",400);
		
		tmap1.forEach((k,v) -> System.out.println("key ="+ k + "value ="+ v));
		
	}

}
