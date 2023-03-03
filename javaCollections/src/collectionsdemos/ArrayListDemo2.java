package collectionsdemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList aladd = new ArrayList();
		aladd.addAll(al);
		System.out.println(al);//[X, Y, Z, A, B, C]
		
		aladd.removeAll(al);
		System.out.println("After removing:" +aladd);//[]
		
		//sorting arraylist using sollections.sort()
		System.out.println("Elements in the arraylist:" +al);//[X, Y, Z, A, B, C]
		Collections.sort(al);
		System.out.println("Elements in the arraylist after sorting:" +al);//[A, B, C, X, Y, Z]
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements in the arraylist after sorting in reverse:" +al);//[Z, Y, X, C, B, A]
		
		//shuffling --collectios.shuffle()
		
		Collections.shuffle(al);
		System.out.println("Elements in the arraylist after shuffling:" +al);//[C, X, A, Z, Y, B]
		
	}

}
