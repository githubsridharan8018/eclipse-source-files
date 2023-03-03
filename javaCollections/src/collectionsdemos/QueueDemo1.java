package collectionsdemos;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue();

		// addding elements add() offer()

		q.add("A");
		q.add("B");
		q.add("C");
		//q.offer(100);//not allowed in queue (hetrogenious data)
		//it throws class cast exception at run time

		System.out.println(q);// [A, B, C, C] insertion order and duplicates allowed

		// get head element() peek()
		// System.out.println(q.element());//A Returns head element , if Queue is empty
		// returns NoSuchElementException

		// System.out.println(q.peek()); //A Returns head element , if Queue is empty it
		// returns [] null

		// Return and Remove element remove() poll()

		// System.out.println(q.remove());//A
		// System.out.println(q);//[B, C, C]

		// System.out.println(q.poll());//A
		// System.out.println(q);//[B, C, C]

	/*	Iterator itr = q.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		for (Object element : q) {
			System.out.println(element);
			
		}

	}

}
