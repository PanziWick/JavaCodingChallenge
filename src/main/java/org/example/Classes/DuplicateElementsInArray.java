package org.example.Classes;

import java.util.HashSet;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        String arr[] = {"Java","C","C++","Python","Java"};

        //Approach1

//        boolean flag = false;
//        for (int i=0; i<arr.length; i++)
//        {
//            for (int j=i+1;j<arr.length;j++)
//            {
//                if (arr[i] == arr[j])
//                {
//                    System.out.println("Found Duplicate Elements: "+arr[i]);
//                    flag = true;
//                }
//            }
//        }
//        if (flag == false)
//        {
//            System.out.println("Duplicate Element Not Found");
//        }

        //Approach2: HashSet

        HashSet <String>langs = new HashSet<>();

//        System.out.println(langs.add("Java"));
//        System.out.println(langs.add("Python"));
//        System.out.println(langs.add("Java"));

        boolean flag = false;
        for (String l:arr)
        {
            if (langs.add(l) == false)
            {
                System.out.println("Found Duplicate Element: "+l);
                flag = true;
            }
        }
        if (flag == false)
        {
            System.out.println("Not Found Duplicates");
        }
    }
}
