package org.example.Classes;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {

        String str = "Converting caffeine  into   code";

        System.out.println("Before removing the white spaces: " + str);

        str=str.replaceAll("\\s", "");

        System.out.println("After removing the white spaces: " + str);
    }
}
