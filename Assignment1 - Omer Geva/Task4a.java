/*
 * Task4a
 *
* Authentic author: Omer Geva
 * I.D.: 316551472
 * Last update: 08/11/19
 */

import java.util.Scanner;

public class Task4a {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
		int n = myScanner.nextInt();
		boolean IsPrime = true;
		/* prime numbers and composite numbers are divided by 1 so we will start looking from 2.
		we check every number from 2 that its square is smaller or equal to 'n'. As we saw in class if 'n' isn't divided by any number in that range it is a prime number
		that helps us to check less numbers and run the loop less times. The loop will stop when i^2 is bigger than 'n' or if 'n' is composite
		*/
		for (int i=2; i*i<=n;i=i+1)
		{
			if(n%i==0)
				IsPrime = false; // if the number is divided by i without a remainder then it is a composite number. we will change 'IsPrime' to false and the loop will stop
		}
		if(IsPrime)
			System.out.println("prime");
		else
			System.out.println("composite");

        //---------------write your code ABOVE this line only!--------------
    }

    
}