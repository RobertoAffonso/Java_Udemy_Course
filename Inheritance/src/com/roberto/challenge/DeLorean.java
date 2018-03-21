package com.roberto.challenge;

/**
 * @author Roberto Affonso
 **/

public class DeLorean extends Car
{
    private String timeTravel;

    private int fluxCapacitor;

    public DeLorean(int currentSpeed, int passengerCapacity, int seats, String color, String vehicleType, int wheels,
                    int engine, Boolean automatic, String fuel, String timeTravel, int fluxCapacitor)
    {
        super(currentSpeed, passengerCapacity, seats, color, vehicleType, wheels, engine, automatic, fuel);
        this.timeTravel = timeTravel;
        this.fluxCapacitor = fluxCapacitor;
    }

    public void timeTravel(Boolean startFluxCapacitor, int time)
    {
        if(startFluxCapacitor == true)
        {
            System.out.println("Flux Capacitor Ready");
            System.out.println("Preparing to travel to " + time);
            System.out.println("Traveling....");
            super.move(500);
            super.changeGears("Fifth");
        }
        else
        {
            System.out.println("Flux capacitor not ready");
        }
    }

    public boolean startFluxCapacitor(Boolean start)
    {
        if(start == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
