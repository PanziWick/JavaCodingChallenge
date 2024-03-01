package org.example.Classes;

public class ReverseEachWordInAString {
    public static void main(String[] args) {

        //Approach1
//        String str = "Welcome To Java"; //original string
//
//        String[] words = str.split(" ");    //splitting string into words
//
//        String reverseString = "";
//
//        for (String w:words) //Welcome  //To    //Java
//        {
//            String reverseword = "";
//
//            for (int i = w.length()-1; i>=0; i--) //Welcome //To    //Java
//            {
//                reverseword = reverseword + w.charAt(i);
//            }
//            reverseString = reverseString + reverseword+" "; //emocleW  oT  avaJ
//        }
//        System.out.println(reverseString);

        //Approach2

        String str = "Welcome To Java";

        String[] words = str.split("\\s");

        String reverseword = "";

        for (String w:words)    //Welcome   //To    //Java
        {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();   //emocleW   //oT    //avaJ

            reverseword = reverseword+sb.toString()+" ";    //emocleW   //oT    //avaJ
        }
        System.out.println(reverseword);
    }
}
