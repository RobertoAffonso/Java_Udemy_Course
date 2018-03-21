package com.roberto;

import java.util.ArrayList;

/**
 * @author Roberto Affonso, created on 28/12/17
 **/

public class GroceryList
{
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String groceryItem)
    {
        groceryList.add(groceryItem);
    }

    public ArrayList<String> getGroceryList()
    {
        return groceryList;
    }

    public void printGroceryList()
    {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for(int i = 0; i < groceryList.size(); i++)
        {
            System.out.println("Item Number: " + (i + 1) + "\r" + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem)
    {
        int position = findItem(currentItem);

        if(position >= 0)
        {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem)
    {

        groceryList.set(position, newItem);
        System.out.println("Grocery Item: " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item)
    {
        int position = findItem(item);

        if(position >= 0)
        {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position)
    {
        groceryList.remove(position - 1);
    }

    private int findItem(String searchItem)
    {
//        boolean exists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem)
    {
        int position = findItem(searchItem);
        if(position >= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
