/**
 * @(#)6.java
 *
 *
 * @author Ryan Guistwite
 * Date 3/3/16
 * @version 1.00 2016/3/3
 */
 
 // Lab Complete
 // Score 8.5/10
 
 // -1: Late
 // -0.5: Needs 3 more options (you have 2 more)
 
 // Would have liked you to practice using if statements, but this is ok
 
import java.util.Scanner;

class Lab6
{
	public static void main (String stuffffff[])
	{
		
		Scanner in = new Scanner (System.in);
		
		System.out.printf("You are in a locked in a room with a cow, a moose, and a door");
		System.out.printf("What do you do? \n");
		System.out.printf("1-%-10s\n","Walk to the cow");
		System.out.printf("2-%-10s\n","Walk to the moose");
		System.out.printf("3-%-10s\n","Walk to the door");
		int choice1 = in.nextInt();
		
			switch (choice1)
				{
					
					case 1: System.out.printf("\n\n\n\n\n\n\nYou walked to the cow and it sits on you. Sorry but you died :(");
							return;
					case 2: System.out.printf("\n\n\n\n\n\n\nThe moose is eating nuts in the room but you are so intimidated by the moose that you die. :(");
							return;
					case 3: System.out.printf("\n\n\n\n\n\n\nYou walk to the door and try to turn the door knob but its locked.\n");
							break;
				}
		System.out.printf("What do you do?\n");
		System.out.printf("1-%-10s\n","Go BACK to the moose!");
		System.out.printf("2-%-10s\n","Try and break down the door.");
		System.out.printf("3-%-10s\n","Walk to a window that appeared out of no where.");
		int choice2 = in.nextInt();
		
			switch (choice2)
				{
					
					case 1: System.out.printf("\n\n\n\n\n\n\nYou walked to the moose... it's eating walnuts...you die");
							return;
					case 2: System.out.printf("\n\n\n\n\n\n\nYou try and break down the door but you just break your shoulder then implode.");
							return;
					case 3: System.out.printf("\n\n\n\n\n\n\nYou walk to the window and try and open it but its also locked :(\n");
							break;
				}
		System.out.printf("What do you do?\n");
		System.out.printf("1-%-10s\n","Go BACK TO THE MOOSE!!!");
		System.out.printf("2-%-10s\n","Sit in a chair that appeared out of no where.");
		System.out.printf("3-%-10s\n","Unlock the window with a key that was on the ground next to the window");
		int choice3 = in.nextInt();
		
		switch (choice3)
				{
					
					case 1: System.out.printf("\n\n\n\n\n\n\nYou walked to the moose... it's eating WALNUTS! You escape the room somehow........");
							break;
					case 2: System.out.printf("\n\n\n\n\n\n\nYou sit in the chair and contemplate your life. You get deppresed and die :((");
							return;
					case 3: System.out.printf("\n\n\n\n\n\n\nYou escaped! but the moose is waiting for you and you die :(");
							return;
				}
				
	}
}
				
				
		
				
							