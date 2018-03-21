package com.roberto;

public class BankAccount
{
    private String customerName;
    private String email;
    private String accountNumber;
    private String phoneNumber;
    private double balance;

    public BankAccount()
    {
        //Calling a default constructor
        this("12345", 2500, "Default name", "Default phone number", "Default email");
    }
    public BankAccount(String accountNumber, double balance, String customerName, String phoneNumber, String email)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public BankAccount(String customerName, String email, String phoneNumber)
    {
        this("12345", 2000, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double value)
    {
        if(value == 0)
        {
            System.out.println("Please enter a value greater than zero");
        }
        else
        {
            this.balance += value;
            System.out.println("Your new balance is: " + this.balance);
        }
    }

    public void withdrawal(double value)
    {
        if(value > this.balance)
        {
            System.out.println("Insufficient Funds");
        }
        else
        {
            this.balance -= value;
            System.out.println("Your new balance is: " + this.balance);
        }
    }
}
