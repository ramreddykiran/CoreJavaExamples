package collection.examples;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapFibonocciSeries {

	public static void main(String[] args) {
		HashMapFibonocciSeries series = new HashMapFibonocciSeries();
		// series.createLists(4);
		Map<Integer, List<Integer>> map1 = series.createFibonocciMap(4);
		System.out.println(map1);
	}

	private Map<Integer, List<Integer>> createFibonocciMap(int n) {
		Map<Integer, List<Integer>> map1 = new LinkedHashMap<>();
		for (int i = 1; i <= n; i++) {
			List<Integer> list1 = fibSeries2(i);
			if (list1.contains(i)) {
				map1.put(i, list1);
			}
		}
		return map1;

	}

	public List<Integer> fibSeries2(int input) {
		List<Integer> l1 = new ArrayList<>();
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		l1.add(n1);
		l1.add(n2);
		// System.out.print(n1 + "," + n2);
		while (n3 <= input) {
			n3 = n1 + n2;
			if (n3 <= input) {
				l1.add(n3);
				// System.out.print("," + n3);
			}
			n1 = n2;
			n2 = n3;

		}
		return l1;
	}

	private void createLists(int n) {
		for (int i = 1; i <= n; i++) {
			List<Integer> l1 = new ArrayList<>();
			for (int count = 0; count <= i; count++) {
				l1.add(count);
			}
			System.out.println(l1);
		}
	}

}
