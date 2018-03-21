package com.roberto.Challenge;

import java.util.Scanner;

/**
 * @author Roberto Affonso, created on 28/12/17
 **/

public class Main
{
    private static Scanner input = new Scanner(System.in);
    private static ContactsList contactsList = new ContactsList();

    public static void main(String[] args)
    {
        int choice;
        boolean quit = false;


        while(!quit)
        {
            System.out.println("Enter your choice: ");
            printOptions();
            choice = input.nextInt();

            switch (choice)
            {
                case 1:
                    printContacts();
                    break;

                case 2:
                    addContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    findContact();
                    break;

                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printOptions()
    {
        System.out.println("\nOptions");
        System.out.println("\t1 - Print list of contacts");
        System.out.println("\t2 - Add new contact");
        System.out.println("\t3 - Update existing contact");
        System.out.println("\t4 - Remove contact");
        System.out.println("\t5 - Search for an existing contact");
        System.out.println("\t6 - Quit program");
    }

    public static void printContacts()
    {
        contactsList.printContactList();
    }

    public static void addContact()
    {

        System.out.println("Please enter the contact's name: ");
        String name = input.next();

        System.out.println("Please enter the contact's number: ");
        String number = input.next();

        contactsList.addContact(name, number);
    }

    public static void updateContact()
    {
        System.out.println("Please enter the name of the contact that you wish to update: ");
        String name = input.next();

        System.out.println("Please enter the new name: ");
        String replacementName = input.next();

        System.out.println("Please enter the new number: ");
        String replacementNumber = input.next();

        contactsList.updateContact(name, replacementName, replacementNumber);
    }

    public static void removeContact()
    {
        System.out.println("Please enter the name of the contact that you wish to remove");
        String name = input.next();
        contactsList.deleteContact(name);
    }

    public static void findContact()
    {
        System.out.println("Name of the contact to search for: ");
        String name = input.next();

//        Contact foundContact = new Contact(name, number);

        if(contactsList.onArrayList(name))
        {
            System.out.println("Contact " + name + " found in the arraylist");
        }
        else
        {
            System.out.println("Contact not found");
        }
    }

}
