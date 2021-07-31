package Array_Concepet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Synchronize_ArrayList {

	public static void main(String[] args) {

		List<String> namelist= Collections.synchronizedList(new ArrayList<String>());
		
		namelist.add("List");
		namelist.add("Set");
		namelist.add("Map");
		
		//Add,remove - we donot need explicit synchronization
		
		// to fetch/traverse values from this list -- we have to use exlicit sychronization
		
		synchronized (namelist) {
			Iterator<String> it= namelist.iterator();
			
			while (it.hasNext()) {
				System.out.println(it.next());
				
			}
		}
		
		
		//copywriteArrayList -- its a class : thread -safe/synchronized 
		
		CopyOnWriteArrayList<String> emplist= new CopyOnWriteArrayList<String>();
		
		emplist.add("john");
		emplist.add("iron man");
		emplist.add("hulk");
		
		Iterator<String> it= emplist.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());			
		}
		
		
	}

}
