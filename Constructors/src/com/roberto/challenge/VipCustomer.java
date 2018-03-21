package com.roberto.challenge;

public class VipCustomer
{
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer()
    {
        this("Default Vip Name", 25000, "Default Vip Email");
    }

    public VipCustomer(String name, double creditLimit)
    {
        this(name, creditLimit, "Default Vip Email");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit, String email)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Name: " + getName() + " Credit: " + getCreditLimit() + " Email: " + getEmail());
        System.out.println("");
    }

    public String getName()
    {
        return name;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }

    public String getEmail()
    {
        return email;
    }

}
