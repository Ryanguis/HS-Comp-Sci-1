/**
 * @(#)Lab2.java
 *
 *
 * @author Ryan Guistwite 
 *Date 2/2/2016
 * @version 1.00 2016/2/2
 */

// Lab Complete
// Score 10/10

// Like the full story!

import java.util.Scanner;

class Lab2 {
	public static void main (String[] stuff){

		String name; 
		String nationality;
		String adjetive1;
        String noun;
        String adjetive2;
        String noun2;
        String adjetive3;
        String adjetive4;
        String pluralnoun;
        String noun3;
        int number;
        String shape; 
        String food;
        String food2;
        int number1; 
        
       	Scanner in = new Scanner (System.in);
		
		System.out.println ("Enter a adjetive");
		adjetive1 = in.nextLine();
		
		System.out.println ("Enter a nationality"); 
		nationality = in.nextLine();
		
		System.out.println ("Enter a person's name");
		name = in.nextLine(); 
			
		System.out.println ("Enter a noun");
		noun = in.nextLine();
		
		System.out.println ("Enter a adjetive");
		adjetive2 = in.nextLine();
		
		System.out.println ("Enter a noun");
		noun2 = in.nextLine();
		
		System.out.println ("Enter a adjetive"); 
		adjetive3 = in.nextLine();
		
		System.out.println ("Enter another adjetive");
		adjetive4 = in.nextLine(); 
			
		System.out.println ("Enter a plural noun");
	    pluralnoun = in.nextLine();
	    
		System.out.println ("Enter a noun");
		noun3 = in.nextLine();
		
		System.out.println ("Enter a food"); 
		food = in.nextLine();
		
		System.out.println ("Enter a plural shape");
		shape = in.nextLine();
		
		System.out.println ("Enter another food");
		food2 = in.nextLine(); 
			
		System.out.println ("Enter a number");
		number = in.nextInt();
		
		System.out.println ("Enter another number");
		number1 = in.nextInt();
			
		
	

		System.out.println ("Pizza was invented by a " + adjetive1 + " " + nationality + " chef named " 
		+ name + ".\nTo make a pizza, you need to take a lump of " + noun + " and make a thin, round " 
		+ adjetive2 + " " + noun2 + ". Then cover it with " + adjetive3 + " sauce, " + adjetive4 
		+ "cheese, and fresh chopped " + pluralnoun + ". \nNext you have to bake it in a hot " 
		+ noun3 + ". When it is done, cut it into " + number + " " + shape + ". Some kids like " 
		+ food + " pizza the best, but my favorite is the " + food2 + " pizza.\nIf I could, I would eat pizza " 
		+ number1 + " times a day!");  
			
	}
}
