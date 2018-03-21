package com.roberto;

/**
 * @author Roberto Affonso, created on 11/01/18
 **/

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, Breathe out, repeat...");
    }
}
