package org.example.Classes;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 10, b=20;

        System.out.println("Before swapping values are..."+a+" "+b);

        //Logic1 - Third variable

//        int t=a;
//        a=b;
//        b=t;

        //Logic2 - Use + and - without using third variable

//        a = a+b; //10+20=30
//        b = a-b; //30-20=10
//        a = a-b; //30-10=20

        //Logic3 - Use * and / without using third variable
        //Here a and b values should not be zero

//        a=a*b; //10*20=200
//        b=a/b; //200/20=10
//        a=a/b; //200/10=20

        //Logic4 - Bitwise XOR (^)
        //10 - 1010
        //20 - 10100
        //Calculated using binary inputs

//        a=a^b; //10^20=30
//        b=a^b; //30^20=10
//        a=a^b; //30^10=20

        //Logic5 - Single statement
        //Execution occurs right to left

        b=a+b-(a=b);

        System.out.println("After swapping values are..."+a+" "+b);
    }
}
