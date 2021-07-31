package Array_Concepet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Compare_TwoAraayLists {

	public static void main(String[] args) {

		ArrayList<String> l1=new ArrayList<String>(Arrays.asList("a","b","c","d","f"));
		
		ArrayList<String> l2=new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
		
		ArrayList<String> l3=new ArrayList<String>(Arrays.asList("b","c","d","a","f"));
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2)); //false
		
		Collections.sort(l3);
		System.out.println(l1.equals(l3)); //true
		
		//2.compare two list --find out the additional elements:
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

//		l4.removeAll(l5);
//		System.out.println(l4); //F
		
		//3.find out the missing element
		l5.removeAll(l4);
		System.out.println(l5); //E
		
		//4.find out common elements
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("java","python","C","Ruby","JS"));

		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("java","python","C#","Ruby","JS"));

		lang1.retainAll(lang2);
		System.out.println(lang1);
		
		
	}

}
