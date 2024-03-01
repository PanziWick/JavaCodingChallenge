package org.example.Classes;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {

        //Approach1: Using FileReader and BuffereReader

//        FileReader fr = new FileReader("C:\\Users\\Panzi\\Desktop\\Testing.txt");
//        BufferedReader br = new BufferedReader(fr);
//
//        String str;
//
//        while ((str = br.readLine()) != null)
//        {
//            System.out.println(str);
//        }
//        br.close();

        //Approach2: Using Scanner and File

//        File file = new File("C:\\Users\\Panzi\\Desktop\\Testing.txt");
//
//        Scanner scanner = new Scanner(file);
//
//        //loop statement
//        while (scanner.hasNextLine())
//        {
//            System.out.println(scanner.nextLine());
//        }

        //Approach3

        File file = new File("C:\\Users\\Panzi\\Desktop\\Testing.txt");

        Scanner scanner = new Scanner(file);

        scanner.useDelimiter("\\Z");

        System.out.println(scanner.next());
    }
}
