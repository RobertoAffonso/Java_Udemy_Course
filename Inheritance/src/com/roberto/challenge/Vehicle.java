package com.roberto.challenge;

/**
 * @author Roberto Affonso
 **/

public class Vehicle
{
    private int passengerCapacity;
    private int seats;
    private int currentSpeed;
    private String color;
    private String vehicleType;

    public Vehicle(int passengerCapacity, int currentSpeed, int seats, String color, String vehicleType)
    {
        this.currentSpeed = 0;
        this.passengerCapacity = passengerCapacity;
        this.currentSpeed = currentSpeed;
        this.seats = seats;
        this.color = color;
        this.vehicleType = vehicleType;
    }

    public void Steering(String direction)
    {
        System.out.println("Vehicle is steering to the " + direction);
    }


    public void move(int speed)
    {
        System.out.println("Vehicle is moving at " + speed);

        if(speed == 0)
        {
            System.out.println("Vehicle has stopped");
        }
    }

    public int getCurrentSpeed()
    {
        return currentSpeed;
    }

    public int getPassengerCapacity()
    {
        return passengerCapacity;
    }

    public int getSeats()
    {
        return seats;
    }

    public String getColor()
    {
        return color;
    }

    public String getVehicleType()
    {
        return vehicleType;
    }
}
