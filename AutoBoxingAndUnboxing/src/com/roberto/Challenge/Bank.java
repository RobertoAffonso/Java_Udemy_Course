package com.roberto.Challenge;

import java.util.ArrayList;

/**
 * @author Roberto Affonso, created on 29/12/17
 **/

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchesList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchesList = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
//        Branch checkedBranch = findCustomer(name);
        if (findBranch(name) == null) {
            this.branchesList.add(new Branch(name));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerToBranch(customerName, amount);
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addTransaction(customerName, amount);
        }

        return false;
    }

    public Branch findBranch(String branchName) {
        for (int i = 0; i < branchesList.size(); i++) {
            Branch checkedBranch = this.branchesList.get(i);
            if (checkedBranch.getName() == branchName) {
                return checkedBranch;
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Customers for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");

                if (showTransactions) {
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();

                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }

                }
            }
            return true;
        }
        else{
            return false;
        }
    }
}
