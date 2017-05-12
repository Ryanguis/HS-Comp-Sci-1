/**
 * @(#)Lab8.java
 *
 *
 * @author Ryan Guistwite
 * Date 2/29/16
 * @version 1.00 2016/2/24
 */

// Lab Complete
// Score 10/10

import java.util.Scanner;

class Lab8 {

    public static void main (String[] spooki){
    	
    	Scanner in = new Scanner (System.in);
    	
    
    	int egg;
    	int doz;
    	double total;
    	double re;
    	// This will take the amount of eggs the user wants to buy//
    	System.out.println ("Please enter the amount of eggs you are buying today");
    	egg = in.nextInt();
    	//This will turn the amount of eggs given into the amount of dozens being purchased//
        doz = egg / 12;
    	//This will make it so the amount of eggs will round up to the next full dozen it has//
    	re = egg%12;
    	
    	if (re > 0){
        	doz++;
        }
        //This will decide the price of each dozen based on the amount the user is purchasing//	
        	
 		if (doz < 4) {
            total = doz * 1.25;
        } else if (doz >= 4 && doz < 6) {
            total = doz * 1.1;
        } else if (doz >= 6 && doz < 11) {
            total = doz * .95;
        } else{
            total = doz * .75;
        } 
        
        //This will print out the dozens being purchased and the total cost//
        System.out.println("Dozens: " + doz);
        System.out.printf("%-10s %.2f \n","Total Cost: $",total);
    
    }
}