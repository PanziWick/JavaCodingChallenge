package org.example.Classes;

public class MaxAndMinElementsInArray {
    public static void main(String[] args) {
//        int a[] = {50,30,40,20,60};
//
//        int max = a[0]; //50
//
//        for (int i=1; i<a.length; i++) //2 3 4
//        {
//            if (a[i]>max) //30>50   40>50   20>50   60>50
//            {
//                max = a[i]; //50 60
//            }
//        }
//        System.out.println("Maximum element in array is: "+max);

        int b[] = {50,100,40,20,60};

        int min = b[0];

        for (int i=1; i<b.length; i++) //2 3 4 5
        {
            if (b[i]<min) //100<50   40<50   20<40   60<20
            {
                min = b[i]; //40    20
            }
        }
        System.out.println("Minimum element in array is: "+min);
    }
}
