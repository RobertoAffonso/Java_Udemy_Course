package com.roberto;

/**
 * @author Roberto Affonso, created on 11/01/18
 **/

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, Breathe out, repeat....");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
