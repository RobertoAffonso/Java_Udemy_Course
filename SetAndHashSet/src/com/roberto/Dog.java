package com.roberto;

/**
 * @author Roberto Affonso, created on 12/03/18
 **/

public class Dog
{
    private final String name;

    public Dog(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public final boolean equals(Object obj)
    {
        if(this.getClass() != obj.getClass())
        {
            return true;
        }
        if(obj instanceof Dog)
        {
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }
}
