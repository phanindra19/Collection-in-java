package MapInterface;

import java.util.HashMap;import java.util.Map.Entry;

import Array_Concepet.Employee;

public class Hasmap {
	
	public static void main(String[] args) {
		 
		
		HashMap<Object,Object> hm=new HashMap<Object, Object>();
		hm.put(1, "Selenium");
		hm.put(2, "QA");
		hm.put(3, "Testcase");
		hm.put(4, "testrunner");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		
		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		System.out.println(hm);
		hm.remove(4);
		System.out.println(hm);
		
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 =new Employee("ravi",24,"dev",25000);
		Employee e2 =new Employee("mohne",26,"dev",35000);
		Employee e3 =new Employee("siva",25,"qa",45000);

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the hashmap
		
		    for(Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e =m.getValue();
			System.out.println("-------info----");
		
		}
		    
	}

}
