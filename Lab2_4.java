/**
 * @(#)Labloop4.java
 *
 *
 * @author Ryan Guistwite
 *	Date: 3/17/16
 * @version 1.00 2016/3/17
 */

// Lab Complete
// Score 10/10

import java.util.Scanner;

class Labloop4
{
	public static void main (String EZ[]){
  
		Scanner in = new Scanner (System.in);
		int prime = 0;
		System.out.println("Please enter your the value you want:");
		int number1 = in.nextInt();  // This will allow you to enter the number you want the factors of //
		
		while(number1 <= 0){//This will error check to see if the number is less than or equal to zero and ask for a new number if it is // 
 
     		System.out.printf("%s","\n\n\n\n\n\n\n\nYour number has to be greater than zero\n");
      		System.out.println("Please enter a number greater than zero"); 
      		number1 = in.nextInt();
		}
		System.out.printf("%s","\n\n\n\n\n\n\nFactors: ");
		for(int a=1 ; a < number1 ; a++){ // This loop will keep int a going up by one until it gets to the number entered above // 
     		if(number1 % a ==0){ // This will check to see if the a is a factor of number1 if it is then it will print out the number //
        		System.out.printf("%d%s",a, ",");
        		prime++; // This will add one to the prime variabe which be used to see if it is prime later // 
     		}
		}
		System.out.printf("%d",number1); // This allows the last number not to have a comma at the end of it //
		if(prime==1){// This will check to see if the number is prime // 
			System.out.printf("%s","\nThe number you entered is prime");
		}
	}
}