/**
 * @(#)Looplab3.java
 *
 *
 * @author Ryan Guistwite
 *	3/15/16
 * @version 1.00 2016/3/15
 */

// Lab Complete
// Score 9.9/10

// -0.1: Formatting (code indentation)

import java.util.Scanner;

class Labloop3
{
	public static void main (String hey[]){
		
		Scanner in = new Scanner (System.in);
		
		int fact = 1;
		int factbot = 1;
		
		System.out.println("Please enter your first number:");
		int n = in.nextInt();
		System.out.println("Please enter your second number:");
		int r = in.nextInt();
		
		while(n<= 0)
   {
     		System.out.println("Your first number has to be greater than zero");
      		System.out.println("Please enter a number greater than zero"); 
      		n = in.nextInt();
   }
   		while(r<= 0)
   {
     		System.out.println("Your second number has to be greater than zero");
      		System.out.println("Please enter a number greater than zero"); 
      		r = in.nextInt();
   }
      		while(n <= r)
   {
     		System.out.println("Your first number must be bigger than your second number");
      		System.out.println("Please enter a number greater than the second number"); 
      		n = in.nextInt();
   }
		
		for(int a=1 ; a <= n ; a++)
	{
		
		fact = fact * a;
		}
	int botnumber = n - r;
	
		for(int b=1 ; b <= botnumber ; b++)
	{
		
		factbot = factbot * b;
		}
	int perm = fact / factbot;
	
	System.out.printf("\n\n\n\n\n\n\n%s%d","Permutations: ",perm);
		
    
	}
}