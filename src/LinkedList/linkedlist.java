package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		
		//add method
		
		ll.add("Selenium");
		ll.add("Qtp");
		ll.add("Sql");
		ll.add("cucumber");
		ll.add("Testng");
		
		System.out.println("content of linkedlist :"+ ll);
		
		
		//addfirst
		
		ll.addFirst("Phani");
		System.out.println("content of linked list"+ ll);
		
		//addlast
		
		ll.addLast("QA");
		System.out.println("content of linked list"+ ll);

		
		//get
		System.out.println(ll.get(3));
		  
		//set
		ll.set(0, "Java");
		System.out.println(ll.get(0));
		
		//Remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linked list"+ ll);
		
		
		//remove specific element
		ll.remove(2);
		System.out.println("content of linked list"+ ll);
		
		//clear method
		ll.clear();
		System.out.println("clear all");
		
		//print all elements in the list
		
		//forloop
		System.out.println("-------forloop----");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		
		//advanced forloop
		System.out.println("-------advanced forloop----");
        for(String str : ll) {
	   System.out.println(str);
       }
        
        //iterator
        System.out.println("-------iterator----");
        Iterator<String> it=ll.iterator();
        while(it.hasNext()) {
        System.out.println(it.next());
        }
        
        //whlie loop
        System.out.println("-------While forloop----");
        int num=0;
        while(ll.size()>num) {
        	System.out.println(ll.get(num));
        	num++;
        }
 }	
	}


