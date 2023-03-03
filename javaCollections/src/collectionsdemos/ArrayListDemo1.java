package collectionsdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		// Declare ArrayList

		// ArrayList<Integer> al = new ArrayList<Integer>();

		// ArrayList<String> al = new ArrayList<String>();

		// List al = new ArrayList();

		ArrayList al = new ArrayList();

		al.add(100);
		al.add("Welcome");
		al.add(80.8);
		al.add('S');
		al.add(true);

		System.out.println(al);// [100, Welcome, 80.8, S, true]

		// size()
		System.out.println("Number of elements in arraylist:" + al.size());// 5

		// remove
		al.remove(1);// here 1 is index
		// al.remove("Welcome");// here welcome is element
		System.out.println("After removing element in array list:" + al);// [100, 80.8, S, true]

		// insert a new element
		// add(index,object)

		al.add(2, "JAVA");
		System.out.println("After insertion:" + al);// After insertion:[100, 80.8, JAVA, S, true]

		// retreive a specific element
		System.out.println(al.get(2));// JAVA, here 2 is index of element/object

		// change element /replace
		al.set(2, "CYPRESS");
		System.out.println("after replacing a new element:" + al);// [100, 80.8, CYPRESS, S, true]

		// search a element in an array list using contains()
		System.out.println(al.contains("CYPRESS"));// true
		System.out.println(al.contains("JAVA"));// false

		// isEmpty
		System.out.println(al.isEmpty());// false

		// By using for loop we can retrive the elements in array list

		/*
		 * System.out.println("using for loop to retrieve the elements in array");
		 * 
		 * for (int i = 0; i < al.size(); i++) {
		 * 
		 * System.out.println(al.get(i));
		 * 
		 * }
		 * 
		 * // By using for each loop we can retrive the elements in array list
		 * System.out.println("using for each loop to retrieve the elements in array");
		 * for (Object value : al) { System.out.println(value);
		 * 
		 * }
		 */

		// By using iterator we can retrive the elements in array list

		System.out.println("using iterator to retrieve the elements in array");

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());// printing the element and move to next element
		}
	}

}
