package collectionsdemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {//certain ways to declare HashSet
		
		HashSet hs = new HashSet();//Default capacity is 16 and Load factor is 0.75
		
		//HashSet hs = new HashSet(100);//initial capacity 100
		
		//HashSet hs = new HashSet(100, (float)0.90);
		
		//HashSet<Integer> hs = new HashSet<Integer>();
		
		//Add objects/Elements into HashSet
		hs.add(100);
		hs.add("Welcome");
		hs.add(80.08);
		hs.add('S');
		hs.add(true);
		hs.add(null);
		System.out.println(hs);//[null, S, 100, Welcome, 80.08, true]
		//insertion order in not preserved
		
		//remove()
		hs.remove(80.08);//value
		System.out.println("After removing element or object:"+hs);//[null, S, 100, Welcome, true]

		//contins()
		System.out.println(hs.contains("Welcome"));//true
		System.out.println(hs.contains("123"));//False
		
		System.out.println(hs.isEmpty());//false
		
		//to read the data in hashset using for each loop
		
		for (Object e : hs) {
			System.out.println(e);
		}
		
		//using Iterator
		Iterator it = hs.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
	}

}
