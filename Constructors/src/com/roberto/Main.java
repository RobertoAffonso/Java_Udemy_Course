package com.roberto;

import com.roberto.challenge.VipCustomer;

public class Main {

    public static void main(String[] args)
    {
	    BankAccount account1 = new BankAccount("123456", 5000, "John", "(061) +61 9999-8888", "John@gmail.com");
	    account1.deposit(1000);
	    account1.withdrawal(550);
	    System.out.println("Current account balance: " + account1.getBalance());
	    System.out.println("\n");

	    BankAccount account2 = new BankAccount("Jane", "Jane@gmail.com", "(061) +61 8888-7777");
	    account2.deposit(500);
	    account2.withdrawal(3000);
	    System.out.println("Current account balance: " + account2.getBalance());
		System.out.println("\n");

	    BankAccount account3 = new BankAccount();
	    account3.deposit(200);
	    account3.withdrawal(1300);
	    System.out.println("Current account balance: " + account3.getBalance());
		System.out.println("\n");

		BankAccount account4 = new BankAccount();
		account4.deposit(0);
		System.out.println("Current account balance " + account4.getBalance());
		System.out.println("\n");

		VipCustomer vip1 = new VipCustomer();

		VipCustomer vip2 = new VipCustomer("Duke", 80000);

		VipCustomer vip3 = new VipCustomer("Roberto", 100000, "Roberto@Gmail.com");

    }
}
