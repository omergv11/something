/*
 * Task1
 *
 * Authentic author: Omer Geva
 * I.D.: 316551472
 * Last update: 01/11/19
 */

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        int a = myScanner.nextInt(); 
        //---------------write your code BELOW this line only!--------------
		int b = myScanner.nextInt(); 
		int q = myScanner.nextInt(); 
		int r = myScanner.nextInt(); 
		if (r<b & b!=0 & (a==(q*b+r))) // Checking if our conditions apply to the recieved numbers
			System.out.println("yes");
		else
			System.out.println("no");

        //---------------write your code ABOVE this line only!--------------
    }

    
}