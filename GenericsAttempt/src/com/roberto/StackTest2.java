package com.roberto;

import java.io.Serializable;
import java.util.EmptyStackException;

/**
 * @author Roberto Affonso, created on 16/01/18
 **/

public class StackTest2
{
    public static void main(String[] args)
    {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        Stack<Integer> integerStack = new Stack<>();
        Stack<Double> doubleStack = new Stack<>(5);

        Stack rawTypeStack1 = new Stack(5);
        Stack rawTypeStack2 = new Stack<Double>(5);

        testPush("rawTypeStack", rawTypeStack1, doubleArray);
        testPop("rawTypeStack", rawTypeStack1);
        testPush("rawTypeStack2", rawTypeStack2, doubleArray);
        testPop("rawTypeStack2", rawTypeStack2);
        testPush("integerStack", integerStack, intArray);
        testPop("integerStack", integerStack);



//
//        testPop("integerStack", integerStack);
//        testPush("integerStack", integerStack, intArray);
//
//        testPop("doubleStack", doubleStack);
//        testPush("doubleStack", doubleStack, doubleArray);

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
