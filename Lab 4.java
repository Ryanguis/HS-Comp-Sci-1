/**
 * @(#)Lab 4.java
 *
 *
 * @author Ryan Guistwite
 * Date 2/10/16
 * @version 1.00 2016/2/10
 */

// Lab Complete
// Score 10/10

// -1: No comments (but you weren't here so I will excuse it)
// When a lab says Pseudo you need to write a comment outlining your lab or explaining what your code does

import java.util.Scanner;


class Lab4 {

    public static void main (String [] Stuff) {
    	
    	double number1;
    	double number2;
  
   		Scanner in = new Scanner (System.in);
	
    	System.out.println ("Enter your first number:");
		number1 = in.nextDouble();
		
		System.out.println ("Enter your second number:");
		number2 = in.nextDouble();
		
		double sum = number1 + number2;
		double product = number1 * number2;
		double quotient = number1 / number2;
		double modulo = number1 % number2;
		double difference = number1 - number2;
		
		
	
			
		System.out.println("Calculator");
    	System.out.println("______________________");
		System.out.printf("%-10s %10.2f \n","Sum:",sum);
		System.out.printf("%-10s %9.2f \n","Difference:",difference);
		System.out.printf("%-10s %10.2f \n","Product:",product);
		System.out.printf("%-10s %10.2f \n","Quotient:",quotient);
		System.out.printf("%-10s %10.2f \n","Remainder:",modulo);
		
		
		
		
	
    	
    	
    }
    
    
}