package collectionsdemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		// HashMap m = new HashMap();

		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(101, "Jadeja");
		m.put(102, "Javeed");
		m.put(103, "adams");
		m.put(104, "Jack");
		m.put(105, "Sparrow");
		m.put(103, "Name");
		m.put(106, "");

		System.out.println(m);
		// output {101=Jadeja, 102=Javeed, 103=adams, 104=Jack, 105=Sparrow}

		System.out.println(m.get(105));// Sparrow

		System.out.println(m.remove(106));// remove pair from HashMap
		System.out.println(m);
		// output {101=Jadeja, 102=Javeed, 103=Name, 104=Jack, 105=Sparrow}

		System.out.println(m.containsKey(101));// true
		System.out.println(m.containsKey(107));// false

		System.out.println(m.containsValue("Jack"));// true
		System.out.println(m.containsValue("Sri"));// false

		System.out.println(m.isEmpty());// false

		System.out.println(m.keySet());// returns all the keys ias set
		// [101, 102, 103, 104, 105]

		// using for each loop to iterate the entry or pair in hashset
		for (Object i : m.keySet()) {
			System.out.println(i);
		}

		System.out.println(m.values());// returns all the values as collection
		// [Jadeja, Javeed, Name, Jack, Sparrow]

		// using for each loop to iterate the entry or pair in hashset
		for (Object i : m.values()) {
			System.out.println(i);

		}

//		Set entrySet = m.entrySet();
//		System.out.println(entrySet);//returns all the entries as Set
//		//[101=Jadeja, 102=Javeed, 103=Name, 104=Jack, 105=Sparrow]

//		System.out.println(m.keySet());// returns all the keys ias set
//		
//		for(Object i:m.keySet()) 
//		{
//			System.out.println(i+" "+m.get(i));
//			
//		}
//		//Entry methods
//		//*****************
//		
//		for(Map.Entry entry:m.entrySet()) 
//		{
//		System.out.println(entry.getKey()+" "+entry.getValue());	
//		}

		// iterator()

		Set s = m.entrySet();
		
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}
}
