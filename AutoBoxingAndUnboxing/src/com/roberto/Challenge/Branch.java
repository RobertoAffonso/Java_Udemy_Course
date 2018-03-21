package com.roberto.Challenge;

import java.util.ArrayList;

/**
 * @author Roberto Affonso, created on 29/12/17
 **/

public class Branch
{
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void printCustomers() {
        for(Customer customer : customers){
            System.out.println("" + customer);
        }
    }

    public boolean addCustomerToBranch(String name, double initial) {
        Customer customer = new Customer(name, initial);
        if(findCustomer(name) == null) {
            this.customers.add(new Customer(name, initial));
            return true;
        }

        return false;
    }

    public boolean addTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransactions(amount);
            return true;
        }

        return false;
    }

    public Customer findCustomer(String customerName){
        for (int i = 0; i < customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }

        return null;
    }
}
