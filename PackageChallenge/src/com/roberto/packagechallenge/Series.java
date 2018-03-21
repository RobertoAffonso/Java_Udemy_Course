package com.roberto.packagechallenge;

/**
 * @author Roberto Affonso, created on 04/01/18
 **/

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        int i = 0;
        while(i <= n) {
            sum += i;
            System.out.println("" + sum);
            i++;
        }

        return sum;
    }

    public static int factorial(int n){
        //(n - 1) * n
        int[] factorialArray = new int[n];
        int factorial = 0;
        if(n == 1){
            factorialArray[n - 1] = 1;
            System.out.println("" + factorialArray[n - 1]);
        }
        else{
            factorialArray[0] = 1;
            System.out.println("" + factorialArray[0]);
            for(int i = 1; i < factorialArray.length; i++){
                factorialArray[i] = i;
                factorialArray[i] *= factorialArray[i - 1];
                System.out.println("" + factorialArray[i]);
            }
        }
        return factorial;
    }

    public static void fibonacci(int n) {
        int[] fibonacciNumbers = new int[n];
        int fibonacci = 0;
        if(n == 1 ) {
            fibonacciNumbers[0] = 0;
        }
        else if(n == 2) {
            fibonacciNumbers[0] = 0;
            fibonacciNumbers[1] = 1;
        }
        else {
            fibonacciNumbers[0] = 0;
            System.out.println("" + fibonacciNumbers[0]);
            fibonacciNumbers[1] = 1;
            System.out.println("" + fibonacciNumbers[1]);

            for(int i = 2; i < fibonacciNumbers.length; i++) {
                fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
                System.out.println("" + fibonacciNumbers[i]);
            }
        }
    }
}
