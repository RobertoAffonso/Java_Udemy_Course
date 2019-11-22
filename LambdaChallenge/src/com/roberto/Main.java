package com.roberto;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
	    // Challenge #1
        challenge1();

        // Challenge #2
        challenge2();

        // Challenge #3
        challenge3(createEverySecondCharFunc());

        challenge6();


    }

    // Challenge #1
    private static void challenge1() {
        Runnable runnable = () -> {
          String myString = "Let's split this up into an array";
          String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        runnable.run();
    }

    // Challenge #2
    private static void challenge2(){
        everySecondChar();
    }

    private static void everySecondChar() {
        Function<String, String> everySecondChar = createEverySecondCharFunc();
        System.out.println(everySecondChar.apply("1234567890"));
    }

    private static Function<String, String> createEverySecondCharFunc() {
        return source -> {
                StringBuilder returnVal = new StringBuilder();
                for(int i = 0; i < source.length(); i++){
                    if(i % 2 == 1){
                        returnVal.append(source.charAt(i));
                    }
                }
                return returnVal.toString();
            };
    }

    //Challenge #3
    private static void challenge3(Function<String, String> function){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String value: ");
        String value = input.nextLine();
        System.out.println(function.apply(value));
    }

    //Challenge #6
    private static void challenge6(){
        Supplier<String> iLoveJava = () -> "I love Java!";

        //Challenge 7
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }


}
