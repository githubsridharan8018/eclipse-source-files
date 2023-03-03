package collectionsdemos;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList l =new LinkedList(); 
		
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList new_lk = new LinkedList();
		new_lk.addAll(l);
		System.out.println(new_lk);//[X, Y, Z, A, B, C]
		
		new_lk.removeAll(l);
		System.out.println(new_lk);//[]
		
		System.out.println("Before sorting:"+l);//[X, Y, Z, A, B, C]
		Collections.sort(l);
		System.out.println("After sorting:"+l);//[A, B, C, X, Y, Z]
		
		Collections.shuffle(l);
		System.out.println("After shuffling:"+l);//[Z, A, Y, C, B, X]
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Sorted in reverse order:"+l);//[Z, Y, X, C, B, A]

				
				
		
		
	}

}
