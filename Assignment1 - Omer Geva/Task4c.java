/*
 * Task4c
 *
  * Authentic author: Omer Geva
 * I.D.: 316551472
 * Last update: 03/11/19
 */

import java.util.Scanner;

public class Task4c {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
		int n = myScanner.nextInt(); 
		int b = (int)(Math.random()*(n-2)+2); 
		/*
		 we add 2 so it will start with 2 and not with 0. 
		 we multiply it by 'n-2' because that is the length of the range we want to get a random number from 
		 (we want it to be from 2 to 'n-1' so the range is n-1-2. then we add 1 so it will include the last number)
		 we need an integer so we cast it.
		 */
		System.out.println(b);
		
        //---------------write your code ABOVE this line only!--------------
    }

    
}