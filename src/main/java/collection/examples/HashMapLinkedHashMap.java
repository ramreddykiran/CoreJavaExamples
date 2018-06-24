package collection.examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapLinkedHashMap {
	public static void main(String[] args) {
		HashMapLinkedHashMap hashMapLinkedHashMap= new  HashMapLinkedHashMap();
		Map<String,String> hashMap = hashMapLinkedHashMap.createHashMap();
		Map<String,String> linkedHashMap= hashMapLinkedHashMap.createLinkedHashMap();
		System.out.println("hashMap = " + hashMap);
		System.out.println("linkedHashMap = " + linkedHashMap);
	}

	private Map<String, String> createLinkedHashMap() {
		
		Map<String,String> map = new LinkedHashMap<String,String>();
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
