package collectionsdemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {

	public static void main(String[] args) {

		
		//LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
		//HashSet lset = new HashSet();
		
		LinkedHashSet lset = new LinkedHashSet();
		
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		System.out.println(lset);
		
		//here we are showing the differenece between
		//hashset and Linked HashSet
		//the Difference is hashset prints in random order -- [400, 100, 500, 200, 300]
		//LinkedHashSet prints in insertion order -- [100, 200, 300, 400, 500]
		
	}

}
