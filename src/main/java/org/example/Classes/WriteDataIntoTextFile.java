package org.example.Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("C:\\Users\\Panzi\\Desktop\\TutorialTesting.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Getting Start with Java");
        bw.write("Getting Start with Spring-Boot");

        System.out.println("Finished !!");

        bw.close();
    }
}
