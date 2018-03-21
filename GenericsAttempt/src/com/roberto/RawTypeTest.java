package com.roberto;

import java.util.EmptyStackException;

/**
 * @author Roberto Affonso, created on 16/01/18
 **/

public class RawTypeTest
{
    public static void main(String[] args)
    {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        Stack<Integer> integerStack = new Stack<>();
        Stack rawTypeStack1 = new Stack(5);
        Stack rawTypeStack2 = new Stack<Double>(5);

        testPush("rawTypeStack", rawTypeStack1, doubleArray);
        testPop("rawTypeStack", rawTypeStack1);
        testPush("rawTypeStack2", rawTypeStack2, doubleArray);
        testPop("rawTypeStack2", rawTypeStack2);
        testPush("integerStack", integerStack, intArray);
        testPop("integerStack", integerStack);
    }

    private static <T> void testPush(String name, Stack<T> stack, T[] elements)
    {
        System.out.println("\nPushing elements onto " + name);

        for (T element : elements)
        {
            System.out.println(element);
            stack.push(element);
        }
    }

    private static <T> void testPop(String name, Stack<T> stack)
    {
        System.out.println("\nPopping elements from " + name);
        T popValue;

        try
        {
            while(true)
            {
                popValue = stack.pop();
                System.out.println(popValue);
            }
        }
        catch (EmptyStackException ex)
        {
            System.err.println();
            ex.printStackTrace();
        }
    }
}
