package org.example.Classes;

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        String s = "Java Programming Java OOP";

        int totalcount = s.length(); //total length 5

        int totalcount_afterremove = s.replace("J","").length();    //total length after removing a's

        int count = totalcount-totalcount_afterremove;

        System.out.println("Number of occurrences is: " + count);
    }
}
