/*
Output: System.out.println();
Input : make a object of class Scanner and then 
        call function for input.
*/

import java.util.Scanner;

public class B2_inout
{
public static void main (String args [])

{
	Scanner sc = new Scanner (System.in);//declaration of a Scanner class object for input via keyboard
	
	System.out.println("Enter your name: ");//output
	String str = sc.next(); //call next function for input 
	
	System.out.println("Hello "+str+"!");//output
}
}