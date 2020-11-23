/*
 * Task3b
 *
 * Authentic author: Omer Geva
 * I.D.: 316551472
 * Last update: 01/11/19
 */

import java.util.Scanner;

public class Task3b {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
		int n = myScanner.nextInt();
		int k = myScanner.nextInt();
		int i=0; // counter
		int m=1%k; // the value of modulo. 1 is the value of any number raised to the power of 0.
		while (i<n)// the loop will run 'n' times. If n = 0 the loop won't run and 'm' will remain m=1%2.
		{
			m = (m*(2%k))%k; // we are using the rule "(a*b)%k=((a%k)*(b%k))%k" given to us in the assigment1 sheet.
			i=i+1;
		}
		System.out.println(m);
        //---------------write your code ABOVE this line only!--------------
    }

    
}