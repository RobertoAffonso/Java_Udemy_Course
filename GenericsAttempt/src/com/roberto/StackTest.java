package com.roberto;

import java.util.EmptyStackException;

/**
 * @author Roberto Affonso, created on 16/01/18
 **/

public class StackTest
{
    public static void main(String[] args)
    {
        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Stack<Double> doubleStack = new Stack<Double>(5);
        Stack<Integer> integerStack = new Stack<Integer>();

        testPushDouble(doubleStack, doubleElements);
        testPopDouble(doubleStack);

        testPushInteger(integerStack, integerElements);
        testPopInteger(integerStack);
    }

    private static void testPushDouble(Stack<Double> doubleStack, double[] doubleElements)
    {
        System.out.println("\nPushing elements onto doubleStack");

        for(double value : doubleElements)
        {
            System.out.printf("%.1f", value);
            doubleStack.push(value);
        }
    }

    private static void testPopDouble(Stack<Double> doubleStack)
    {
        try
        {
            System.out.println("\nPopping elements from doubleStack");
            double popValue;

            while(true)
            {
                popValue = doubleStack.pop();
                System.out.printf("%.1f", popValue);
            }
        }
        catch (EmptyStackException ex)
        {
            System.err.println();
            ex.printStackTrace();
        }
    }

    private static void testPushInteger(Stack<Integer> intStack, int[] intElements)
    {
        System.out.println("\nPushing elements onto integerStack");

        for(int value : intElements)
        {
            System.out.printf("%d", value);
            intStack.push(value);
        }
    }

    private static void testPopInteger(Stack<Integer> intStack)
    {
        try
        {
            System.out.println("\nPopping all values from intStack");
            int popValue;
            while (true)
            {
                popValue = intStack.pop();
                System.out.printf("%d", popValue);
            }
        }
        catch (EmptyStackException ex)
        {
            System.err.println();
            ex.printStackTrace();
        }
    }


}
