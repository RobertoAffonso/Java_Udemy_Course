package com.roberto;

/**
 * @author Roberto Affonso, created on 08/01/18
 **/

public class Customer
{
    private String name;
    private Double balance;

    public Customer(String name, Double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getBalance()
    {
        return balance;
    }

    public void setBalance(Double balance)
    {
        this.balance = balance;
    }
}
