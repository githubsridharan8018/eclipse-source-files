package com.tcs;

public class Parent {//parent class 

	
	
	public void land() {
System.out.println("property");
	}
	
	public void bike() {
System.out.println("yamaha");
	}
	
	public void car() {
System.out.println("bmw");
	}
	
	public void Bus() {
System.out.println("Transking");
	}
	
	public static void main(String[] args) {//up casting
	
		
		Parent b=new Child();
		b.bike();
		b.land();
		b.car();// cant able to call child own method in up casting we 
		//return back parent own method 
	}
}
