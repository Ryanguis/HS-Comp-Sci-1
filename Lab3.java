/**
 * @(#)Lab3.java
 *
 *
 * @author Ryan Guistwite
 * Date: 2/4/16
 * @version 1.00 2016/2/4
 */

// Lab Complete
// Score 10/10

// You might want to let users know what to enter for the ice cream ques

import java.util.Scanner;

class Lab3 {

    public static void main(String[] Stuffystuff) {
    	
    	String name;
    	String ice;
    	int age;
    	int grade;
    	String dob;
    	double gpa;
    	
    	Scanner in = new Scanner (System.in);
    	
    	System.out.println ("Enter your name ");
    	name = in.nextLine();
    	
    	System.out.println ("Enter your age ");
    	age = in.nextInt();
    	in.nextLine();
    	
    	System.out.println ("Enter your date of birth xx/xx/xxxx ");
    	dob = in.nextLine();
    	
    		
    	System.out.println ("Enter your grade ");
    	grade = in.nextInt();
    	in.nextLine();
    	
    	System.out.println ("Please enter your GPA ");
    	gpa = in.nextDouble();
    	in.nextLine(); 
    	
    	System.out.println ("Do you like Ice Cream? ");
    	ice = in.nextLine();

    	System.out.println("_____________________");
    	System.out.printf("%-10s %10s \n","Name:", name);
    	System.out.printf("%-10s %10d \n","Age:", age);
    	System.out.printf("%-10s %10d \n","Grade:", grade);
    	System.out.printf("%-10s %10s \n","DoB:",dob );
    	System.out.printf("%-10s %10.2f \n","GPA:",gpa);
    	
    	
    	
    	
    	if(ice.equalsIgnoreCase("yes"))
    		System.out.printf ("%-10s %10s","Ice Cream? \n",name + " likes Ice Cream");
    	else
    		System.out.printf ("%-10s %10s","Ice Cream? \n",name + " Hates Ice Cream \n");
    		
    	System.out.println("_____________________");
    		
    	
   
    }
    
    
}