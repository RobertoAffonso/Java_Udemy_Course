package com.roberto;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        Dimensions dimensions = new Dimensions(200, 800, 100);
        Case theCase = new Case("1200X", "Antec", "240x", dimensions);
        Monitor monitor = new Monitor("23MXWD", "LG", 23, new Resolution(1920, 1080));
        Motherboard motherboard = new Motherboard("X99", "ASUS", 8, 8, "2.74");

        PC myPC = new PC(theCase, monitor, motherboard);

        myPC.PowerUP();
    }
}
