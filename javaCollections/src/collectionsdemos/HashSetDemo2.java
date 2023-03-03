package collectionsdemos;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		
		HashSet<Integer> even = new HashSet<Integer>();
		
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		System.out.println("HashSet:"+even);//[2,4,6,8]

		HashSet<Integer> no = new HashSet<Integer>();
		no.addAll(even);
		no.add(10);
		System.out.println("New HashSet:" +no);//[2, 4, 6, 8, 10]
		
		//removeAll()
		no.removeAll(even);
		System.out.println(no);

		
	}	
	

}
