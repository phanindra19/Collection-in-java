package LinkedListconcepet;

import java.util.Iterator;
import java.util.LinkedList;

public class Diff_methods_linkedlist {

	

          public static void main (String[] args) {
        	  
        	LinkedList<String>  names=new LinkedList<>();
        	  names.add("java");
        	  names.add("core java");
        	  names.add("selenium");
        	  
        	  System.out.println(names.size());
        	  System.out.println(names);
        	  
        	  System.out.println(names.get(2));
        	  
        	  Iterator<String> it=names.iterator();
        	  while(it.hasNext()) {
        		  System.out.println(it.next());
        	  }
 
        	  
        	  names.addAll(names);
        	  System.out.println(names);
        	  
        	  names.removeAll(names);
        	  System.out.println(names);
        	  
        	  
        	  
        	  
        	  
        	  
 }
}        