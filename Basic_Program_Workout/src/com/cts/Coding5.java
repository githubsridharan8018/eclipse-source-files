package com.cts;

import java.util.Scanner;

public class Coding5 {

	public static void main(String[] args) {//given char is vowel or consonant

		//METHOD 1
		
/*		char ch;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter an Alphabet: ");
	      ch = scan.next().charAt(0);
	      
	      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
	         ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	         System.out.println("\nIt is a Vowel.");
	      else
	         System.out.println("\nIt is a Consonant.");
*/
	
		
   //METHOD 2		
/*		char ch;
	      int count=0;
	      char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter an Alphabet: ");
	      ch = scan.next().charAt(0);
	      
	      for(int i=0; i<10; i++)
	      {
	         if(ch==vowels[i])
	         {
	            count++;
	            break;
	}

}
	      if(count==0)
	          System.out.println("\n" +ch+ " is a Consonant");
	       else
	          System.out.println("\n" +ch+ " is a Vowel");      
	*/
		
	//METHOD 3
		
		Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter an Alphabet: ");
	      char ch = scan.next().charAt(0);
	      
	      int ascii = ch;
	      if(ch==65 || ch==69 || ch==73 || ch==79 || ch==85)
	         System.out.println("\n\'" +ch+ "\' is an Uppercase Vowel.");
	      else if(ch==97 || ch==101 || ch==105 || ch==111 || ch==117)
	         System.out.println("\n\'" +ch+ "\' is a Lowercase Vowel.");
	      else
	      {
	         if((ascii>=65 && ascii<=90) || (ch>=97 && ch<=122))
	            System.out.println("\n\'" +ch+ "\' is a Consonant.");
	         else
	            System.out.println("\n\'" +ch+ "\' is neither a Vowel nor a Consonant.");
	      }
	      
	      
	}}
