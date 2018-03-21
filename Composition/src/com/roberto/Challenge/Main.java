package com.roberto.Challenge;

/**
 * @author Roberto Affonso, created on 21/12/17
 **/

public class Main
{
    public static void main(String[] args)
    {
        Dimensions dimensions = new Dimensions(2000, 800, 100);
        Doors door = new Doors("Brown", "Alder", dimensions);
        GameConsole console = new GameConsole("Xbox 360", "Microsoft", "White");
        Lights light = new Lights("LED");
        Resolution resolution = new Resolution(1920, 1080, 60);
        TV tv = new TV(dimensions, "BRAVIA BV3546", "Sony", resolution);
        Windows window = new Windows(new Dimensions(800, 600, 20), "Glass", "White",
                "Tempered");

        Room room = new Room(light, dimensions, window, door, tv, console);

        room.enterRoom();

    }
}
