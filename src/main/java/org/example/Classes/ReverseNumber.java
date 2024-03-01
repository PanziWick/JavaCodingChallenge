package org.example.Classes;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = scanner.nextInt();

        //1. Using algorithm

//        StringBuilder rev=0;
//
//        while (num!=0) {
//            rev=rev*10 + num%10; //0*10+1234%10=4   4*10+123%10=43  43*10+12%10=432    432*10+1%10=4321
//            num=num/10;          //1234/10=123      123/10=12       12/10=1            1/10=0
//        }

        //2. Using StringBuffer class

//            StringBuffer stringBuffer=new StringBuffer(String.valueOf(num));
//            StringBuffer rev=stringBuffer.reverse();

        //3. Using StringBuilder class

            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(num);
            StringBuilder rev=stringBuilder.reverse();

        System.out.println("Reverse Number is: "+rev);
    }
}
