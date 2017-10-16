package collection.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterationExample {
	
	public List<String> prepareList(int size) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < size; i++) {
			list.add("element: " + i);
		}
		return list;
	}

	public static void main(String... args) {
		ArrayListIterationExample arrayListExample = new ArrayListIterationExample();
		List<String> list = arrayListExample.prepareList(4);
		System.out.println(list);
		arrayListExample.iterateListWithFormalForloop(list);
		arrayListExample.iterateListWithForeachloop(list);
		arrayListExample.iterateListWithIterator(list);
		arrayListExample.iterateListWithListIterator(list);

	}

	private void iterateListWithForeachloop(List<String> list) {
		System.out.println("iterateListWithForeachloop");
		for (String s : list) {
			System.out.print(s + "  ");
		}
	}

	private void iterateListWithFormalForloop(List<String> list) {
		System.out.println("iterateListWithFormalForloop");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "  ");

		}

	}

	private void iterateListWithListIterator(List<String> list) {
		System.out.println("iterateListWithListIterator");
		ListIterator<String> litr = list.listIterator();

		System.out.println("forward direction");
		while (litr.hasNext()) { // it executes till the control reaches last
									// element
			String element = litr.next();
			System.out.print(element + "+"); // element0+element1+element2+element3+element4+

		}
		System.out.println("backward direction");
		while (litr.hasPrevious()) { // in the above while loop control will be
										// at the end of list.
			// if we iterate, it executes from last element to first.
			// it executes till the control reaches first element
			Object element = litr.previous();
			System.out.print(element + " "); // element4 element3 element2
												// element1 element0
		}

	}

	private void iterateListWithIterator(List<String> arraylist) {
		System.out.println("iterateListWithIterator");
		Iterator<String> itr = arraylist.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
	}

}
