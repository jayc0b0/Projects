// Jacob Orner (jayc0b0)
// 14 September 2015
// Converts strings to pig latin

import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {

        //Initialize Variables
        int len;
        String input = "";
        ArrayList il = new ArrayList();
        Scanner s = new Scanner();

        // Take input
        System.out.println("Please enter a string to convert to Pig Latin:");
        input = s.next();
        len = input.length();

