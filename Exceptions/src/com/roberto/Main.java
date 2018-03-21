package com.roberto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = getIntEAFP();
        System.out.println("x is: " + x);
    }

    private static int getInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static int getIntLBYL(){
        Scanner input = new Scanner(System.in);
        Boolean isValid = true;
        System.out.println("Please enter an Integer: ");
        String data = input.next();
        for(int i = 0; i < data.length(); i++){
            if(!Character.isDigit(i)){
                isValid = false;
                break;
            }
        }
        if(isValid = true){
            return Integer.parseInt(data);
        }
        return 0;
    }

    private static int getIntEAFP(){
        Scanner i = new Scanner(System.in);
        System.out.println("Please enter an Integer: ");
        try {
            return i.nextInt();
        }
        catch (InputMismatchException ex){
            return 0;
        }
    }

    private static int divideLBYL(int x, int y) {
        if(y != 0){
            return x/y;
        }
        else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x/y;
        }
        catch (ArithmeticException ex){
            return 0;
        }
    }
}
