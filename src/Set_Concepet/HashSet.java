package Set_Concepet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {

		
		Set<String> hs= new java.util.HashSet<String>();
		hs.add("Databasetest");
		hs.add("sql");
		hs.add("mysql");
		hs.add("centeral data");
		hs.add("centeral data");// set does not accp.any doubplicate value
		hs.add(null); //set accp. only one null value
		
		System.out.println(hs.size());
		System.out.println(hs);
		
		System.out.println(hs.contains("mysql"));
		
		//foreach loop
		for(String e :hs) {
			System.out.println(e);
		}
		
		//iterator
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//foreach loop with lambda
		hs.forEach(test ->{
			System.out.println(test);
		});	
		
		//remove method
		hs.remove("centeral data");
		System.out.println(hs);
		
		
		Set<Integer> first=new java.util.HashSet<>();
		first.addAll(Arrays.asList(new Integer[] {1,2,3,5,6,8,9,10}));
		
		Set<Integer> second =new java.util.HashSet<>();
		second.addAll(Arrays.asList(new Integer[] {3,5,2,4,7,9,1,6}));
		
		// get the union
		Set<Integer> union =new java.util.HashSet<>(first);
		union.addAll(second);
		System.out.println(union);
		
		//get the intersection
		Set<Integer> intersection=new java.util.HashSet<>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		
		//get differ
		Set<Integer> differ=new java.util.HashSet<>(first);
		differ.removeAll(second);
		System.out.println(differ);
		
		
		
	}

}
