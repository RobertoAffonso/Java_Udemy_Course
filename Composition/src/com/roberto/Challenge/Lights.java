package com.roberto.Challenge;

/**
 * @author Roberto Affonso, created on 21/12/17
 **/

public class Lights
{
    private boolean on;
    private String type;

    public Lights(String type)
    {
        this.type = type;
    }

    public void turnOn()
    {
        setIsOn(true);
        System.out.println("Lights currently on");
    }

    public void turnOff()
    {
        setIsOn(false);
        System.out.println("Lights currently off");
    }

    public String getType()
    {
        return type;
    }

    public boolean isOn()
    {
        return on;
    }

    public void setIsOn(Boolean status)
    {
        this.on = status;
    }
}
