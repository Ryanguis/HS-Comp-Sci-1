/**
 * @(#)Lab 1.java
 *
 *
 * @author Ryan Guistwite
 *Date 2/2/2016
 * @version 1.00 2016/1/29
 */
 
 // Lab Complete
 // Score 10/10
 
 // Nice extentions!
 
import java.util.Scanner;

class Lab1{
	
	public static void main (String[] stuff){
	
		int chemistry;
		int physics;
		int music;
		int mathlab;
	
		Scanner in = new Scanner (System.in);
		
		System.out.println ("Enter the number of chemistry computers");
		chemistry = in.nextInt();
		
		System.out.println ("Enter the number of Physics computers");
		physics = in.nextInt();
		
		System.out.println ("Enter the number of music computers");
		music = in.nextInt();
		System.out.println ("Enter the number of Math Lab computers");
		mathlab = in.nextInt();
				
		double total = chemistry + physics + music + mathlab;
		double average = total / 4; 

		System.out.println ("Chemistry: " + chemistry);
		System.out.println ("Physics: " + physics); 
		System.out.println ("Music: " + music);
		System.out.println ("Math Lab: " + mathlab);
		System.out.println ("Total: " + total);
		System.out.println ("Average: " + average);
	}
	
}