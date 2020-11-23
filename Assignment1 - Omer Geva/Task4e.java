/*
 * Task4e
 *
 * Authentic author: Omer Geva
 * I.D.: 316551472
 * Last update: 04/11/19
 */

import java.util.Scanner;

public class Task4e {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
		int n = myScanner.nextInt(); 
		int b = myScanner.nextInt(); 
		int s = myScanner.nextInt(); 
		int d = myScanner.nextInt(); 
		int mod; // on this variable we will calculate the modulo of b^d%n
		boolean condition = true;
		mod = b%n;
		for (int i=2; i <= d; i=i+1)
			mod = (mod*(b%n))%n; // because the value that b^d gives us could be to big we calculate the modulo according to the rule "(a*b)%k=((a%k)*(b%k))%k" given to us in the assigment1 sheet.
		if (mod==1)
			condition = false; // if the numbers don't meet the first condition then we will set 'condition' as false and the program won't check the second condition
		for (int i=0; i < s & condition; i=i+1) // we check every number from 0 to 's-1'
		{
			int exp = 1; // the exponentiation of 2 by 'i'. If i=0 then the exponentiation will be 1.
			for (int j=1;j<=i; j=j+1) // calculating 2^i
				exp = exp*2;
			int mod2 = b%n; // again the value of the exponentiation could be to big so we calculate the modulo with "(a*b)%k=((a%k)*(b%k))%k"
			for (int j=2;j<=exp*d; j=j+1)
				mod2 = (mod2*(b%n))%n;
			if (mod2==n-1) // if the numbers don't meet the second condition then we will set 'condition' as false and the loop will stop
				condition = false;
				
		}
		if (condition)
			System.out.println(b+" is a witness." +n+" is composite.");
		else
			System.out.println("We assume " +n+" is prime.");

        //---------------write your code ABOVE this line only!--------------
    }

    
}