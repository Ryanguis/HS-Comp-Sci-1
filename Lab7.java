/**
 * @(#)Lab7.java
 *
 *
 * @author Ryan Guistwite
 * Date 2/24/16
 * @version 1.00 2016/2/24
 */

// Lab Complete
// Score 9.7/10

// -0.3: 5% discount + 10% discount =/= 15% discount

import java.util.Scanner;

class Lab7 {

    public static void main (String[] spook){
    	
    	Scanner in = new Scanner (System.in);
    	
    	int boltprice = 5;
    	int nutprice = 3;
    	int washerprice = 1;
    	int bolt;
    	int nut;
    	int washer;
    	double totalcostdis;
    	
    	System.out.println ("Please enter the amount of Bolts you are purchasing:");
    	bolt = in.nextInt();
    	
    	System.out.println ("Please enter the amount of Nuts you are purchasing:");
    	nut = in.nextInt();
    	
    	System.out.println ("Please enter the amount of Washers you are purchasing:");
    	washer = in.nextInt();
    	
    	if (nut>=bolt && bolt *2 <= washer){
    		System.out.println("Your order is good to go!");
    	}
    	if (bolt *2 > washer){
    		System.out.println("You have too few washers :(");
    	}
    	if (nut< bolt){
    		System.out.printf("You have too few nuts :( \n\n");
    }
    	int total = bolt + nut + washer;
    	int totalcost = boltprice * bolt + nutprice * nut + washerprice * washer;
    	
    	System.out.println("Items: " + total);
    	System.out.println("Cost: " + totalcost + " Cents");
    		
    	if (totalcost >  100 && total > 50){
    		System.out.println("You get a 15% discount!");
    		totalcostdis = totalcost - totalcost * .15;
    	}
    	else if (total > 50 ){
    		System.out.println("You get a 5% discount!");
    		totalcostdis = totalcost - totalcost * .5;
    	}
    	
    	else if (totalcost > 100){
    	    System.out.println("You get a 10% discount!");
    	    totalcostdis = totalcost - totalcost * .10;
    	}
    	else {
    		totalcostdis=totalcost;
    	}
    	
    	System.out.printf("%-10s %.0f %s \n","Your total cost is",totalcostdis,"Cents");
    			
    }
    
    
}