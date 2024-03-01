package org.example.Classes;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {
    public static void main(String[] args) {
        //Approach1 - Random
//        Random random = new Random();

//        int rand_int = random.nextInt(10);
//        System.out.println(rand_int);

//        double rand_dbl = random.nextDouble();
//        System.out.println(rand_dbl);

        //Approach2 - Math
//        System.out.println(Math.random());

        //Approach3 - Apache commons-lang API
//        String randomNum =  RandomStringUtils.randomNumeric(5);
//        System.out.println(randomNum);

        String randomStr = RandomStringUtils.randomAlphanumeric(5);
        System.out.println(randomStr);
    }
}
