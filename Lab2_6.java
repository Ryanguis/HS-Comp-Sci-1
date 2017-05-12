/**
 * @(#)Lab6.java
 *
 *
 * @author Ryan Guistwite
 *	Date 3/23/16
 * @version 1.00 2016/3/21
 */

// Lab Complete
// Score 10/10

import java.util.Scanner;

class Lab6
{
	public static void main (String eyyyyyy[]){
		
		int rolls = 0;
		int total =0;
		int one=0;
		int two=0;
		int three=0;
		int four =0;
		int five=0;
		int six=0;
		
		System.out.printf("%s%9s","Roll","Number\n");
		for(int a=1 ; a <= 100 ; a++){
			int roll = (int)((Math.random() * 6) + 1);
			rolls++;
			total=roll+total;
			System.out.printf("%d%9d\n",roll,rolls);
			switch (roll)
				{
					case 1: one++;
							break;
					case 2: two++;
							break;
					case 3: three++;
							break;
					case 4: four++;
							break;
					case 5: five++;
							break;
					case 6: six++;
							break;
				}
		}
		double average = (double)total/100;
		System.out.printf("\n\n%s%.2f\n","Average:",average);
		System.out.printf("\n%s%16s","Roll","Times rolled");
		System.out.printf("%s%9d%s%9d%s%9d%s%9d%s%9d%s%9d%s","\n1",one,"\n2",two,"\n3",three,"\n4",four,"\n5",five,"\n6",six,"\n");
    }
    
    
}