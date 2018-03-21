package com.roberto.Challenge;



/**
 * @author Roberto Affonso, created on 21/12/17
 **/

public class TV
{
    private Dimensions dimensions;
    private String model;
    private String manufacturer;
    private Resolution resolution;

    public TV(Dimensions dimensions, String model, String manufacturer, Resolution resolution)
    {
        this.dimensions = dimensions;
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }

    public void powerOn()
    {
        System.out.println("TV is now powered on");
    }

    public void drawImage(int x, int y)
    {
        System.out.println("Drawing image at " + x + ", " + y);
    }
}
