/**
 * @(#)Lab 9.java
 *
 *
 * @author Ryan and Hank
 * 3/1/16 
 * @version 1.00 2016/2/24
 */

// Lab Complete
// Score 10/10

import java.util.Scanner;

class Lab9
{
	public static void main (String Theory[])
	{
		double neoamount = 0;
		String oldname = "";
		String name = "";
		boolean w = true;
			
		Scanner in = new Scanner (System.in);
		
		System.out.printf("1-%-10s\n","Canadian Dollars");
		System.out.printf("2-%-10s\n","Euro");
		System.out.printf("3-%-10s\n","Japanese Yen");
		System.out.printf("4-%-10s\n","British Pound");
		System.out.printf("5-%-10s\n","United States Dollars");
		System.out.printf("6-%-10s\n\n","Pesos");
		System.out.printf("%-10s","What are you converting from? ");
		int input = in.nextInt();
		
		System.out.printf("1-%-10s\n","Canadian Dollars");
		System.out.printf("2-%-10s\n","Euro");
		System.out.printf("3-%-10s\n","Japanese Yen");
		System.out.printf("4-%-10s\n","British Pound");
		System.out.printf("5-%-10s\n","United States Dollars");
		System.out.printf("6-%-10s\n\n","Pesos");
		System.out.printf("%-10s","What are you converting to? ");
		int output = in.nextInt();
		
		System.out.printf("%-10s","How much do you have? ");
		double amount = in.nextDouble();
		
		switch (input)
		{
			case 1:
				oldname = "Canadian Dollars";
				switch (output)
				{
					//CD = .66 EU = 81.86 Yen = .52 Pound = .73 US 
					case 1: neoamount = amount;
							name = "Canadian Dollars";
							break;
					case 2: neoamount = amount*.66;
							name = "Euros";
							break;
					case 3: neoamount = amount*81.66;
							name = "Yen";
							break;
					case 4: neoamount = amount*.51;
							name = "British Pound";
							break;
					case 5: neoamount = amount*.73;
							name = "United States Dollars";
							break;
					case 6: neoamount = amount*31;
							name ="Pesos";
							break;
					default: System.out.println("\n\n\nYou gave an invalid input\n\n\n");
							w=false;
							break;
				}
					break;
			case 2:
				oldname = "Euros";
				switch (output)
				{
					//EU = 1.51 CD = 12.75 Yen = .79 Pound = 1.1 US
					case 1: neoamount = amount*1.51;
							name = "Canadian Dollars";
							break;
					case 2: neoamount = amount;
							name = "Euros";
							break;
					case 3: neoamount = amount*12.75;
							name = "Yen";
							break;
					case 4: neoamount = amount*.79;
							name = "British Pound";
							break;
					case 5: neoamount = amount*1.1;
							name = "United States Dollars";
							break;
					case 6: neoamount = amount * 420;
							name = "Pesos";
							break;
					default: System.out.println("\n\n\nYou gave an invalid input\n\n\n");
							w=false;
							break;
				}
					break;
			case 3:
				oldname = "Yen";
				switch (output)
				{
					//Yen = .012 CD = .0081 EU = .0064 Pound = .0089 US
					case 1: neoamount = amount*.012;
							name = "Canadian Dollars";
							break;
					case 2: neoamount = amount*.0081;
							name = "Euros";
							break;
					case 3: neoamount = amount;
							name = "Yen";
							break;
					case 4: neoamount = amount*.0064;
							name = "British Pound";
							break;
					case 5: neoamount = amount*.0089;
							name = "United States Dollars";
							break;
					case 6: neoamount = amount * 12;
							name = "Pesos";
							break;
					default: System.out.println("\n\n\nYou gave an invalid input\n\n\n");
							w=false;
							break;
				}
					break;
			case 4: 
				oldname = "British Pound";
				switch (output)
				{
					//Pound = 1.91 CD = 1.26 EU = 156.26 Yen = 1.39 US Pesos = 43
					case 1: neoamount = amount*1.91;
							name = "Canadian Dollars";
							break;
					case 2: neoamount = amount*1.26;
							name = "Euros";
							break;
					case 3: neoamount = amount*156.26;
							name = "Yen";
							break;
					case 4: neoamount = amount;
							name = "British Pound";
							break;
					case 5: neoamount = amount*1.39;
							name = "United States Dollars";
							break;
					case 6: neoamount = amount*43;
							name = "Pesos";
							break;
					default: System.out.println("\n\n\nYou gave an invalid input\n\n\n");
							w=false;
							break;
				}
					break;
			case 5: 
				oldname = "British Pound";
				switch (output)
				{
					//US = 1.37 CD = .91 EU = 112.06 Yen = .72 Pound
					case 1: neoamount = amount*1.37;
							name = "Canadian Dollars";
							break;
					case 2: neoamount = amount*.91;
							name = "Euros";
							break;
					case 3: neoamount = amount*112.06;
							name = "Yen";
							break;
					case 4: neoamount = amount*.72;
							name = "British Pound";
							break;
					case 5: neoamount = amount;
							name = "United States Dollars";
							break;
					case 6: neoamount = amount*32;
							name = "Pesos";
							break;
					default: System.out.println("\n\n\nYou gave an invalid input\n\n\n");
							w=false;
							break;
				}	
					break; 			
			case 6:
				oldname = "Pesos";
				switch (output)
				{	
					case 1: neoamount = amount*2.6;
							name = "Canadian Dollars";
							break;
					case 2: neoamount = amount*3.6;
							name = "Euros";
							break;
					case 3: neoamount = amount*1.2;
							name = "Yen";
							break;
					case 4: neoamount = amount*13;
							name = "British Pound";
							break;
					case 5: neoamount = amount*1.7;
							name = "United States Dollars";
							break;
					case 6: neoamount = amount;
							name = "Pesos";
							break;
					default: System.out.println("\n\n\nYou gave an invalid input\n\n\n");
							w=false;
							break;
				
				}
					break;
			default: System.out.println("\n\n\nYou gave an invalid input\n\n\n");
			w=false;
					break;
		}
		if (w==true)
		System.out.printf("\n\n\n%.2f %s is %.2f %s\n\n\n",amount,oldname,neoamount,name);
	}
}

/* Test case
 * input-6,3,2000
 * output-2000.00 Pesos is 2400.00 Yen
 *
 * input-1,4,-2000
 * output-(-2000.00) Canadian Dollars is -1020.00 British Pound
 *
 * input-2,3,12.54 
 * output-12.54 Euros is 159.89 Yen
 *
 *input-7,2,1
 *output-You gave an invalid input
 */