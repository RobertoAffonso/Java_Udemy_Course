package com.roberto;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");

        System.out.println("Model is: " + porsche.getModel());
    }
}
