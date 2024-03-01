package org.example.Classes;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ABCD";
        String rev = "";

        //1. Using + (string concatenation) operator
//        int len = str.length(); //4
//
//        for (int i = len-1; i>=0; i--) // 3 2 1 0
//        {
//            rev = rev+str.charAt(i); // D C B A
//        }
//        System.out.println("Reversed string is:" + rev);

        //2. Using character array
//        char a[]=str.toCharArray();
//        int len = a.length; //4
//
//        for (int i=len-1;i>=0;i--) //3 2 1 0 -1
//        {
//            rev = rev+a[i]; //D C B A
//        }
//        System.out.println("Reversed string is:" + rev);

        //3. Using string buffer class
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
