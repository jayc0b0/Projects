// Jacob Orner (jayc0b0)
// 14 September 2015
// Counts vowels in a string

import java.util.Scanner;

public class VowelCount {

    public static void main(String[] args) {
    
    // Initialize Variables
    int len;
    int a, e, i, o, u, total;
    a = e = i = o = u = total = 0;
    String input = "";
    Scanner s = new Scanner(System.in);

    // Take input
    System.out.println("Please input a string to count vowels in.");
    input = s.nextLine();
    input = input.toLowerCase();
    len = input.length();
    char[] ia = input.toCharArray();

    // Count vowels
    for (int n = 0; n < len; n++) {
        
        if (ia[n] == 'a') {
            total += 1;
            a += 1;
        }
        
        else if (ia[n] == 'e') {
            total += 1;
            e += 1;
        }
        
        else if (ia[n] == 'i') {
            total += 1;
            i += 1;
        }
        
        else if (ia[n] == 'o') {
            total += 1;
            o += 1;
        }
        
        else if (ia[n] == 'u') {
            total += 1;
            o += 1;
        }

        else {
        }

    }

    // Output
    System.out.println("Your totals are:");
    System.out.println("\nA: " + a + "\nE: " + e + "\nI: " + i + "\nO: " + o + "\nU: " + u);
    System.out.println("TOTAL: " + total);

    }

}
