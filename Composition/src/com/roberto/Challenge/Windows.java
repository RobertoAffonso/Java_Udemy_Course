package com.roberto.Challenge;

/**
 * @author Roberto Affonso, created on 21/12/17
 **/

public class Windows
{
    private Dimensions dimensions;
    private String material;
    private String color;
    private String glassType;
    private boolean status;

    public Windows(Dimensions dimensions, String material, String color, String glassType)
    {
        this.dimensions = dimensions;
        this.material = material;
        this.color = color;
        this.glassType = glassType;
    }

    public void open()
    {
        setStatus(true);
        System.out.println("Window is now open");
    }

    public void close()
    {
        setStatus(false);
        System.out.println("Window is now closed");
    }

    public Dimensions getDimensions()
    {
        return dimensions;
    }

    public String getMaterial()
    {
        return material;
    }

    public String getColor()
    {
        return color;
    }

    public String getGlassType()
    {
        return glassType;
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
