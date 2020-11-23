/*
 * Task4d
 *
 * Authentic author: Omer Geva
 * I.D.: 316551472
 * Last update: 03/11/19
 */

import java.util.Scanner;

public class Task4d {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
		int n = myScanner.nextInt(); 
		double d=1; //we use double because d is a result of divison and we want a precise answer. 1 is the smallest add number we could get.
		int counter =1; // counter for the loop
		double e = 1; // the exponentiation value of 2 by counter. We set it as a double veriable beacuse we will use it in a divisoin and want a percise answer. 1 is the smallest value of exponentiation we can get.
		int s=0; // the exponent we need to find. The smallet exponent we could get is 0.
		boolean isFound = false;
		while (e<=(n-1)&isFound == false) // we check every exponent of 2 that is smaller or equal to 'n-1'. if we find 's' and 'd' we will set isFound as true and the loop will stop
		{
			e = e*2;
			d = (n-1)/e; // the devision of 'n-1' by the exponentiation.
			if (d%2==1){ // if the remainder of the devision between 'd' and 2 equals 1 then we know that 'd' is a whole and odd number. Which means we found the numbers we wanted
				isFound = true;
				s = counter;
			}
			counter = counter+1;
		}
		System.out.println(s);
		System.out.println((int)d); // we cast d to an integer so it will print us a whole number.
		
        //---------------write your code ABOVE this line only!--------------
    }

    
}