package com.roberto.Challenge;

import java.util.ArrayList;

/**
 * @author Roberto Affonso, created on 29/12/17
 **/

public class Customer
{
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount)
    {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransactions(initialAmount);
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Double> getTransactions()
    {
        return transactions;
    }

    public void addTransactions(Double transaction){
        transactions.add(transaction);
    }
}
