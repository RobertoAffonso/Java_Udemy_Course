package com.roberto;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Roberto", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);
        intList.add(7);

        for(int i = 0; i < intList.size(); i++){
            System.out.println("i" + " : " + intList.get(i));
        }
        intList.add(1, 8);

        for(int i = 0; i < intList.size(); i++){
            System.out.println("i" + " : " + intList.get(i));
        }

    }
}
