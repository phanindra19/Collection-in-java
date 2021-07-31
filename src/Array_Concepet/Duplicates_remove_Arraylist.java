package Array_Concepet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates_remove_Arraylist {

	public static void main(String[] args) {

		ArrayList<Object> numbers = new ArrayList<Object>(Arrays.asList(1,2,3,4,5,6,7,8,9,3,8,9,8,7,5,7,5,6));
		
		//1.LinkedHashset
		
		LinkedHashSet<Object> lhashset=new LinkedHashSet<Object>(numbers);
		
		ArrayList<Object> numbersListWithoutDuplicates =new ArrayList<Object>(lhashset);
		
		System.out.println(numbersListWithoutDuplicates);
		
		//2.Jdk 8 -- stream
		
		ArrayList<Integer> markslist= new ArrayList<Integer>(Arrays.asList(8,9,6,8,9,4,3,6,9,2,2,5,6));
		
		List<Integer> mlistunique= markslist.stream().distinct().collect(Collectors.toList());
		System.out.println(mlistunique);
		
		
	}

}
