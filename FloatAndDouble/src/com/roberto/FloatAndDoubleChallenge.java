package com.roberto;

import java.util.Scanner;

public class FloatAndDoubleChallenge
{
    public static void main(String args[])
    {
        double numberPounds;
        double numberKilograms;
        double kilogram = 0.45359237d;

        Scanner input = new Scanner(System.in);
        System.out.println("This program converts pounds to kilograms");
        System.out.println("Please enter a number in pounds: ");
        numberPounds = input.nextInt();

        numberKilograms = (numberPounds * kilogram);

        System.out.println("");
        System.out.println("Entered Number in pounds: " + numberPounds) ;
        System.out.println("Result in Kilograms: " + numberKilograms);
    }
}
