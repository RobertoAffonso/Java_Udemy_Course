package com.roberto.Challenge;

/**
 * @author Roberto Affonso, created on 21/12/17
 **/

public class GameConsole
{
    private String model;
    private String manufacturer;
    private String color;

    public GameConsole(String model, String manufacturer, String color)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public void powerOn()
    {
        System.out.println("Game console powering on...");
    }

    public void loadGame(String game)
    {
        System.out.println("Loading " + game + "...");
    }

    public String getModel()
    {
        return model;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public String getColor()
    {
        return color;
    }
}
