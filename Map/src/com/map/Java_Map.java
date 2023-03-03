package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Java_Map {

	public static void main(String[] args) {  //MAP INTERFACE - HashMap


		Map<Integer, Integer> a = new HashMap<Integer,Integer>();
		a.put(1, 20);  //method --put(KEY,VALUE)
		a.put(2, 100);
		a.put(3, 50);
		a.put(4, 60);
		
		int size = a.size();//method --size()
		
		System.out.println("the map size is ="  + size);
		
		boolean containsKey = a.containsKey(4);//method -- containsKey
		System.out.println("The containskey is present ot not = " + containsKey);
		
		boolean containsValue = a.containsValue(50);//method -- containsValue
		System.out.println("The containsvalue is present or not =" + containsValue);
		
		boolean empty = a.isEmpty();//method -- is empty 
		System.out.println("The value is empty or not =" + empty); 
		
		//a.clear();//method -- clear
		//System.out.println(a);
		
		Integer integer = a.get(4);//method -- get(key)
		System.out.println("The value of get =" + integer );
		
		Set<Integer> keySet = a.keySet();//method -- keyset() -- must use foreach loop 
		//for keyset()  -- set will come 
		for (Integer integer1 : keySet) {
			System.out.println(integer1);
		}

		Collection<Integer> values = a.values();//method -- values()--must use foreach loop
		//for values() -- collection will come
		for (Integer integer2 : values) {
			System.out.println(integer2);
		}
		
		
		Set<Entry<Integer, Integer>> entrySet = a.entrySet();
		System.out.println(entrySet);
		System.out.println(a);
		
			
	}

}
