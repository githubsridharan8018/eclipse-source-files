package collectionsdemos;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {

		// Declare a linked list

		LinkedList l = new LinkedList(); // it stores hetrogeneous data

		// LinkedList<Integer> l = new LinkedList<Integer>(); // it stores numbers
		// LinkedList<String> l = new LinkedList<String>(); // it stores String values

		// add elements into linked list
		l.add(100);
		l.add("JAVA");
		l.add(80.08);
		l.add('A');
		l.add(true);
		l.add(null);

		System.out.println(l);// [100, JAVA, 80.08, A, true, null]

		// size
		System.out.println(l.size());// 6

		// remove
		l.remove(3);// remove by index
		// l.remove('A');// remove by value
		System.out.println("After removing new list:" + l);

		// inserting /adding the element in the middle of linked list
		l.add(3, "CYPRESS");
		System.out.println("After inserting element:" + l);// [100, JAVA, 80.08, CYPRESS, true, null]

		// retriving value/object
		System.out.println(l.get(3));// CYPRESS

		// replace the value
		l.set(5, "X");
		System.out.println("After changing the value:" + l);// [100, JAVA, 80.08, CYPRESS, true, X]

		// contains()
		System.out.println(l.contains("JAVA"));// true
		System.out.println(l.contains("null"));// false

		// isEmpty()
		System.out.println(l.isEmpty());// false

		// to read the linked list data to retrive the object

		// using for loop
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));

		}
		// using for each loop
		for (Object value : l) {
			System.out.println(value);

		}
		
		//using iterator ()
		Iterator it =l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
		
	}

}
