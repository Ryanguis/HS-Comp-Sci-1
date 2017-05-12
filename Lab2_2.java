/**
 * @(#)Labloop2.java
 *
 *
 * @author Ryan Guistwite
 * 3/11/16
 * @version 1.00 2016/3/11
 */
 
// Lab Complete
// Score 9.9/10

// -0.1: Formatting (code indentation)

import java.util.Scanner;

class Labloop
{
	public static void main (String moo[]){
		
		Scanner in = new Scanner (System.in);
		
		int total=0;
		int numbers =0;
		System.out.println("Please enter your starting value");
		int number1 = in.nextInt();
	
		System.out.println("Please enter your ending value");
		int number2 = in.nextInt();
		
		while(number1>number2)
   {
     		System.out.println("Your first number is greater than your second number :(");
      		System.out.println("Please enter a number greater than your first number "); 
      		number2 = in.nextInt();
   }

	for(int a=number1 ; a <= number2 ; a++)
	{
		if (a % 2 != 0){
		total =total + a;
		numbers++;
		}

	}

	
	double average = (double)(total)/numbers;
	System.out.printf("\n\n\n\n\n\n%s%d\n%s%.2f","Sum:",total,"Average: ", average);
		
		
		
    }
    
    
}