package collectionsdemos;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		//specific methods
		
		LinkedList l = new LinkedList();
		l.add("dog");
		l.add("dog");
		l.add("bird");
		l.add("cat");
		System.out.println(l);//[dog, dog, bird, cat]
		
		l.addFirst("Loin");
		l.addLast("Tiger");
		
		System.out.println(l);//[Loin, dog, dog, bird, cat, Tiger]
		
		System.out.println(l.getFirst());//Lion
		System.out.println(l.getLast());//Tiger
		
		l.removeFirst();
		l.removeLast();
		System.out.println("After removing first and last elements:"+ l);//[dog, dog, bird, cat]
		

	}

}
