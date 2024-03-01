package org.example.Classes;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        System.out.println("Enter the string:");

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();  //Welcome to Java

        int count = 1;

        for (int i=0; i<s.length()-1; i++)
        {
            if ((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of Words in a String: " + count);
    }
}
