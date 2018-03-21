package com.roberto.challenge;

/**
 * @author Roberto Affonso
 **/

public class Car extends Vehicle
{
    private int wheels;
    private int engine;
    private Boolean automatic;
    private String fuel;

    public Car(int currentSpeed, int passengerCapacity, int seats, String color, String vehicleType, int wheels, int engine, Boolean automatic, String fuel)
    {
        super(currentSpeed, passengerCapacity, seats, color, vehicleType);
        this.wheels = wheels;
        this.engine = engine;
        this.automatic = automatic;
        this.fuel = fuel;
    }

    @Override
    public void move(int speed)
    {
        System.out.println("Wheels turning");
        super.move(speed);
    }

    public void changeGears(String gearPosition)
    {
        System.out.println("Gear is now in the " + gearPosition + " Position");
    }

    public void brake()
    {
        System.out.println("Car is now braking");
        super.move(0);
    }

    public void increaseSpeed(int speed)
    {
        System.out.println("Car is now speeding up");

        super.move(speed);
    }

    public void decreaseSpeed(int speed)
    {
        System.out.println("Car is now slowing down");
        super.move(speed);
    }
}
