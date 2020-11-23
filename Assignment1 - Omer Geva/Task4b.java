/*
 * Task4b
 *
* Authentic author: Omer Geva
 * I.D.: 316551472
 * Last update: 08/11/19
 */

import java.util.Scanner;

public class Task4b {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
		int n = myScanner.nextInt();
		int counter = 0;
		// 1 is not a prime number or a composite number so we start to check for prime numbers from 2.
		for (int i=2; i<=n; i=i+1) // we go through all the numbers from 2 to 'n' and check if they are prime numbers
		{
			boolean IsPrime = true;
			for (int j =2; j*j<=i&IsPrime; j = j+1)// we check every number from 2 to the root of 'i' if 'i' is divided by them.
			{
				if(i%j==0)
					IsPrime = false;// if the number is divided by i without a remainder then it is a composite number. we will change 'IsPrime' to false and the loop will stop
			}
			if(IsPrime)
				counter = counter+1; // we count each prime number
		}
		System.out.println (counter);
        //---------------write your code ABOVE this line only!--------------
    }

    
}