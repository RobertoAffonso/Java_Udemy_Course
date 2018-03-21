package com.roberto.Challenge;

/**
 * @author Roberto Affonso, created on 28/12/17
 **/

public class Contact
{
    private String contactName;
    private String contactNumber;

    public Contact(String contactName)
    {
        this.contactName = contactName;
    }

    public Contact(String contactName, String contactNumber)
    {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName()
    {
        return contactName;
    }

    public void setContactName(String contactName)
    {
        this.contactName = contactName;
    }

    public String getContactNumber()
    {
        return contactNumber;
    }

    public Contact getContact()
    {
        return this;
    }

    public void setContactNumber(String contactNumber)
    {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString()
    {
        return "Name: " + contactName + " Number: " + contactNumber;
    }
}
