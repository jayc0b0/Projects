// Jacob Orner (jayc0b0)
// 9 September 2015
// Fizz Buzz in Java

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        // Initialize Variables
        int num;
        Scanner s = new Scanner(System.in);

        // Take input
        System.out.print("Please enter an integer: ");
        num = s.nextInt();
        
        // Evaluate
        for (int i = 1; i < num + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz!");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz!");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz!");
            }
            else {
                System.out.println(i);
            }
        }

    }

}
