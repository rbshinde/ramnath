package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMethodTest {

	public static void main(String[] args) {
	Integer [] arr = {2,5,6,8,10,1,4,3,};
	List<Integer> list = Arrays.asList(arr);
	List list1 = new ArrayList<>();
	
	list1.add(5);
	list1.add(2);
	list1.add(6);
	list1.add(3);
	//list1.sort(list1);
	list.forEach(x -> System.out.println(x));
	System.out.println();
	Collections.sort(list);
	
	list.forEach(x -> System.out.println(x));
	//System.out.println(list.size());
	/*for (Object val : list) {
		System.out.println(val);
		
	}*/
	
	//list.sort(list);
	}

}
