package com.roberto;

/**
 * @author Roberto Affonso, created on 12/03/18
 **/

public class Labrador extends Dog
{
    public Labrador(String name)
    {
        super(name);
    }

//    @Override
//    public boolean equals(Object obj)
//    {
//        if(this.getClass() != obj.getClass())
//        {
//            return true;
//        }
//        if(obj instanceof Labrador)
//        {
//            String objName = ((Labrador) obj).getName();
//            return this.getName().equals(objName);
//        }
//        return false;
//    }
}
