package MapInterface;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap_Basics {

	public static void main(String[] args) {

		//no oreder -- no indexing
		//strores values -- key-value <k,v>
		//key can not be dulipcate
		//can store number of null values but only one null key
		//Hashmap is not thread-safe -- nonsynchronized
		
		
		HashMap<String, String> capitalmap = new HashMap<String,String>();
		capitalmap.put("India", "New Delhi");
		capitalmap.put("Usa", "Washington Dc");
		capitalmap.put("Uk", "London");
		capitalmap.put("Uk", "London1");
		capitalmap.put(null, "japan");
		capitalmap.put(null, "Russia");
		capitalmap.put("France", null);
		capitalmap.put("germony", null);


		System.out.println(capitalmap.get("Usa"));
		System.out.println(capitalmap.get("Uk"));
		
		System.out.println(capitalmap.get(null));
		System.out.println(capitalmap.get("germony"));
		
		//itertor:		
		Iterator<String> it=capitalmap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = capitalmap.get(key);
			System.out.println("key = "+ key +" value = "+ value);
		}
		
	}

}
