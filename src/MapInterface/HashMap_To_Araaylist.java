package MapInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMap_To_Araaylist {

	public static void main(String[] args) {

		
		HashMap<String, Integer> comp=new HashMap<>();
		comp.put("TCS", 1500);
		comp.put("Infosys", 10000);
		comp.put("congnizent", 8000);
		comp.put("IBM", 5000);
		comp.put("Wiprow", 4500);
		
		System.out.println("comp size: " + comp.size());
		
		Iterator it =comp.entrySet().iterator();
		
		while(it.hasNext()) {
		Map.Entry pairs=(Map.Entry)it.next();
			System.out.println(pairs.getKey() + " = " +pairs.getValue());
		}
		System.out.println("--------------------");
		
	   comp.forEach((k,v) -> System.out.println("key ="  +k +"value =" +v));
	   
		System.out.println("--------------------");

		//convert to hashmap keys into arraylist
		List<String> complist=new ArrayList<String>(comp.keySet());
		for(String t :complist) {
			System.out.println(t);  
		}
		
		//convert to hashmap values into arraylist
      List<Integer> emplist=new ArrayList<>(comp.values());
		System.out.println("total emp values count =" + emplist.size());
		for(Integer e:emplist) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
	}

}
