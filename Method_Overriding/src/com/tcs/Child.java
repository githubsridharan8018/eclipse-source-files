package com.tcs;

public class Child extends Parent {// child class 
	
	
	@Override
	public void land() { // land ctrl + space and override
		super.land();
		System.out.println("gold");
	}
	
	
	@Override
		public void bike() {
			super.bike();
			
			
		}
	private void education() {// child own method
		System.out.println("any degree");

	}
	
	@Override
		public void Bus() {
			// TODO Auto-generated method stub
			super.Bus();
		}
	
public static void main(String[] args) {
	Child o=new Child ();
	o.land();
	o.bike();
	o.car();
	o.education();
	o.Bus();
	
}
}

