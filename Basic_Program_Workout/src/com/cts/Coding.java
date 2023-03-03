package com.cts;

import java.util.Scanner;

public class Coding {//Area of square --method 1 -- without using scanner

	public static void main(String[] args) {

		/*{  
		   int s=12;  
		   int area_square=s*s;  
		        System.out.println("Area of the square="+area_square);  
		     }  */
		
	//----------------------------------------------------------------------------------	
		//method  -2
		
		
		 float side, area; // method 2 ---using scanner
		 
		 
	      Scanner s = new Scanner(System.in);
	      
	      
	      System.out.print("Enter the Side Length of Square: ");
	      side = s.nextFloat();
	      
	      area = 4*side;
	      System.out.println("\nArea = " +area);  
		
	}}
		
		
		
		
		
		


