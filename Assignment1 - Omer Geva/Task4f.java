/*
 * Task4f
 *
* Authentic author: Omer Geva
 * I.D.: 316551472
 * Last update: 10/11/19
 */

import java.util.Scanner;

public class Task4f {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
		int n = myScanner.nextInt(); 
		int s = myScanner.nextInt(); 
		int d = myScanner.nextInt(); 
		int k = myScanner.nextInt(); 
		boolean condition = false; // we continue checking the numbers as long as we didn't find a numbeer that meets our conditions
		int b = 0; 
		for (int c = 1; c<=k & condition==false;c=c+1) // we check 'k' numbers. If we find one that meets our condition we will set 'condition' as true and the loop will stop.
		{
			b = (int)(Math.random()*(n-2)+2); 
			/*
			we add 2 so it will start with 2 and not with 0. 
			we multiply it by 'n-2' because that is the length of the range we want to get a random number from 
			(we want it to be from 2 to 'n-1' so the range is n-1-2. then we add 1 so it will include the last number)
			we need an integer so we cast it.
			*/
			int mod = b%n; // on this variable we will calculate the modulo of b^d%n
			for (int i=2; i <= d; i=i+1)
				mod = (mod*(b%n))%n;// because the value that b^d gives us could be to big we calculate the modulo according to the rule "(a*b)%k=((a%k)*(b%k))%k" given to us in the assigment1 sheet.
			if (mod!=1)
				condition = true; // if the number meets our first condition we will set 'condition' as true and continue to check the second condition
			for (int i=0; i < s & condition; i=i+1) // we check every number from 0 to 's-1'
			{
				int exp = 1; // the exponentiation of 2 by 'i'. If i=0 then the exponentiation will be 1.
				for (int j=1;j<=i; j=j+1) //calculating 2^i
					exp = exp*2;
				int mod2 = b%n; // again the value of the exponentiation could be to big so we calculate the modulo with "(a*b)%k=((a%k)*(b%k))%k"
				for (int j=2;j<=exp*d; j=j+1)
					mod2 = (mod2*(b%n))%n;
				if (mod2==n-1) // if the number doesn't meet our second condition we will set 'condition' as false and this loop will stop.
					condition = false;
				
			} // at the end of this loop if the number didn't meet our conditions 'condition' will be set as false and the outer loop will continue to check another number.
		
		}
		if (condition)
			System.out.println(b+" is a witness." +n+" is composite.");
		else
			System.out.println("We assume " +n+" is prime.");
		

        //---------------write your code ABOVE this line only!--------------
    }

    
}