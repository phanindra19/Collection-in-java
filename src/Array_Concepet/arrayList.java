package Array_Concepet;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) 
	{
		int a[]=new int[3]; //static array---fixed size
		
		
		//dynamic array ---array list.
		
		ArrayList ar=new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(50);
		
		
		System.out.println(ar.size());

		ar.add(60);
		ar.add(90);
		ar.add(60);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(5));
		
		System.out.println("---------------");
		//to print all values from array list
		//using for loop
		//using iterate
		
		for (int i = 0; i < ar.size(); i++) 
		{
			System.out.println(ar.get(i));
		}
		
		//non generic & generic
		
		 ArrayList<Object> ar1=new ArrayList<Object>();
		 ar1.add("phani");
		 ar1.add(20);
		 ar1.add('s');
		 
		 System.out.println(ar1.get(0));
		 
		 System.out.println("---------------------");
		 
		 
		 //Employee class object
		 
		 Employee e1=new Employee("Phani", 25, "qa", 55000);
		 Employee e2=new Employee("jhon", 25, "admin", 50000);
		 Employee e3=new Employee("richardes", 25, "dev", 65000);
		 
		 ArrayList<Employee> ar2=new ArrayList<Employee>();
		 ar2.add(e1);
		 ar2.add(e2);
		 ar2.add(e3);
		 
		 //itretar is traves the values
		 
		 Iterator<Employee> it=ar2.iterator();
		 while (it.hasNext()) {
			Employee emp=it.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.depa);
			System.out.println(emp.salary);
		}
		 
		 
		 System.out.println("---------------------");
		 
		 
		 
		 //Addall()
		 
		 ArrayList<Object> ar3=new ArrayList<Object>();
		 ar3.add("phani");
		 ar3.add(20);
		 ar3.add('s');
		 
		 ArrayList<Object> ar4=new ArrayList<Object>();
		 ar4.add("smith");
		 ar4.add(23);
		 ar4.add('p');
		 
		 ar3.addAll(ar4);
		 
		 for (int j = 0; j < ar3.size(); j++) {
			System.out.println(ar3.get(j));
		}
		 
		 System.out.println("-----------------");
		 
		 
		 //Removeall
		 ar3.removeAll(ar4);
		 
		 for (int j = 0; j < ar3.size(); j++) {
				System.out.println(ar3.get(j));
			}
		 System.out.println("----------------");
		 
		 //Retainall
		 
		 ArrayList<Object> ar5=new ArrayList<Object>();
		 ar5.add("phani");
		 ar5.add(20);
		 ar5.add('s');
		 
		 ArrayList<Object> ar6=new ArrayList<Object>();
		 ar6.add("smith");
		 ar6.add(20);
		 ar6.add('p');
		 
		 ar5.retainAll(ar6);
		 for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		 
		 
	}

}
