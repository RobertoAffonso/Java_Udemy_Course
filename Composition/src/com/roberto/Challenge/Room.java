package com.roberto.Challenge;

/**
 * @author Roberto Affonso, created on 21/12/17
 **/

public class Room
{
    private Lights lights;
    private Dimensions dimensions;
    private Windows windows;
    private Doors doors;
    private TV tv;
    private GameConsole console;


    public Room(Lights lights, Dimensions dimensions, Windows windows, Doors doors, TV tv, GameConsole console)
    {
        this.lights = lights;
        this.dimensions = dimensions;
        this.windows = windows;
        this.doors = doors;
        this.tv = tv;
        this.console = console;
    }

    public void enterRoom()
    {
        doors.open();
        lights.turnOn();
        doors.close();
        tv.powerOn();
        console.powerOn();
        tv.drawImage(1920, 1080);
        console.loadGame("Gears of War");
    }
}
