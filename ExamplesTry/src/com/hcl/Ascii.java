package com.hcl;

public class Ascii {
	 
	public static void main(String[] args)   
	{  
	//characters whose ASCII value to be found  
	char ch1 = 'a';  
	char ch2 = 'b'; 
	
	
	for (int i = 'A'; i >='Z'; i--) {
		i=i+3;
		System.out.println(+i);
	}

	//casting or converting a charter into int type  
	int ascii1 = (int) ch1;  
	int ascii2 = (int) ch2;  
	System.out.println("The ASCII value of " + ch1 + " is: " + ascii1);  
	System.out.println("The ASCII value of " + ch2 + " is: " + ascii2);  
	}  
	}  

