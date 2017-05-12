/**
 * @(#)U1Test.java
 *
 *
 * @author Ryan Guistwite
 *	Date: 3/7/16
 * @version 1.00 2016/3/7
 */


import java.util.Scanner;

class U1Test {
	
	public static void main (String[] stuff){
	
	Scanner in = new Scanner (System.in);
	int choice;
	int total;
	int splittotal;
	int newtotal;
	int card1 = (int)((Math.random() * 11) + 1);
	int card2 = (int)((Math.random() * 11) + 1);
	total = card1+card2;
	
	if (card1 ==1 && total<12) {
	card1 = 11;
	}
	if (card2 ==1 && total<12) {
	card2 = 11;
	}
	
	System.out.println("Card 1: "+card1);
	System.out.println("Card 2: "+card2);
	System.out.println("Total Score: " + total);

	if (total > 21) {
	System.out.println("You Busted!");
	}
	System.out.printf("\n\n");
	
	System.out.println("Please choose:");
		System.out.printf("1-%-10s\n","Stay");
		System.out.printf("2-%-10s\n","Hit");
		System.out.printf("3-%-10s\n","Split");
	
	choice = in.nextInt();
	
	switch (choice)
				{
					
					case 1: System.out.println("Card 1: "+card1);
							System.out.println("Card 2: "+card2);
							System.out.println("Total Score: " + total);
							break;
					case 2: int card3 = (int)((Math.random() * 11) + 1);
							int card4 = (int)((Math.random() * 11) + 1);
							newtotal = card3+card4;
	
							System.out.println("Card 1: "+card3);
							System.out.println("Card 2: "+card4);
							System.out.println("Total Score: " + newtotal);
							if (newtotal > 21) {
								System.out.println("You Busted!");
								
									if (card4 ==1 && newtotal<12) {
									card1 = 11;
									}
									if (card3 ==1 && newtotal<12) {
									card3 = 11;
									}
							}
							break;
					case 3: splittotal=total/2;
           					System.out.println("Your new total is: " + splittotal);
							break;
				}

    }
    
    
}