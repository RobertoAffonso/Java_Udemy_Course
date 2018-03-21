package com.roberto.Challenge;

/**
 * @author Roberto Affonso, created on 21/12/17
 **/

public class Doors
{
    private String color;
    private String material;
    private Dimensions dimensions;
    private boolean status;

    public Doors(String color, String material, Dimensions dimensions)
    {
        this.color = color;
        this.material = material;
        this.dimensions = dimensions;
    }

    public void open()
    {
        setStatus(true);
        System.out.println("The door is now open");
    }

    public void close()
    {
        setStatus(false);
        System.out.println("The door is now closed");
    }

    public String getColor()
    {
        return color;
    }

    public String getMaterial()
    {
        return material;
    }

    public Dimensions getDimensions()
    {
        return dimensions;
    }

    public boolean getStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }
}
