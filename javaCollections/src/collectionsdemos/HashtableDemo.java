package collectionsdemos;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {

		// Hashtable t = new Hashtable();//default capacity is 11 and load factor is
		// 0.75

		// Hashtable t = new (initial capacity);// create hashtable object with some
		// capacity

		// Hashtable t = new Hashtable(initial capacity, fill ratio/load factor);

		Hashtable<Integer, String> t = new Hashtable<Integer, String>();

		t.put(101, "siva");
		t.put(102, "willadams");
		t.put(103, "sridharan");
		t.put(104, "Kogul");
		// t.put(null,"Arun");// java.lang.NullPointerException
		// t.put(107, null);// java.lang.NullPointerException
		System.out.println(t);// {104=Kogul, 103=sri, 102=willadams, 101=siva}

		System.out.println(t.get(103));// sridharan

		t.remove(102);
		System.out.println(t);// {104=Kogul, 103=sridharan, 101=siva}

		System.out.println(t.containsKey(103));// true
		System.out.println(t.containsKey(105));// false

		System.out.println(t.containsValue("Kogul"));// true
		System.out.println(t.containsValue("raja"));// false

		System.out.println(t.isEmpty());// false

		System.out.println(t.keySet());// [104, 103, 101] duplicates not allowed in key
		System.out.println(t.values());// [Kogul, sridharan, siva] duplicate allowed in value

		// using forech loop
		for (int k : t.keySet()) {
			System.out.println(k + "     " + t.get(k));

		}

		System.out.println();
		for (Map.Entry entry : t.entrySet()) {

			System.out.println(entry.getKey() + "   " + entry.getValue());

		}
		System.out.println();
		//iterator 
		
		Set s=t.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
	}

}
