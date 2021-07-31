package Array_Concepet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Diff_Ways_to_printList {

	public static void main(String[] args) 
	{
		
		ArrayList<String> course=new ArrayList<String>();
		
		course.add("Java");
		course.add("Selenium");
		course.add("Sql");
		course.add("Mysql");
		course.add("python");
		
		//1. using java 8 with for each loop lambda expression
		
		System.out.println("----print using for with lambda in java 8-----");
		
		course.forEach(cou -> {
			System.out.println(cou);
			});
		//course.stream().forEach(ele -> System.out.println(ele));
		
		//2. using iterator  
		
		System.out.println("----using iteratar---");
		
		Iterator<String> s=course.iterator();
		while(s.hasNext()) {String s1=s.next();
			System.out.println(s1);
		}
		
		//3.using iterator and java 8 lambda and foreachremaing() method
		
		System.out.println("----using iteratar and java 8 lambda and foreachremaing() method---");
		
         s=course.iterator();
         s.forEachRemaining(tran -> {
        	 System.out.println(tran);
         });
		
		//4.for each loop
 		System.out.println("----using foreach loop---");

		for (String cour : course) {
			System.out.println(cour);
		}
		
		
		//5.for loop
		
 		System.out.println("----using forloop---");

		for (int i = 0; i<course.size(); i++) {
			System.out.println(course.get(i));
		}
		
		//6. using a listiterator() to traverse in both the directions 
 		System.out.println("----using listiterator---");

		ListIterator<String> lis=course.listIterator(course.size());
		while(lis.hasPrevious()) {
			String courlis=lis.previous();
			System.out.println(courlis);
		}
		
		System.out.println("-------using Lambda jdk 8-------");
		
		//7. jdk 8 -streams with lambda
		course.stream().forEach(ele -> System.out.println(ele));
	
	}

}
