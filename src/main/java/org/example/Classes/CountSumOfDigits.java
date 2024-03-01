package org.example.Classes;

import java.util.Scanner;

public class CountSumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = scanner.nextInt();
//        int num = 1234;
        int sum = 0;
        while (num>0) {
            sum = sum+num%10; //4+3+2+1
            num = num/10; //123 12 1
        }
        System.out.println("Sum of digits in number: "+sum);
    }
}
