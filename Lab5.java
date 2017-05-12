/**
 * @(#)Lab 5.java
 *
 *
 * @author Hank Huang & Ryan G.
 * @date 02/12/16
 * @version 1.00 2016/2/8
 */

// Lab Complete
// Score 9/10

// -1: Random incorrect (should be (int)((Math.random() * num2) + 0)

import java.util.Scanner;

class Lab5 {
	
	public static void main(String theory[]){
		
		Float num1;
		Float num2;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println( "First number : ");
		num1 = scan.nextFloat();
		scan.nextLine();
		
		System.out.println( "Second number : ");
		num2 = scan.nextFloat();
		scan.nextLine();
		
		float sum = num1+num2;
		float diff = num1-num2;
		float prod = num1*num2;
		float quot = num1/num2;
		float mod = num1%num2;
		double squ = Math.pow(num1, 2);
		double sqrt = Math.sqrt(num1);
		double rand = (double)((Math.random() * num2) + 0);
		float max = Math.max(num1, num2);
		float min = Math.min(num1,num2);
		float abs = Math.abs(diff);
		
		
		
		System.out.printf("%-10s %10.2f","Sum: ", sum);
		System.out.printf("\n%-10s %8.2f","Difference: ", diff);
		System.out.printf("\n%-10s %10.2f","Product: ", prod);
		System.out.printf("\n%-10s %10.2f","Quotient: ", quot);
		System.out.printf("\n%-10s %10.2f","Modulo: ", mod);
		System.out.printf("\n%-10s %10.2f","Square: ", squ);
		System.out.printf("\n%-10s %7.2f","Square Root: ", sqrt);
		System.out.printf("\n%-10s %10.2f","Random: ", rand);
		System.out.printf("\n%-10s %10.2f","Maximum: ", max);
		System.out.printf("\n%-10s %10.2f","Minimum: ", min);
		System.out.printf("\n%-10s %10.2f","Abs Valu: ", abs);
		
		/* If the user enters Test casese
			
		 *2 and 3
		 *sum 5
		 *diff -1
		 *prod 6
		 *quot .67
		 *modu 2
		 *square 4
		 *square root 1.14
		 *rando 
		 *max 3
		 *min2
		 *abs 1
		 *
		 *-2 and 3
		 *sum 1
		 *diff -1
		 *prod -6
		 *quot -.67
		 *modu -2
		 *square 4
		 *square root NaN
		 *rando 2
		 *max 3
		 *min -2
		 *abs 5
		 *
		 *2.23 and -.43
		 *sum 1.80
		 *diff 2.66
		 *prod -0.96
		 *quot -5.19
		 *modu 0.08
		 *square 4.97
		 *square root 1.49
		 *rando -0.28
		 *max 2.23
		 *min -0.43
		 *abs 2.66
		 */ 
		
		
	}
}