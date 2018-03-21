package com.roberto;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
//	    Integer[] integerArray = {1, 2, 3, 4, 5, 6};
//	    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
//	    Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
//
//        System.out.println("Array integerArray contains:");
//        printArray(integerArray);
//
//        System.out.println("\nArray doubleArray contains:");
//        printArray(doubleArray);
//
//        System.out.println("\nArray characterArray contains:");
//        printArray(characterArray);
        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5,
                maximum(3, 4 ,5));

        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
                maximum(6.6, 8.8, 7.7));

        System.out.printf("Maximum of %s, %s and %s is %s\n", "orange", "apple", "pear",
                maximum("orange", "apple", "pear"));
    }

    public static <T> void printArray(T[] inputArray)
    {
        for(T element : inputArray)
        {
            System.out.printf("%s ", element);
        }

        System.out.println();
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        T max = x;
        if(y.compareTo(max) > 0)
        {
            max = y;
        }
        if(z.compareTo(max) > 0)
        {
            max = z;
        }
        return max;
    }
}
