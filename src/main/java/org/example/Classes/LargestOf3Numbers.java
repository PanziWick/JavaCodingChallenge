package org.example.Classes;

import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a=scanner.nextInt();

        System.out.println("Enter Second Number: ");
        int b=scanner.nextInt();

        System.out.println("Enter Third Number: ");
        int c=scanner.nextInt();

        //Approach 1 - Logic
//        if (a>b && a>c) {
//            System.out.println(a + "is Largest Number");
//        }
//        else if(b>a && b>c) {
//            System.out.println(b + " is Largest Number");
//        }
//        else {
//            System.out.println(c + " is Largest Number");
//        }

        //Ternary Operator
//        int largest1 = a>b?a:b; //largest of a & b
//        int largest2 = c>largest1?c:largest1; //largest of c & largest1

        int largest = c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println(largest+" is Largest Number");
    }
}
