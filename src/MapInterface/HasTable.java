package MapInterface;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HasTable {

	public static void main(String[] args) {

		
		Hashtable h1=new Hashtable();
		
		h1.put(1, "Sql");
		h1.put(2, "Database");
		h1.put(3, "Testing");
		
		//create a clone copy/shallow copy
		Hashtable h2=new Hashtable();
		
		h2=(Hashtable)h1.clone();
		
		System.out.println("the values from h1" + h1);
		System.out.println("the values from h2" +h2);
		
		h1.clear();
		System.out.println("the values from h1" + h1);
		System.out.println("the values from h2" +h2);
		
		//contains 
		
		Hashtable ht=new Hashtable ();
		
		ht.put("a", "Phani");
		ht.put("b", "Sdet");
		ht.put("c", "Working");
		
		if(ht.containsValue("Phani"));
		System.out.println("Test pass");
		
		//print all values
		Enumeration e = ht.elements();
		System.out.println("print values from ht");
		
		while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		}
		
		//print all values using entry set
		
		Set s =ht.entrySet();
		System.out.println(s);
		
		// check the two tables are equal are not
		
		Hashtable ht1=new Hashtable ();
		
		ht1.put("a", "Phani");
		ht1.put("b", "Sdet");
		ht1.put("c", "Working");
		
		
		if(ht1.equals(ht1))
		System.out.println("test pass");
		
		
		//get specific value
		System.out.println(ht.get("a"));
		
		//get hashcode value
		System.out.println("print the hashcode value ht1 :" + ht1.hashCode());
		
		
		
		
	}
}
