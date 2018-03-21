package com.roberto.challenge;

/**
 * @author Roberto Affonso
 **/

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car(4, 4, "Red", "Land", 4, 1, true, "Gasoline" );
        car.increaseSpeed(50);
        car.changeGears("Third");
        car.brake();

        DeLorean brown = new DeLorean(4, 4, "White", "Air and Land", 4,
                1, false, "Plutonium", "1930", 1);
        brown.startFluxCapacitor(true);
        brown.timeTravel(brown.startFluxCapacitor(true), 1886);


    }
}
