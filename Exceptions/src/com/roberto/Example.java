package com.roberto;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Roberto Affonso, created on 23/01/18
 **/

public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide(){
        int x, y;
        try {
            x = getInt();
            y = getInt();
        }
        catch (NoSuchElementException e){
            throw new ArithmeticException("Invalid input");
        }
        System.out.println("X is: " + x + " , Y is: " + y);
        try {
            return x / y;
        }
        catch (ArithmeticException e){
            throw new ArithmeticException("Attempt to divide by zero");
        }
    }

    private static int getInt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an Integer: ");
        while(true){
            try {
                return input.nextInt();
            }
            catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Please enter a number between 0 and 9: ");
            }
        }
    }
}
