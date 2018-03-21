package com.roberto;

import java.util.ArrayList;

/**
 * @author Roberto Affonso, created on 17/01/18
 **/

public class WildcardTest
{
    public static void main(String[] args)
    {
        Integer[] integers = {1, 2, 3, 4, 5};
        ArrayList<Integer> integerList = new ArrayList<>();

        for(Integer integer : integers){
            integerList.add(integer);
        }

        System.out.printf("integerList contains %s\n", integerList);
        System.out.println("sum of all integerList items: " + sum(integerList));

        Double[] doubles = {1.1, 3.3, 5.5};
        ArrayList<Double> doubleList = new ArrayList<>();

        for(Double element: doubles){
            doubleList.add(element);
        }

        System.out.printf("doubleList contains %s\n", doubleList);
        System.out.println("sum of all doubleList items: " + sum(doubleList));

        Number[] numbers = {1, 2.4, 3, 4.1};
        ArrayList<Number> numberList = new ArrayList<>();

        for(Number number : numbers){
            numberList.add(number);
        }

        System.out.printf("numberList containts %s\n", numberList);
        System.out.println("sum of all numberList items: " + sum(numberList));
    }

    public static double sum(ArrayList<? extends Number> list){
        double total = 0;

        for(Number element : list){
            total += element.doubleValue();

        }
            return total;
    }
}
