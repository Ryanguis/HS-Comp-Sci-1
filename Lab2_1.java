/**
 * @(#)LabLoop.java
 *
 *
 * @author Ryan Guistwite
 * Date 3/9/16
 * @version 1.00 2016/3/9
 */

// Lab Complete
// Score 10/10

import java.util.Scanner;

class Labloop
{
	public static void main (String cats[]){
	

	
	Scanner in = new Scanner (System.in);
	
	System.out.println("Please enter your starting value");
	int number1 = in.nextInt();
	
	System.out.println("Please enter your ending value");
	int number2 = in.nextInt();
	
	
	System.out.printf("\n\n\n\n%-3s%4s%8s\n","X","X Sq","X Cube");
	for(int a=number1 ; a <= number2 ; a++)
	{
	int numbersq = a*a;
	int numbercube = a*a*a;
	
	System.out.printf("%-3d%-6d%-10d\n",a,numbersq,numbercube);	
	}
	System.out.printf("\nMultiples of 3");
	System.out.printf("\n\n%-3s%4s%8s\n","X","X Sq","X Cube");
	for(int a=number1 ; a <= number2 ; a++)
	{
		int numbersq = a*a;
		int numbercube = a*a*a;
		
		if (a%3==0) {
        System.out.printf("%-3d%-6d%-10d\n",a,numbersq,numbercube);
		}
	}
	}
    
}