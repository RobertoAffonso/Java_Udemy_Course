package com.roberto.Challenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Roberto Affonso, created on 27/12/17
 **/

public class Main
{
    private Scanner input;

    public static void main(String[] args)
    {
        printArray(sortIntegers(getIntegers(8)));
    }

    public static int[] getIntegers(int total)
    {
        Scanner input = new Scanner(System.in);
        int[] mainArray = new int[total];
        System.out.println("Please enter a total of " + total + " integers");

        for(int i = 0; i < mainArray.length; i++)
        {
            mainArray[i] = input.nextInt();
        }
        return mainArray;
    }

    public static int[] sortIntegers(int[] mainArray)
    {
        for(int i = 0; i < mainArray.length; i++)
        {
            for(int j = 0; j < mainArray.length - 1; j++)
            {
                if(mainArray[j] < mainArray[j+1])
                {
                    int x = mainArray[j];
                    mainArray[j] = mainArray[j+1];
                    mainArray[j+1] = x;
                }
            }
        }
        return mainArray;
    }

    public static int[] printArray(int[] mainArray)
    {
        System.out.println("Sorted Array: " + Arrays.toString(mainArray));
        return mainArray;
    }
}
