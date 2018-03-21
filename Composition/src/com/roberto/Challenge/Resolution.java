package com.roberto.Challenge;

/**
 * @author Roberto Affonso, created on 21/12/17
 **/

public class Resolution
{
    private int height;
    private int width;
    private int refreshRate;

    public Resolution(int height, int width, int refreshRate)
    {
        this.height = height;
        this.width = width;
        this.refreshRate = refreshRate;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getRefreshRate()
    {
        return refreshRate;
    }
}
