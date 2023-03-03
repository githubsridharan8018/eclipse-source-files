package collectionsdemos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		String arr[] = { "bird", "cat", "dog" };

		for (String value : arr) {
			System.out.println(value);

		}
		
		//to convert array to arraylist
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
	}

}
