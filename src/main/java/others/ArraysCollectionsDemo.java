package others;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysCollectionsDemo {
	public static void main(String[] args) {
		//int [] a = {1,2,1,3,1,2,1};// we should not pass primetive array to Arrays.asList.
		Integer [] a = {1,2,1,3,1,2,1};
		List<Integer> list = Arrays.asList(a);// converts array a to list .
		System.out.println(list);
		//list.add(10); //throws comiplation error
		Collections.sort(list);// sorts the list.
		System.out.println("aftersorting = " + list);
	}

}
