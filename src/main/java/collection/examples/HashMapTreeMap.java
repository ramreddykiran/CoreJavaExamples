package collection.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTreeMap {
	public static void main(String[] args) {
		HashMapTreeMap hashMapTreeMap = new HashMapTreeMap();
	Map<String,String> hashMap	=  hashMapTreeMap.createHashMap();
	Map<String,String> treeMap	=  hashMapTreeMap.createTreeMap();
	//System.out.println("hashMap = " + hashMap);
	//System.out.println("treeMap = " + treeMap);
	Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
	map.put(1, Arrays.asList(1,3,4,5));
	map.put(6, Arrays.asList(1,3,4,5));
	map.put(3, Arrays.asList(1,3,4,5));
	map.put(2, Arrays.asList(1,3,4,5));
	System.out.println(map);
	//treeMap.put(null,"value4");// it throws NullPointerException.
	}

	private Map<String, String> createTreeMap() {
		Map<String,String> map = new TreeMap<String,String>();
		map.put("key1","value1");
		map.put("key2","value2");
		map.put("key5","value5");
		map.put("key4","value1");
		map.put("key1",null);
		map.put("key2","value7");
		map.put("key10",null);
		map.put("key3","value3");
		return map;
	}

	private Map<String, String> createHashMap() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("key1","value1");
		map.put("key2","value2");
		map.put("key5","value5");
		map.put("key4","value1");
		map.put(null,"value1");
		map.put("key1",null);
		map.put(null,"value6");
		map.put("key7","value7");
		map.put("key2",null);
		map.put("key3","value3");
		return map;
	}
	
	

}
