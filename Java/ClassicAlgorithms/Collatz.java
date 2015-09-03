// Jacob Orner
// 14 September 2015
// Collatz Conjecture
//  1. Start with number n > 1.
//  2. If n is even, divide by 2.
//  3. If n is odd multiply by 3 and add 1.
//  4. Count the number of steps to reach 1.

import java.util.Scanner;

public class Collatz {

    public static void main(String[] args) {

        // Initialize Variables
        int n;
        int steps = 0;
        Scanner s = new Scanner(System.in);

        // Take input
        System.out.println("Please enter an integer (n > 1) to run through the algorithm:");
        n = s.nextInt();

        // Validate input
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            System.exit(0);
        }

        else if (n == 1) {
            System.out.println("Please enter an integer greater than 1.");
            System.exit(0);
        }

        else{
        }

        // Run the algorithm
        while (n > 1) {
            
            if (n % 2 == 0) {
                n /= 2;
                steps +=1;
            }

            else if (n % 2 != 0) {
                n = (n * 3) + 1;
                steps +=1;
            }

        }

        // Output Results
        System.out.println("Using the Collatz Conjecture, it took " + steps + " steps to reach 1.");

    }

}
