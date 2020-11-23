/*
 * Task2
 *
 * Authentic author: Omer Geva
 * I.D.: 316551472
 * Last update: 01/11/19
 */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
		int a = myScanner.nextInt(); 
		int b = myScanner.nextInt();
		int n = (int)(Math.random()*(b-a+1)+a);
		/*
		 random() gives us a number between 0 and 1. we add 'a' so it would start from the number 'a' and not from 0.
		 we multiply by b-a+1 because that is the length of the range we want to get a random number from.
		 the random() function gives us a non whole number so we cast it to an integer.
		*/
		System.out.println(n);

        //---------------write your code ABOVE this line only!--------------
    }

    
}