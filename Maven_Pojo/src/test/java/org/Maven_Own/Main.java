package org.Maven_Own;

import com.mav.Basic;

public class Main {//POJO CONCEPT

	public static void main(String[] args) {
		
		
		Basic ob = new Basic();
		
		
		int getsalary = ob.getsalary();
		
		System.out.println(getsalary);
		
		ob.setsalary(4000);
		
		int getsalary2 = ob.getsalary();
		System.out.println(getsalary2);

	}

}
