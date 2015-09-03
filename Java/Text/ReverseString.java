// Jacob Orner (jayc0b0)
// 14 September 2015
// Reverses a string and outputs

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]) {

        // Initialize Variable
        String input = "";
        int len;
        Scanner s = new Scanner(System.in);

        // Take input
        System.out.println("Please enter a string to be reversed.");
        input = s.next();
        len = input.length();
        char [] inputArray = input.toCharArray();

        // Output reverse
        System.out.println("Your reversed string is:");
        for (int i = len-1; i > -1; i--){
            System.out.print(inputArray[i]);
        }
        System.out.println("\n");

    }

}
