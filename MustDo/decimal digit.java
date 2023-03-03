/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception {
		// your code goes here
		int n = 456;
		
		while( n > 0){
		  int temp = n%10;
		  System.out.println( temp);
		  n = n/10;
		}
		
	}
	
	// but whqat if it is decimal value. ↓
  public static void decimaldgt(int n){
    double num = 123.45; // Replace with your desired number
    
    // Convert the number to a string and remove the decimal point
    String numStr = String.valueOf(num).replace(".", "");
    
    // Iterate over each character in the string and print it
    for (int i = 0; i < numStr.length(); i++) {
        System.out.println(numStr.charAt(i));
    }
  }
}