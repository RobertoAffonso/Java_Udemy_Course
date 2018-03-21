package com.roberto.Challenge;

import java.util.ArrayList;

/**
 * @author Roberto Affonso, created on 29/12/17
 **/

public class ContactsList
{
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public boolean addContact(String contactName, String contactNumber)
    {
        if(findItem(contactName) >= 0)
        {
            System.out.println("Contact already exists.");
            return false;
        }

        contacts.add(new Contact(contactName, contactNumber));
        return true;
    }

    public void deleteContact(String contactName)
    {
        int position = findItem(contactName);
        contacts.remove(position);
    }

    public void updateContact(String name, String replacementName, String replacementNumber)
    {
        int position = findItem(name);
        contacts.set(position, updateContact(position, replacementName, replacementNumber));
    }

    private Contact updateContact(int position, String replacementName, String replacementNumber)
    {
        Contact contact = contacts.get(position);
        contact.setContactName(replacementName);
        contact.setContactNumber(replacementNumber);
        return contact;
    }

    public void printContactList()
    {
        for(Contact contact : contacts)
        {
            System.out.println(contact.toString());
        }
    }

    public boolean onArrayList(String name)
    {
        int position = findItem(name);

        if(position >= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private int findItem(Contact contact)
    {
        return contacts.indexOf(contact);
    }

    private int findItem(String name)
    {
        int index = -1;

        for (Contact contact : contacts)
        {
            if(contact.getContactName().equals(name))
            {
                index = contacts.indexOf(contact);
            }
        }

        return index;
    }
}
