/*
 * Task3a
 *
 * Authentic author: Omer Geva
 * I.D.: 316551472
 * Last update: 01/11/19
 */

import java.util.Scanner;

public class Task3a {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
		int n = myScanner.nextInt();
		int i = 0; // counter veriable that will help us determine the number of time the loop runs
		int h = 1; // the value of the exponentiation
		while (i<n) // the loop will run 'n' times. If n = 0 the loop won't run and 'h' will remain h=1.
		{
			h = h*2; // each loop we will multiply 'h' by 2
			i = i+1;
		}
		System.out.println(h); // at the end 'h' was multiplied by 2 'n' times which is equal to 2^n and we will print the answer

        //---------------write your code ABOVE this line only!--------------
    }

    
}