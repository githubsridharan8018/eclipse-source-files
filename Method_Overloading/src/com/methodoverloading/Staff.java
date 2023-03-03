package com.methodoverloading;

public class Staff {  //method overloading
	
	public void man(int a) {
     System.out.println("the int data =" +a);
     
	}
	
	public void man(int c,String d,char s) {
		
		System.out.println("the int value =" +c);
		System.out.println("the string name =" +d);
		System.out.println("the char name =" + s);
	}
	
	
	
	public static void main(String[] args) {
		Staff o=new Staff();
		o.man(80);
		o.man(70, "sridharan",'s');
		
		
	}

}

	

	
	
	
	
	


