package com.cts;

import java.util.Scanner;

public class Coding1 {

	public static void main(String[] args) {// swapping two numbers using scanner

		
// method 1
		
		/* int a, b, temp;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      a = s.nextInt();
	      System.out.print("Enter the Second Number: ");
	      b = s.nextInt();
	      
	      temp = a;
	      a = b;
	      b = temp;
	      
	      System.out.println("\na = " +a);
	      System.out.println("b = " +b);  */
		
//method 2
	      
	   /*   Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      int a = s.nextInt();
	      System.out.print("Enter the Second Number: ");
	      int b = s.nextInt();
	      
	      System.out.println("\n----Before Swap----");
	      System.out.println("a = " +a);
	      System.out.println("b = " +b);
	      
	      int temp = a;
	      a = b;
	      b = temp;
	      
	      System.out.println("\n----After Swap----");
	      System.out.println("a = " +a);
	      System.out.println("b = " +b);    */
		
		
//method 3-- confused
		
		
	/*	Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      int numOne = s.nextInt();
	      System.out.print("Enter the Second Number: ");
	      int numTwo = s.nextInt();
	      
	      System.out.println("\n----Before Swap----");
	      System.out.println("numOne = " +numOne);
	      System.out.println("numTwo = " +numTwo);
	      
	      numOne = numOne + numTwo;
	      numTwo = numOne - numTwo;
	      numOne = numOne - numTwo;
	      
	      System.out.println("\n----After Swap----");
	      System.out.println("numOne = " +numOne);
	      System.out.println("numTwo = " +numTwo);   */
		
		
//method 4
		
		/*
		 Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      int a = s.nextInt();
	      System.out.print("Enter the Second Number: ");
	      int b = s.nextInt();
	      
	      System.out.println("\n----Before Swap----");
	      System.out.println("a = " +a);
	      System.out.println("b = " +b);
	      
	      swap(a, b);
	   }
	   
	   public static void swap(int x, int y)
	   {
	      int z;
	      z = x;
	      x = y;
	      y = z;
	      
	      System.out.println("\n----After Swap----");
	      System.out.println("a = " +x);
	      System.out.println("b = " +y);   */
		
// method 5
		
		Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      int a = s.nextInt();
	      System.out.print("Enter the Second Number: ");
	      int b = s.nextInt();
	      
	      System.out.println("\n----Before Swap----");
	      System.out.println("a = " +a);
	      System.out.println("b = " +b);
	      
	      a = a^b;
	      b = a^b;
	      a = a^b;
	      
	      System.out.println("\n----After Swap----");
	      System.out.println("a = " +a);
	      System.out.println("b = " +b); 
		
	}

}
